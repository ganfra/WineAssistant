package com.example.damien.wineassistant;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.damien.wineassistant.data.WineResult;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    @InjectView(R.id.wine_list)
    public ListView wineListView;
    private WineAdapter mWineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mWineAdapter = new WineAdapter(this,
                new ArrayList<com.example.damien.wineassistant.data.List>());
        wineListView.setAdapter(mWineAdapter);
        WineClient.get().getAll("catalog", 10, "mondavi cab", mCallback);

    }

    private Callback<WineResult> mCallback = new Callback<WineResult>() {
        @Override
        public void success(WineResult wineResult, Response response) {
            mWineAdapter.addAll(wineResult.getProducts().getList());
            Toast.makeText(getApplicationContext(), "WS okay", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void failure(RetrofitError error) {
            Toast.makeText(getApplicationContext(), "WS failure", Toast.LENGTH_SHORT).show();
            Log.e(MainActivity.class.getSimpleName(), error.getMessage());
            Log.e(MainActivity.class.getSimpleName(), error.getUrl());
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

}
