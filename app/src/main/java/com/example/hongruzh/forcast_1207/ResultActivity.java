package com.example.hongruzh.forcast_1207;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hongruzh on 12/7/15.
 */
public class ResultActivity extends Activity {

    Button detailBtn;
    Button mapBtn;
    ImageButton fbBtn;
    ImageView icon;
    TextView summary;
    TextView tempature;
    TextView minTemp;
    TextView maxTemp;
    TextView precipi;
    TextView chanceOfRain;
    TextView windSpeed;
    TextView dewPoint;
    TextView humidity;
    TextView visibility;
    TextView sunrise;
    TextView sunset;


    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.resultlayout);
        detailBtn = (Button)findViewById(R.id.detailsBtn);
        mapBtn = (Button)findViewById(R.id.mapBtn);
        fbBtn = (ImageButton)findViewById(R.id.fbBtn);
        icon = (ImageView)findViewById(R.id.imageView);
        summary = (TextView)findViewById(R.id.textView);
        tempature = (TextView)findViewById(R.id.centerTemp);
        minTemp = (TextView)findViewById(R.id.minTemptextView);
        maxTemp = (TextView)findViewById(R.id.maxTemptextView);
        precipi = (TextView)findViewById(R.id.precipiTextView);
        chanceOfRain = (TextView)findViewById(R.id.chanceOfTextView);
        windSpeed = (TextView)findViewById(R.id.windSpeedTextView);
        dewPoint = (TextView)findViewById(R.id.dewPoTextView);
        humidity = (TextView)findViewById(R.id.humiTextView);
        visibility = (TextView)findViewById(R.id.visiTextView);
        sunrise = (TextView)findViewById(R.id.riseTextView);
        sunset =  (TextView)findViewById(R.id.setTextView);

        final String city = getIntent().getStringExtra("city");
        final String state = getIntent().getStringExtra("state");
        final String degree = getIntent().getStringExtra("degreeinfo");

        detailBtn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.putExtra("city",city);
                        intent.putExtra("state",state);
                        intent.putExtra("degreeInfo",degree);

                        ArrayList<String> loopTime = getIntent().getStringArrayListExtra("loopTime");
                        ArrayList<String> hourlyIcon = getIntent().getStringArrayListExtra("hourlyIcon");
                        ArrayList<String> hourlyTemp = getIntent().getStringArrayListExtra("hourlyTemp");

                        intent.putExtra("loopTime", loopTime);
                        intent.putExtra("hourlyIcon",hourlyIcon);
                        intent.putExtra("hourlyTemp",hourlyTemp);


                        ArrayList<String> loopday = getIntent().getStringArrayListExtra("loopDay");
                        ArrayList<String>  dailyicon= getIntent().getStringArrayListExtra("dailyIcon");
                        ArrayList<String> maxtemp = getIntent().getStringArrayListExtra("maxTemp");
                        ArrayList<String> mintemp = getIntent().getStringArrayListExtra("minTemp");

                        intent.putExtra("loopDay",loopday);
                        intent.putExtra("dailyIcon",dailyicon);
                        intent.putExtra("maxTemp",maxtemp);
                        intent.putExtra("minTemp",mintemp);

                        intent.setClass(ResultActivity.this, DetailActivity.class);
                        startActivity(intent);


                    }
                });

        mapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();

            double lat = getIntent().getDoubleExtra("lat",0);
            double lon = getIntent().getDoubleExtra("lon",0);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);


                intent.setClass(ResultActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });

        fbBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("city",city);
                intent.putExtra("state",state);
                intent.putExtra("degreeInfo",degree);
                String imgIcon = getIntent().getStringExtra("icon");
                intent.putExtra("imgIcon",imgIcon);
                String temperature_r;
                String summaryDes_r = getIntent().getStringExtra("summary");
                intent.putExtra("summaryDes_r",summaryDes_r);

                if(degree.equals("us")){
                 temperature_r = (Integer.toString(getIntent().getIntExtra("temperature", 0))+"°F");}
                else{
                    temperature_r = (Integer.toString(getIntent().getIntExtra("temperature", 0))+"°C");
                }

                intent.putExtra("temperature_r",temperature_r);
                intent.setClass(ResultActivity.this,FacebookActivity.class);
                startActivity(intent);

            }
        });



        String imgIcon = getIntent().getStringExtra("icon");
        String summaryDes_r = getIntent().getStringExtra("summary");
        String summaryDes_rr = getIntent().getStringExtra("summary")+" "+"in"+" "+city+","+state;
        String curPrecipiDes_r= getIntent().getStringExtra("curPrecipiDes");
        String chanceOfRain_r = getIntent().getStringExtra("chanceOfRain");
        String dewPoint_r;
        String humidity_r = getIntent().getIntExtra("humidity", 0)+"%";
        String temperature_r;
        String dailyMaxTemp_r;
        String dailyMinTemp_r;
        String windSpeed_r;
        String visibility_r;
        String riseTime = getIntent().getStringExtra("sunriseTime");
        String setTime = getIntent().getStringExtra("sunsetTime");



        //us and si information to judge F or C

        if(degree.equals("us")){
            temperature_r = (Integer.toString(getIntent().getIntExtra("temperature", 0))+"°F");
            dailyMaxTemp_r= (Integer.toString(getIntent().getIntExtra("dailyMax", 0))+"°F");
            dailyMinTemp_r= (Integer.toString(getIntent().getIntExtra("dailyMin", 0))+"°F");
            windSpeed_r = (getIntent().getDoubleExtra("windSpeed", 0))+"mph";
            visibility_r =  getIntent().getDoubleExtra("currentVisibility", 0)+"mi";
            dewPoint_r = getIntent().getIntExtra("currentDewpoint", 0)+"°F";
        }
        else{
            temperature_r = (Integer.toString(getIntent().getIntExtra("temperature", 0))+"°C");
            dailyMaxTemp_r= (Integer.toString(getIntent().getIntExtra("dailyMax", 0))+"°C");
            dailyMinTemp_r= (Integer.toString(getIntent().getIntExtra("dailyMin", 0))+"°C");
            windSpeed_r = (getIntent().getDoubleExtra("windSpeed",0))+"m/s";
            visibility_r =  getIntent().getDoubleExtra("currentVisibility", 0)+"km";
            dewPoint_r = getIntent().getIntExtra("currentDewpoint", 0)+"°C";

        }

        //next 24 hours
