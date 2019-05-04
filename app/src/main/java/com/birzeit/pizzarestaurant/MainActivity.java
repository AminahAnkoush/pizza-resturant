package com.birzeit.pizzarestaurant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button getStartedBtn = (Button) findViewById(R.id.btnGetStarted);
        List<JSONObject> pizzaList = new ArrayList<JSONObject>();

        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AsyncTask asyncTask = new AsyncTask() {
//
//                    //@SuppressLint("WrongThread")
//                    @Override
//                    protected Object doInBackground(Object[] objects) {
//                        OkHttpClient client = new OkHttpClient();
//
//                        Request request = new Request.Builder()
//                                .url("http://www.mocky.io/v2/5b522fa32e000074005c1c40")
//                                .build();
//                        Response response = null;
//                        try{
//                            response = client.newCall(request).execute();
//                            return response.body().string();
//                        }catch (IOException e){
//                            e.printStackTrace();
//                        }
//
//                        return null;
//                    }
//
//                    @Override
//                    protected void onPostExecute(Object o) {
//                        super.onPostExecute(o);
//                    }
//                }.execute();


//                Intent getStartedToRegistrationIntent=new Intent(MainActivity.this,
//                        CustomerMain.class);

            }
        });
    }
}
