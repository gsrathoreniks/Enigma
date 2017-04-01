package rathore.gajendra.enigma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {


    ImageView iv,iv1,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_final);


        iv = (ImageView)findViewById(R.id.ws);
        iv1 = (ImageView)findViewById(R.id.np);
        iv2 = (ImageView)findViewById(R.id.bs);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this,Wildlife.class));
            }
        });



    }
}
