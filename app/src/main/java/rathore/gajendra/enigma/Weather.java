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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class Weather extends AppCompatActivity {

    private String TAG = Weather.class.getSimpleName();
    String url;
    String id;
    String next_page_token;
    TextView tv_temp;

    ArrayList<HashMap<String, String>> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_temp=(TextView)findViewById(R.id.tv_weather);
        new Weather.Getquery().execute();

    }

    private class Getquery extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(Weather.this,"Looking for Hotels !!!",Toast.LENGTH_LONG).show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22lonavala%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray query = jsonObj.getJSONArray("query");

                    // looping through All query
                    for (int i = 0; i < query.length(); i++) {
                        JSONObject c = query.getJSONObject(i);
                        JSONArray result = c.getJSONArray("results");
                        for (int j = 0; j < result.length(); j++) {
                            JSONObject d = result.getJSONObject(j);
                            JSONArray channel = d.getJSONArray("channel");
                            for (int k = 0; k < channel.length(); k++) {
                                JSONObject e = channel.getJSONObject(k);
                                JSONArray item = e.getJSONArray("item");
                                for (int l = 0; l < item.length(); l++) {
                                    JSONObject f = item.getJSONObject(l);
                                    String temp = String.valueOf(f.getJSONObject("temp"));
                                    tv_temp.setText(temp);
                                    HashMap<String, String> contact = new HashMap<>();
                                    contact.put("name", temp);
                                    contactList.add(contact);

                                }

                            }

                        }
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
            /*
            ListAdapter adapter = new SimpleAdapter(MainActivity.this, contactList,
                    R.layout.list_item, new String[]{ "name","rating",},
                    new int[]{R.id.name, R.id.ratings});
            lv.setAdapter(adapter);
            */
        }
    }
}
