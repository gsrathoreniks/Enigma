package rathore.gajendra.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.formats.NativeAd;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

public class profile extends AppCompatActivity {
    TextView tvEmail;
    TextView tvName;
    ImageView profPik;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        firebaseAuth = FirebaseAuth.getInstance();
        tvEmail = (TextView) findViewById(R.id.textViewEmail);
        tvName = (TextView) findViewById(R.id.textViewName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Profile");

        profPik=(ImageView)findViewById(R.id.profilePik);
        tvEmail.setText(firebaseAuth.getCurrentUser().getEmail());
        tvName.setText(firebaseAuth.getCurrentUser().getDisplayName());
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}