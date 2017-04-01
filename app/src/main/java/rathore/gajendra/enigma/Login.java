package rathore.gajendra.enigma;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

//import com.facebook.CallbackManager;
//import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

public class Login extends AppCompatActivity {
    Button btnRegister;
    EditText email;
    EditText password;
    FirebaseAuth firebaseAuth;
    Button LoginBtn;
    ImageView googlebtn;
    ImageView twitterbtn;

    private static final int RC_SIGN_IN=1;
    private GoogleApiClient mGoogleApiClient;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private static final String TAG="MAIL_ACTIVITY";



    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);
        btnRegister=(Button)findViewById(R.id.btn_reg_link);
        LoginBtn=(Button)findViewById(R.id.signin_btn);

        email=(EditText)findViewById(R.id.email_login);
        password=(EditText)findViewById(R.id.pass_login);
        firebaseAuth=FirebaseAuth.getInstance();

        googlebtn=(ImageView)findViewById(R.id.googleBtn);


        googlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String emails=email.getText().toString();
                String passs=password.getText().toString();
                final ProgressDialog progressDialog=ProgressDialog.show(Login.this,"Signing in","Authenticating",true);
                (firebaseAuth.signInWithEmailAndPassword(emails,passs)).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            startActivity(new Intent(Login.this,HomePage.class));
                        }
                        else{
                            email.setText("");
                            password.setText("");
                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,SignUp.class));
            }
        });
        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener(){
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null){
                    startActivity(new Intent(Login.this,HomePage.class));
                }
            }
        };
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(getApplicationContext())
                .enableAutoManage(this, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        Toast.makeText(Login.this, "You got an ERROR", Toast.LENGTH_SHORT).show();
                    }
                })
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

    }
    @Override
    public void onBackPressed() {
        if(a==0){
            Toast.makeText(this, "Press again to Exit !!!", Toast.LENGTH_SHORT).show();
            a=2;
        }
        else
            super.onBackPressed();
    }
    protected void onStart(){
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    private void signIn(){
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent,RC_SIGN_IN);
    }

    public void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode==RC_SIGN_IN){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if(result.isSuccess()){
                GoogleSignInAccount account = result.getSignInAccount();
                firebaseAuthWithGoogle(account);
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {
        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(),null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
                    public void onComplete(@NonNull Task<AuthResult> task){
                        Log.d(TAG,"signInWithCredential:onCoplete:"+task.isSuccessful());
                        if(!task.isSuccessful()){
                            Log.w(TAG,"signInWithCredential",task.getException());
                            Toast.makeText(Login.this,"Authentication Failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


}
