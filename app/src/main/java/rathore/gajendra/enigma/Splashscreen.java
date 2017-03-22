package rathore.gajendra.enigma;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        android.support.v7.app.ActionBar
                AB= getSupportActionBar();
        AB.hide();
        setContentView(R.layout.activity_splashscreen);


/*        ImageView imageView=(ImageView)findViewById(R.id.imageView2);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        imageView.setAnimation(anim);
*/

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, HomePage.class);
                startActivity(i);
            }
        },3500);


    }
}

