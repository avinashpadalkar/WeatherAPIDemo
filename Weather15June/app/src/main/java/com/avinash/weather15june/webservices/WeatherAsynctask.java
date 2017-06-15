package com.avinash.weather15june.webservices;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;

import com.avinash.weather15june.interfaces.ResponseListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Avinash.Padalkar on 15/06/2017.
 */

public class WeatherAsynctask extends AsyncTask<String , Void , String> {

    private Context mContext;
    private ResponseListener responseListener;
    private LayoutInflater inflater;
    private ProgressDialog dialog;
    private URL url;
    private HttpURLConnection connection;
//    private String webUrl = "http://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1";
    private String webUrl = "http://samples.openweathermap.org";

    public WeatherAsynctask() {
    }

    public WeatherAsynctask(Context mContext, ResponseListener responseListener) {
        this.mContext = mContext;
        this.responseListener = responseListener;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        dialog = new ProgressDialog(mContext);

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage("Loading...");
        dialog.show();
    }

    @Override
    protected String doInBackground(String... params) {

        String response = "";
        try {
            url = new URL(webUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if(responseCode== HttpURLConnection.HTTP_OK){

                response = inputStreamToString(connection.getInputStream());

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }


        return response;
    }

    private String inputStreamToString(InputStream in) {

        StringBuffer buffer = new StringBuffer();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = "";
        try {
            while ((line = reader.readLine())!=null){
                buffer.append(line);
            }
            return buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    protected void onPostExecute(String response) {
        super.onPostExecute(response);

        if(dialog.isShowing()){
            dialog.dismiss();
        }
        try {
            if (!response.isEmpty() && !response.equalsIgnoreCase("null")) {
                responseListener.onSuccess(response);
            } else {
                responseListener.onError(response);
            }
        }catch (Exception e){
            e.printStackTrace();
            responseListener.onError(e.getMessage());
        }

    }
}
