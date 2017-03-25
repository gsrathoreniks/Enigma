package rathore.gajendra.enigma;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15;

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


        cv1=(CardView)findViewById(R.id.cv1);
        cv2=(CardView)findViewById(R.id.cv2);
        cv3=(CardView)findViewById(R.id.cv3);
        cv4=(CardView)findViewById(R.id.cv4);
        cv5=(CardView)findViewById(R.id.cv5);
        cv6=(CardView)findViewById(R.id.cv6);
        cv7=(CardView)findViewById(R.id.cv7);
        cv8=(CardView)findViewById(R.id.cv8);
        cv9=(CardView)findViewById(R.id.cv9);
        cv10=(CardView)findViewById(R.id.cv10);
        cv11=(CardView)findViewById(R.id.cv11);
        cv12=(CardView)findViewById(R.id.cv12);
        cv13=(CardView)findViewById(R.id.cv13);
        cv14=(CardView)findViewById(R.id.cv14);
        cv15=(CardView)findViewById(R.id.cv15);
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);
        img13=(ImageView)findViewById(R.id.img13);
        img14=(ImageView)findViewById(R.id.img14);
        img15=(ImageView)findViewById(R.id.img15);
        //onclick listeners for FAVOURITES
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1[0] ==0){
                    img1.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] =1;
                }
                else{
                    img1.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a1[0] =0;
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2[0] ==0){
                    img2.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] =1;
                }
                else{
                    img2.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a2[0] =0;
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a3[0] ==0){
                    img3.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] =1;
                }
                else{
                    img3.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a3[0] =0;
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4[0] ==0){
                    img4.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] =1;
                }
                else{
                    img4.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a4[0] =0;
                }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a5[0] ==0){
                    img5.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a5[0] =1;
                }
                else{
                    img5.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a5[0] =0;
                }
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a6[0] ==0){
                    img6.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a6[0] =1;
                }
                else{
                    img6.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a6[0] =0;
                }
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a7[0] ==0){
                    img7.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a7[0] =1;
                }
                else{
                    img7.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a7[0] =0;
                }
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a8[0] ==0){
                    img8.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a8[0] =1;
                }
                else{
                    img8.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a8[0] =0;
                }
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a9[0] ==0){
                    img9.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a9[0] =9;
                }
                else{
                    img9.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a9[0] =0;
                }
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a10[0] ==0){
                    img10.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a10[0] =10;
                }
                else{
                    img10.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a10[0] =0;
                }
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a11[0] ==0){
                    img11.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a11[0] =11;
                }
                else{
                    img11.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a11[0] =0;
                }
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a12[0] ==0){
                    img12.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a12[0] =12;
                }
                else{
                    img12.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a12[0] =0;
                }
            }
        });
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a13[0] ==0){
                    img13.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a13[0] =13;
                }
                else{
                    img13.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a13[0] =0;
                }
            }
        });
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a14[0] ==0){
                    img14.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a14[0] =14;
                }
                else{
                    img14.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a14[0] =0;
                }
            }
        });
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a15[0] ==0){
                    img15.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(v, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a15[0] =15;
                }
                else{
                    img15.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(v, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a15[0] =0;
                }
            }
        });
        //ends here
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
                ab.putExtra("name","Jim Corbett National Park");
                startActivity(ab);
            }
        });
        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(HomePage.this,Individual.class);
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

        if (id == R.id.nav_explore) {
            // Handles the Location of the user.
            Intent d = new Intent(this, Weather.class);
            startActivity(d);

        }
        if (id == R.id.nav_profile) {
            // Handles the Location of the user.
            Intent d = new Intent(this, Login.class);
            startActivity(d);
        }
        if (id == R.id.nav_favourites) {
            // Handles the Location of the user.
            Intent d = new Intent(this, profile.class);
            startActivity(d);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
