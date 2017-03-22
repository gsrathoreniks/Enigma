package rathore.gajendra.enigma;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

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
