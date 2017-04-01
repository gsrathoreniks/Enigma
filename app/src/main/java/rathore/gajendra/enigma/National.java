package rathore.gajendra.enigma;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class National extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView img111;
    ImageView img222;
    ImageView img333;
    ImageView img444;

    CardView cv111,cv222,cv333,cv444;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final int[] a1 = {0};
        final int[] a2 = {0};
        final int[] a3 = {0};
        final int[] a4 = {0};
        final int[] a5 = {0};
        final int[] a6 = {0};
        final int[] a7 = {0};
        final int[] a8 = {0};
        final int[] a9 = {0};
        final int[] a10 = {0};
        final int[] a11 = {0};
        final int[] a12 = {0};
        final int[] a13 = {0};
        final int[] a14 = {0};
        final int[] a15 = {0};


        cv111=(CardView)findViewById(R.id.cv11);
        cv222=(CardView)findViewById(R.id.cv22);
        cv333=(CardView)findViewById(R.id.cv33);
        cv444=(CardView)findViewById(R.id.cv44);

        img111=(ImageView)findViewById(R.id.img11);
        img222=(ImageView)findViewById(R.id.img22);
        img333=(ImageView)findViewById(R.id.img33);
        img444=(ImageView)findViewById(R.id.img44);



        //onclick listeners for FAVOURITES
        img111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1[0] ==0){
                    img111.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] =1;
                }
                else{
                    img111.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] =0;
                }
            }
        });
        img222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2[0] ==0){
                    img222.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] =1;
                }
                else{
                    img222.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] =0;
                }
            }
        });
        img333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a3[0] ==0){
                    img333.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] =1;
                }
                else{
                    img333.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] =0;
                }
            }
        });
        img444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4[0] ==0){
                    img444.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] =1;
                }
                else{
                    img444.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] =0;
                }
            }
        });



        //ends here
        cv111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(National.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(National.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(National.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(National.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void onProfClick(View v){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        startActivity(new Intent(National.this, profile.class));
    }
    public void onFeedbackClick(View v){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        startActivity(new Intent(National.this, feedback.class));
    }
}