//        ArrayList<String> loopTime = getIntent().getStringArrayListExtra("loopTime");
//        ArrayList<String> hourlyIcon = getIntent().getStringArrayListExtra("hourlyIcon");
//        ArrayList<String> hourlyTemp = getIntent().getStringArrayListExtra("hourlyTemp");
//        System.out.println(loopTime);
//        System.out.println(hourlyTemp);
//        System.out.println(hourlyIcon);

        //next 7 days
//        ArrayList<String> loopday = getIntent().getStringArrayListExtra("loopDay");
//        ArrayList<String>  dailyicon= getIntent().getStringArrayListExtra("dailyIcon");
//        ArrayList<String> maxtemp = getIntent().getStringArrayListExtra("maxTemp");
//        ArrayList<String> mintemp = getIntent().getStringArrayListExtra("minTemp");


        summary.setText(summaryDes_rr);
        tempature.setText(temperature_r);
        maxTemp.setText(dailyMaxTemp_r);
        minTemp.setText(dailyMinTemp_r);
        precipi.setText(curPrecipiDes_r);
        chanceOfRain.setText(chanceOfRain_r);
        windSpeed.setText(windSpeed_r);
        dewPoint.setText(dewPoint_r);
        visibility.setText(visibility_r);
        humidity.setText(humidity_r);
        sunrise.setText(riseTime);
        sunset.setText(setTime);

        //sunrise time and sunset time

        int imgid = 0;

        if(imgIcon.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (imgIcon.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (imgIcon.equals("rain")){imgid = R.drawable.rain;}
        else if (imgIcon.equals("snow")){imgid = R.drawable.snow;}
        else if (imgIcon.equals("sleet")){imgid = R.drawable.sleet;}
        else if (imgIcon.equals("wind")){imgid = R.drawable.wind;}
        else if (imgIcon.equals("fog")){imgid = R.drawable.fog;}
        else if (imgIcon.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (imgIcon.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        icon.setImageResource(imgid);


      }


}