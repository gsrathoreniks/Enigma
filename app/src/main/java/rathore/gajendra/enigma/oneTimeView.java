package rathore.gajendra.enigma;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class oneTimeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        android.support.v7.app.ActionBar Ab=getSupportActionBar();
        Ab.hide();
        final Integer[] a = {0};

        setContentView(R.layout.activity_one_time_view);
        Button btnNext;
        btnNext=(Button)findViewById(R.id.btn_next);
        final ImageView mpg1=(ImageView)findViewById(R.id.pg1);
        final ImageView mpg2=(ImageView)findViewById(R.id.pg2);
        final ImageView mpg3=(ImageView)findViewById(R.id.pg3);
        final ImageView mpg4=(ImageView)findViewById(R.id.pg4);
        final ImageView mpg5=(ImageView)findViewById(R.id.pg5);
        final ImageView imgMain;
        imgMain=(ImageView)findViewById(R.id.imageView4);
        final TextView tvMain;
        tvMain=(TextView)findViewById(R.id.textView7);
        final TextView tvMainTags;
        tvMainTags=(TextView)findViewById(R.id.textView9);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a[0] ==0){
                    imgMain.setImageResource(R.drawable.ic_menu_share);
                    tvMain.setText("Share Places");
                    tvMainTags.setText("Share places with loving friends and families ");
                    mpg1.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg2.setImageResource(R.drawable.ic_active_one_time_view);
                    mpg3.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg4.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg5.setImageResource(R.drawable.ic_not_active_one_time_view);

                    a[0]++;

                }
                else if(a[0] ==1){
                    imgMain.setImageResource(R.drawable.ic_favorites);
                    tvMain.setText("Favourites");
                    tvMainTags.setText("Add to Favourites to make them available OFFLINE");
                    a[0]++;
                    mpg1.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg2.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg3.setImageResource(R.drawable.ic_active_one_time_view);
                    mpg4.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg5.setImageResource(R.drawable.ic_not_active_one_time_view);
                }
                else if(a[0] ==2){
                    imgMain.setImageResource(R.drawable.ic_favorites);
                    tvMain.setText("Socio-economic Areas");
                    tvMainTags.setText("Hotels, Restaurants, Cafes, Hospitals, ATMs");
                    a[0]++;
                    mpg1.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg2.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg3.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg4.setImageResource(R.drawable.ic_active_one_time_view);
                    mpg5.setImageResource(R.drawable.ic_not_active_one_time_view);
                }
                else if(a[0] ==3){
                    imgMain.setImageResource(R.drawable.ic_paws);
                    tvMain.setText("Welcome");
                    tvMainTags.setText("Press next to SIGN IN\n");
                    a[0]++;
                    mpg1.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg2.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg3.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg4.setImageResource(R.drawable.ic_not_active_one_time_view);
                    mpg5.setImageResource(R.drawable.ic_active_one_time_view);
                }
                else if(a[0] ==4){
                    startActivity(new Intent(oneTimeView.this,Login.class));
                }
            }
        });
 /*       new Handler().postDelayed(new Runnable() {
            @2Override
            public void run() {
                Intent i = new Intent(oneTimeView.this, Login.class);
                startActivity(i);
                finish();
            }
        }, 5000);
        */
    }
}
