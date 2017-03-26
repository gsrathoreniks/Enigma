package rathore.gajendra.enigma;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    Button btnRegister;
    Button btnLogin;
    EditText email;
    EditText password;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);
        btnRegister=(Button)findViewById(R.id.btn_reg_link);
        btnLogin=(Button)findViewById(R.id.signin_btn);
        email=(EditText)findViewById(R.id.email_login);
        password=(EditText)findViewById(R.id.pass_login);
        firebaseAuth=FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emails=email.getText().toString();
                String passs=password.getText().toString();
                (firebaseAuth.signInWithEmailAndPassword(emails,passs)).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this, "you're now logged in...!!!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(Login.this, "OOOPssss... something went wrong..!!!!", Toast.LENGTH_SHORT).show();
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
    }
}
