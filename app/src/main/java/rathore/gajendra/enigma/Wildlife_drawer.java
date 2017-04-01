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

public class Wildlife_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;

    CardView cv1,cv2,cv3,cv4;


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

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);



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



        //ends here
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(Wildlife_drawer.this,Individual.class);
                ab.putExtra("name","Aralam Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(Wildlife_drawer.this,Individual.class);
                ab.putExtra("name","Parambikulam Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(Wildlife_drawer.this,Individual.class);
                ab.putExtra("name","Dandeli Wildlife Sanctuary");
                startActivity(ab);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(Wildlife_drawer.this,Individual.class);
                ab.putExtra("name","Wayanand Wildlife Sanctuary");
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
        startActivity(new Intent(Wildlife_drawer.this, profile.class));
    }
    public void onFeedbackClick(View v){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        startActivity(new Intent(Wildlife_drawer.this, feedback.class));
    }

    public void onShareClick(View v){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        Intent share = new Intent(Intent.ACTION_SEND);

        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT,"Ecotour Application exploring India with Ease.\n Visit us at https://drive.google.com/file/d/0B13_VGdM2-QCWkxRTldCdFd4QU0/view?usp=sharing \n ");

        startActivity(Intent.createChooser(share,"Enigma"));

      ;
    }
}
