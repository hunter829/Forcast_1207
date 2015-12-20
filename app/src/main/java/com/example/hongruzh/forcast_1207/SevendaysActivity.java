package com.example.hongruzh.forcast_1207;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hongruzh on 12/8/15.
 */
public class SevendaysActivity extends Activity {

    TextView detailDes;
    TextView dailyDay0;
    ImageView dailyIcon0;
    TextView dailtTemp0;

    TextView dailyDay1;
    ImageView dailyIcon1;
    TextView dailyTemp1;

    TextView dailyDay2;
    ImageView dailyIcon2;
    TextView dailtTemp2;

    TextView dailyDay3;
    ImageView dailyIcon3;
    TextView dailtTemp3;

    TextView dailyDay4;
    ImageView dailyIcon4;
    TextView dailyTemp4;

    TextView dailyDay5;
    ImageView dailyIcon5;
    TextView dailyTemp5;

    TextView dailyDay6;
    ImageView dailyIcon6;
    TextView dailyTemp6;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sevendays_layout);
        detailDes = (TextView)findViewById(R.id.detailTextView);
        String city = getIntent().getStringExtra("city");
        String state = getIntent().getStringExtra("state");
        String degree =getIntent().getStringExtra("degreeInfo");
        detailDes.setText("More details for"+" "+city+","+state);


        String loopday0 = getIntent().getStringExtra("loopday0");
        String dailyicon0 = getIntent().getStringExtra("dailyicon0");
        String maxtemp0 = getIntent().getStringExtra("maxtemp0");
        String mintemp0 = getIntent().getStringExtra("mintemp0");

        dailyDay0 = (TextView)findViewById(R.id.textView35);
        dailyDay0.setText(loopday0);
        dailyIcon0 = (ImageView)findViewById(R.id.imageView48);
        int imgid = 0;
        if(dailyicon0.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon0.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon0.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon0.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon0.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon0.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon0.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon0.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon0.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon0.setImageResource(imgid);
        dailtTemp0 = (TextView)findViewById(R.id.textView36);
        dailtTemp0.setText("Min: " + mintemp0+"°" + " | " + "Max: " + maxtemp0+"°");


        String loopday1 = getIntent().getStringExtra("loopday1");
        String dailyicon1 = getIntent().getStringExtra("dailyicon1");
        String maxtemp1 = getIntent().getStringExtra("maxtemp1");
        String mintemp1 = getIntent().getStringExtra("mintemp1");

        dailyDay1 = (TextView)findViewById(R.id.textView37);
        dailyDay1.setText(loopday1);
        dailyIcon1 = (ImageView)findViewById(R.id.imageView49);
        if(dailyicon1.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon1.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon1.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon1.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon1.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon1.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon1.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon1.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon1.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon1.setImageResource(imgid);
        dailyTemp1 = (TextView)findViewById(R.id.textView38);
        dailyTemp1.setText("Min: " + mintemp1+"°" + " | " + "Max: " + maxtemp1+"°");

        String loopday2 = getIntent().getStringExtra("loopday2");
        String dailyicon2 = getIntent().getStringExtra("dailyicon2");
        String maxtemp2 = getIntent().getStringExtra("maxtemp2");
        String mintemp2 = getIntent().getStringExtra("mintemp2");


        dailyDay2 = (TextView)findViewById(R.id.textView39);
        dailyDay2.setText(loopday2);
        dailyIcon2 = (ImageView)findViewById(R.id.imageView50);
        if(dailyicon2.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon2.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon2.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon2.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon2.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon2.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon2.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon2.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon2.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon2.setImageResource(imgid);
        dailtTemp2 = (TextView)findViewById(R.id.textView40);
        dailtTemp2.setText("Min: " + mintemp2+"°" + " | " + "Max: " + maxtemp2+"°");

        String loopday3 = getIntent().getStringExtra("loopday3");
        String dailyicon3 = getIntent().getStringExtra("dailyicon3");
        String maxtemp3 = getIntent().getStringExtra("maxtemp3");
        String mintemp3 = getIntent().getStringExtra("mintemp3");


        dailyDay3 = (TextView)findViewById(R.id.textView41);
        dailyDay3.setText(loopday3);
        dailyIcon3 = (ImageView)findViewById(R.id.imageView51);
        if(dailyicon3.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon3.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon3.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon3.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon3.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon3.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon3.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon3.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon3.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon3.setImageResource(imgid);
        dailtTemp3 = (TextView)findViewById(R.id.textView42);
        dailtTemp3.setText("Min: " + mintemp3+"°" + " | " + "Max: " + maxtemp3+"°");

        String loopday4 = getIntent().getStringExtra("loopday4");
        String dailyicon4 = getIntent().getStringExtra("dailyicon4");
        String maxtemp4 = getIntent().getStringExtra("maxtemp4");
        String mintemp4 = getIntent().getStringExtra("mintemp4");

        dailyDay4 = (TextView)findViewById(R.id.textView43);
        dailyDay4.setText(loopday4);
        dailyIcon4 = (ImageView)findViewById(R.id.imageView52);
        if(dailyicon4.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon4.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon4.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon4.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon4.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon4.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon4.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon4.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon4.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon4.setImageResource(imgid);
        dailyTemp4 = (TextView)findViewById(R.id.textView44);
        dailyTemp4.setText("Min: " + mintemp4+"°" + " | " + "Max: " + maxtemp4+"°");

        String loopday5 = getIntent().getStringExtra("loopday5");
        String dailyicon5 = getIntent().getStringExtra("dailyicon5");
        String maxtemp5 = getIntent().getStringExtra("maxtemp5");
        String mintemp5 = getIntent().getStringExtra("mintemp5");


        dailyDay5 = (TextView)findViewById(R.id.textView45);
        dailyDay5.setText(loopday5);
        dailyIcon5 = (ImageView)findViewById(R.id.imageView53);
        if(dailyicon5.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon5.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon5.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon5.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon5.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon5.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon5.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon5.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon5.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon5.setImageResource(imgid);
        dailyTemp5 = (TextView)findViewById(R.id.textView46);
        dailyTemp5.setText("Min: " + mintemp5+"°" + " | " + "Max: " + maxtemp5+"°");


        String loopday6 = getIntent().getStringExtra("loopday6");
        String dailyicon6 = getIntent().getStringExtra("dailyicon6");
        String maxtemp6 = getIntent().getStringExtra("maxtemp6");
        String mintemp6 = getIntent().getStringExtra("mintemp6");


        dailyDay6 = (TextView)findViewById(R.id.textView47);
        dailyDay6.setText(loopday6);
        dailyIcon6 = (ImageView)findViewById(R.id.imageView54);
        if(dailyicon6.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (dailyicon6.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (dailyicon6.equals("rain")){imgid = R.drawable.rain;}
        else if (dailyicon6.equals("snow")){imgid = R.drawable.snow;}
        else if (dailyicon6.equals("sleet")){imgid = R.drawable.sleet;}
        else if (dailyicon6.equals("wind")){imgid = R.drawable.wind;}
        else if (dailyicon6.equals("fog")){imgid = R.drawable.fog;}
        else if (dailyicon6.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (dailyicon6.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
        dailyIcon6.setImageResource(imgid);
        dailyTemp6 = (TextView)findViewById(R.id.textView48);
        dailyTemp6.setText("Min: " + mintemp6+"°" + " | " + "Max: " + maxtemp6+"°");



    }
}
