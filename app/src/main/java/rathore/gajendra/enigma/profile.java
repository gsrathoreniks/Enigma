package rathore.gajendra.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class profile extends AppCompatActivity {
    TextView tvEmail;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        firebaseAuth=FirebaseAuth.getInstance();
        tvEmail=(TextView)findViewById(R.id.textViewEmail);

        tvEmail.setText(firebaseAuth.getCurrentUser().getEmail());

    }
}
