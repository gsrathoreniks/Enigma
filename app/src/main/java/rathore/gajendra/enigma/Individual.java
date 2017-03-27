package rathore.gajendra.enigma;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Individual extends AppCompatActivity {
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title=getIntent().getExtras().getString("name");
        toolbar.setTitle(title);
        AppBarLayout appBarLayout=(AppBarLayout)findViewById(R.id.app_bar);
        appBarLayout.setBackgroundResource(R.drawable.bs_two);
        setTitle(title);

        final ImageView stars1,stars2,stars3,stars4,stars5;
        stars1=(ImageView)findViewById(R.id.star1);
        stars2=(ImageView)findViewById(R.id.star2);
        stars3=(ImageView)findViewById(R.id.star3);
        stars4=(ImageView)findViewById(R.id.star4);
        stars5=(ImageView)findViewById(R.id.star5);

        stars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
            }
        });
        stars2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
            }
        });
        stars3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star);

            }
        });
        stars4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star);
                stars4.setImageResource(R.drawable.ic_star);
            }
        });
        stars5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star);
                stars4.setImageResource(R.drawable.ic_star);
                stars5.setImageResource(R.drawable.ic_star);
            }
        });

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(a ==0){
                    fab.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(view, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a =15;
                }
                else{
                    fab.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(view, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a =0;
                }
            }
        });
    }
}
