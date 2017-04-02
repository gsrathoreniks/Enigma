package rathore.gajendra.enigma;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class socio_conomic extends AppCompatActivity {
    private String TAG = socio_conomic.class.getSimpleName();
    private ListView lv;
    ImageView imageView;
    String url;
    String id;
    String next_page_token;

    ArrayList<HashMap<String, String>> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socio_conomic);
        imageView=(ImageView)findViewById(R.id.imgHotel);
        //Picasso.load("http://i.imgur.com/DvpvklR.png").into(imageView);
        contactList = new ArrayList<>();
        lv = (ListView) findViewById(R.id.list);

        new socio_conomic.GetContacts().execute();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent open =new Intent(socio_conomic.this,socio_conomic.class);
                open.putExtra("id",id);
            }
        });

    }

    private class GetContacts extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(socio_conomic.this,"Looking for "+getIntent().getExtras().getString("place"),Toast.LENGTH_LONG).show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String a="https://maps.googleapis.com/maps/api/place/textsearch/json?query=";
            String b="+in+cochin&key=AIzaSyB0ClF8D7rlOlLPgFH5SeAY3RGfgRGEXVA";
            url=a.concat(getIntent().getExtras().getString("place")).concat(b);
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray contacts = jsonObj.getJSONArray("results");

                    // looping through All Contacts
                    for (int i = 0; i < contacts.length(); i++) {
                        JSONObject c = contacts.getJSONObject(i);
                        id = c.getString("id");
                        String name = c.getString("name");
                        String address = c.getString("formatted_address");
                        // location JSONObject
                       // JSONObject location = c.getJSONObject("geometry");
                        //JSONObject latlong = location.getJSONObject("location");
                        //String lat = latlong.getString("lat");
                        //String lng = latlong.getString("lng");

                        HashMap<String, String> contact = new HashMap<>();
                        contact.put("name", name);
                        contact.put("rating", address);
                        contactList.add(contact);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                }

            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            ListAdapter adapter = new SimpleAdapter(socio_conomic.this, contactList,
                    R.layout.list_item, new String[]{ "name","rating",},
                    new int[]{R.id.name, R.id.ratings});
            lv.setAdapter(adapter);
        }
    }
}
