package com.example.hongruzh.forcast_1207;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by hongruzh on 12/6/15.
 */
public class AsyncTaskarseJson extends AsyncTask<String,Integer,String> {

    Context Context;
    String  curPrecipiDes;
    String degree;
    String city_Content;
    String state_Content;

    OnDataFinishedListener onDataFinishedListener;
    public AsyncTaskarseJson(){

    }
    public AsyncTaskarseJson(Context context) {
        this.Context = context.getApplicationContext();
    }

    public void setOnDataFinishedListener(
            OnDataFinishedListener onDataFinishedListener) {
        this.onDataFinishedListener = onDataFinishedListener;
    }




    protected String doInBackground(String... urls){
        String stream = null;

        try{
            URL url = new URL(urls[0]);
            degree = urls[1];
            city_Content = urls[2];
            state_Content = urls[3];

            String result="";
            HttpURLConnection urlConnection = null;
            urlConnection = (HttpURLConnection) url.openConnection();
            if(urlConnection.getResponseCode() == 200){
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                // Read the BufferedInputStream
                BufferedReader r = new BufferedReader(new InputStreamReader(in));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }
                result = sb.toString();
                // End reading...............

                // Disconnect the HttpURLConnection
                urlConnection.disconnect();
                Log.v("result",result);
                return result;
            }

        }catch (Exception e) {
            return e.toString();
        }

        return stream;

    }

    protected void onProgressUpdate(Integer... progress) {
        //setProgressPercent(progress[0]);
    }


    protected void onPostExecute(String result) {
        try{
            JSONObject jsonAnswer = new JSONObject(result);

//

//           //the new intent requires the current activity's context(first param)
           Intent intent = new Intent(Context,ResultActivity.class);


           intent.putExtra("degreeinfo",degree);
            intent.putExtra("city",city_Content);
            intent.putExtra("state",state_Content);


           intent.putExtra("icon",jsonAnswer.getJSONObject("currently").getString("icon"));
           intent.putExtra("summary",jsonAnswer.getJSONObject("currently").getString("summary"));
           intent.putExtra("temperature",jsonAnswer.getJSONObject("currently").getInt("temperature"));
           intent.putExtra("dailyMax",jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(0).getInt("temperatureMax"));
           intent.putExtra("dailyMin",jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(0).getInt("temperatureMin"));
           String chanceOfRain = (int)(jsonAnswer.getJSONObject("currently").getDouble("precipProbability")*100)+"%";
            int offset = jsonAnswer.getInt("offset");
           //judge current precipitation description
           double curPrecipi = jsonAnswer.getJSONObject("currently").getDouble("precipIntensity");
           if(curPrecipi>=0&&curPrecipi<0.002)
           {curPrecipiDes="None";}
           else if(curPrecipi>=0.002&&curPrecipi<0.017)
           {curPrecipiDes="Very Light";}
           else if(curPrecipi>=0.017&&curPrecipi<0.1)
           {curPrecipiDes="Light";}
           else if(curPrecipi>=0.1&&curPrecipi<0.4)
           {curPrecipiDes="Moderate";}
           else
           {curPrecipiDes="Heavy";}
           intent.putExtra("curPrecipiDes",curPrecipiDes);
           intent.putExtra("chanceOfRain",chanceOfRain);

           double windSpeed = jsonAnswer.getJSONObject("currently").getDouble("windSpeed");
           double visibility = jsonAnswer.getJSONObject("currently").getDouble("visibility");
           int dewPoint = jsonAnswer.getJSONObject("currently").getInt("dewPoint");
           int humidity = (int)(jsonAnswer.getJSONObject("currently").getDouble("humidity")*100);
           Long sunriseTime = jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(0).getLong("sunriseTime");
            Long sunsetTime = jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(0).getLong("sunsetTime");
            Log.v("sunrise", "sunriseTime");
            String conriseTime = convertTimeStampToDate(sunriseTime * 1000 + (offset + 5) * 3600000);
            String consetTime = convertTimeStampToDate(sunsetTime * 1000 + (offset + 5) * 3600000);

            double latitude = jsonAnswer.getDouble("latitude");
            double longitude = jsonAnswer.getDouble("longitude");
            intent.putExtra("lat",latitude);
            intent.putExtra("lon",longitude);



           //need to add m/s km

           intent.putExtra("windSpeed",windSpeed);
           intent.putExtra("currentVisibility", visibility);
           intent.putExtra("currentDewPoint",dewPoint);
           intent.putExtra("humidity", humidity);
            intent.putExtra("sunriseTime",conriseTime);
            intent.putExtra("sunsetTime",consetTime);


            //next 24 hours data
            ArrayList<String> loopTime = new ArrayList<String>();
            ArrayList<String> hourlyIcon =new ArrayList<String>();
            ArrayList<String> houlyTemp =new ArrayList<String>();
            for(int i=0;i<48;i++){
                long value = jsonAnswer.getJSONObject("hourly").getJSONArray("data").getJSONObject(i).getLong("time") * 1000+(offset+5)*3600000;
                String conTime = convertTimeStampToDate(value);
                loopTime.add(conTime);
                hourlyIcon.add(jsonAnswer.getJSONObject("hourly").getJSONArray("data").getJSONObject(i).getString("icon"));
                Integer Temp = jsonAnswer.getJSONObject("hourly").getJSONArray("data").getJSONObject(i).getInt("temperature");
                String conTemp = Temp.toString();
                houlyTemp.add(conTemp);
            }
            intent.putExtra("loopTime", loopTime);
            intent.putStringArrayListExtra("hourlyIcon", hourlyIcon);
            intent.putExtra("hourlyTemp",houlyTemp);


            //next 7 days

            ArrayList<String> loopDay = new ArrayList<String>();
            ArrayList<String> dailyIcon = new ArrayList<String>();
            ArrayList<String> maxTemp = new ArrayList<String>();
            ArrayList<String> minTemp = new ArrayList<String>();

            for(int j=0;j<7;j++){
                dailyIcon.add(jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(1).getString("icon"));
                long value = jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(j).getLong("time") * 1000+(offset+5)*3600000;
                String conTime = convertTimeStampToDay(value);
                loopDay.add(conTime);
                //convert integer to String
                Integer dailyTempMax = jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(j).getInt("temperatureMax");
                String conMax = dailyTempMax.toString();
                Integer dailyTempMin = jsonAnswer.getJSONObject("daily").getJSONArray("data").getJSONObject(j).getInt("temperatureMin");
                dailyTempMin.toString();
                String conMin = dailyTempMin.toString();
                maxTemp.add(conMax);
                minTemp.add(conMin);
            }
            intent.putExtra("dailyIcon",dailyIcon);
            intent.putExtra("loopDay",loopDay);
            intent.putExtra("maxTemp",maxTemp);
            intent.putExtra("minTemp",minTemp);



            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            Context.startActivity(intent);
//
//
//           //get sunrise time and sunset time
//
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String convertTimeStampToDay(Long value){
        Timestamp stamp1 = new Timestamp(value);
        Date date1 = new Date(stamp1.getTime());
        SimpleDateFormat day = new SimpleDateFormat("EEEE, MMM dd");
        String dayString = day.format(date1);
        return dayString;
    }

    private String convertTimeStampToDate(Long value){
        Timestamp stamp = new Timestamp(value);
        Date date = new Date(stamp.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        String dateString = formatter.format(date);
        return dateString;
    }
}