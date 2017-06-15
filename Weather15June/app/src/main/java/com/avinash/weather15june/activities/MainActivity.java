package com.avinash.weather15june.activities;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.avinash.weather15june.R;
import com.avinash.weather15june.adapters.MainAdapter;
import com.avinash.weather15june.interfaces.ResponseListener;
import com.avinash.weather15june.models.GsonResponse;
import com.avinash.weather15june.models.Response;
import com.avinash.weather15june.webservices.WeatherAsynctask;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private WeatherAsynctask asynctask;
    private MainAdapter adapter;
    private List<GsonResponse> responseList;
    private Gson gson;
    private GsonBuilder gsonBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization() {

        mContext = this;
        asynctask = new WeatherAsynctask(mContext , responseListener);
        asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

        responseList = new ArrayList<GsonResponse>();
        gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setHasFixedSize(true);
        adapter = new MainAdapter();


    }

    ResponseListener responseListener = new ResponseListener() {
        @Override
        public void onSuccess(String response) {
            Toast.makeText(mContext, ""+response, Toast.LENGTH_SHORT).show();
            /*responseList.clear();
            responseList.add((GsonResponse) gson.fromJson(response , GsonResponse.class));
            adapter = new MainAdapter(mContext , responseList);
            mRecyclerView.setAdapter(adapter);
            mRecyclerView.invalidate();
            adapter.notifyDataSetChanged();*/
        }

        @Override
        public void onFail(String response) {
            Toast.makeText(mContext, ""+response, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onError(String response) {
            Toast.makeText(mContext, ""+response, Toast.LENGTH_SHORT).show();
        }
    };
}
