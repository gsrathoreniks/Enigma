package rathore.gajendra.enigma;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.squareup.picasso.Picasso;

import java.util.Iterator;


public class Individual extends AppCompatActivity {
    int a=0;
    ImageView imgHotel;
    ImageView imgCafe;
    ImageView imgHospital;
    ImageView imgRestaurant;
    ImageView imgAtm;
    TextView howThisfeel;
    TextView tv_name;
    TextView tvAbout;
    ImageView imgprofpik;
    FirebaseAuth firebaseAuth;
    DatabaseReference root;
    Context context=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getExtras().getString("name");
        toolbar.setTitle(title);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        appBarLayout.setBackgroundResource(R.drawable.bs_two);
        imgprofpik = (ImageView) findViewById(R.id.profilepikIndividual);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(title);
        firebaseAuth = FirebaseAuth.getInstance();
        howThisfeel = (TextView) findViewById(R.id.howsThis);
        tv_name = (TextView) findViewById(R.id.tv_name_individual);
        tvAbout = (TextView) findViewById(R.id.tv_about);
        tv_name.setText(firebaseAuth.getCurrentUser().getDisplayName());
        final ImageView stars1, stars2, stars3, stars4, stars5;
        stars1 = (ImageView) findViewById(R.id.star1);
        stars2 = (ImageView) findViewById(R.id.star2);
        stars3 = (ImageView) findViewById(R.id.star3);
        stars4 = (ImageView) findViewById(R.id.star4);
        stars5 = (ImageView) findViewById(R.id.star5);


        imgHotel = (ImageView) findViewById(R.id.hotelView);
        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent abc = new Intent(Individual.this, socio_conomic.class);
                abc.putExtra("place", "hotel");
                startActivity(abc);
            }
        });
        imgCafe = (ImageView) findViewById(R.id.cafeVeiw);
        imgCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent abc = new Intent(Individual.this, socio_conomic.class);
                abc.putExtra("place", "cafe");
                startActivity(abc);
            }
        });
        imgHospital = (ImageView) findViewById(R.id.hospitalVeiw);
        imgHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent abc = new Intent(Individual.this, socio_conomic.class);
                abc.putExtra("place", "hospital");
                startActivity(abc);
            }
        });
        imgRestaurant = (ImageView) findViewById(R.id.restraurantVeiw);
        imgRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent abc = new Intent(Individual.this, socio_conomic.class);
                abc.putExtra("place", "restaurant");
                startActivity(abc);
            }
        });
        imgAtm = (ImageView) findViewById(R.id.atmVeiw);
        imgAtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent abc = new Intent(Individual.this, socio_conomic.class);
                abc.putExtra("place", "atm");
                startActivity(abc);
            }
        });
        //Map

        TextView take = (TextView) findViewById(R.id.takemethere);
        final TextView lat = (TextView) findViewById(R.id.e_lat);
        final TextView lng = (TextView) findViewById(R.id.e_lng);

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double lati;
                double log;

                lati = Double.parseDouble(lat.getText().toString());
                log = Double.parseDouble(lng.getText().toString());


                Intent intent = new Intent(getBaseContext(), MapsActivity.class);

                // Passing latitude and longitude to the MapActivity
                intent.putExtra("lat", lati);
                intent.putExtra("lng", log);

                startActivity(intent);


            }
        });

        stars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star_border);
                stars3.setImageResource(R.drawable.ic_star_border);
                stars4.setImageResource(R.drawable.ic_star_border);
                stars5.setImageResource(R.drawable.ic_star_border);
                howThisfeel.setText("Hated it");
            }
        });
        stars2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star_border);
                stars4.setImageResource(R.drawable.ic_star_border);
                stars5.setImageResource(R.drawable.ic_star_border);
                howThisfeel.setText("Disliked it");
            }
        });
        stars3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star);
                stars4.setImageResource(R.drawable.ic_star_border);
                stars5.setImageResource(R.drawable.ic_star_border);
                howThisfeel.setText("It's OK");

            }
        });
        stars4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stars1.setImageResource(R.drawable.ic_star);
                stars2.setImageResource(R.drawable.ic_star);
                stars3.setImageResource(R.drawable.ic_star);
                stars4.setImageResource(R.drawable.ic_star);
                stars5.setImageResource(R.drawable.ic_star_border);
                howThisfeel.setText("Liked it");
            }
        });
        //for displaying profile photo
        String url=firebaseAuth.getCurrentUser().getPhotoUrl().toString();
        Picasso.with(Individual.this).load(url).into(imgprofpik);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (a == 0) {
                    fab.setImageResource(R.drawable.ic_favorite);
                    Snackbar.make(view, "Added to Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a = 15;
                } else {
                    fab.setImageResource(R.drawable.ic_favorite_border_black_24d);
                    Snackbar.make(view, "Removed from Favourites ...!", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
                    a = 0;
                }
            }
        });
    }

        @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
