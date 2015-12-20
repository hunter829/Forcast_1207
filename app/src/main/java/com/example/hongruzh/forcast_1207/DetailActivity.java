package com.example.hongruzh.forcast_1207;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hongruzh on 12/8/15.
 */
public class DetailActivity extends Activity {
    Button daysBtn;
    TableLayout dataTable;
    Button plusBtn;
    TableRow hideRow;
    TextView title;

    TextView hour0;
    ImageView icon0;
    TextView temp0;

    TextView hour1;
    ImageView icon1;
    TextView temp1;


    TextView hour2;
    ImageView icon2;
    TextView temp2;

    TextView hour3;
    ImageView icon3;
    TextView temp3;

    TextView hour4;
    ImageView icon4;
    TextView temp4;

    TextView hour5;
    ImageView icon5;
    TextView temp5;

    TextView hour6;
    ImageView icon6;
    TextView temp6;

    TextView hour7;
    ImageView icon7;
    TextView temp7;

    TextView hour8;
    ImageView icon8;
    TextView temp8;

    TextView hour9;
    ImageView icon9;
    TextView temp9;

    TextView hour10;
    ImageView icon10;
    TextView temp10;

    TextView hour11;
    ImageView icon11;
    TextView temp11;

    TextView hour12;
    ImageView icon12;
    TextView temp12;

    TextView hour13;
    ImageView icon13;
    TextView temp13;

    TextView hour14;
    ImageView icon14;
    TextView temp14;

    TextView hour15;
    ImageView icon15;
    TextView temp15;

    TextView hour16;
    ImageView icon16;
    TextView temp16;

    TextView hour17;
    ImageView icon17;
    TextView temp17;

    TextView hour18;
    ImageView icon18;
    TextView temp18;

    TextView hour19;
    ImageView icon19;
    TextView temp19;

    TextView hour20;
    ImageView icon20;
    TextView temp20;

    TextView hour21;
    ImageView icon21;
    TextView temp21;

    TextView hour22;
    ImageView icon22;
    TextView temp22;

    TextView hour23;
    ImageView icon23;
    TextView temp23;

    TextView hour24;
    ImageView icon24;
    TextView temp24;

    TextView hour25;
    ImageView icon25;
    TextView temp25;

    TextView hour26;
    ImageView icon26;
    TextView temp26;

    TextView hour27;
    ImageView icon27;
    TextView temp27;

    TextView hour28;
    ImageView icon28;
    TextView temp28;

    TextView hour29;
    ImageView icon29;
    TextView temp29;

    TextView hour30;
    ImageView icon30;
    TextView temp30;

    TextView hour31;
    ImageView icon31;
    TextView temp31;


    TextView hour32;
    ImageView icon32;
    TextView temp32;

    TextView hour33;
    ImageView icon33;
    TextView temp33;

    TextView hour34;
    ImageView icon34;
    TextView temp34;

    TextView hour35;
    ImageView icon35;
    TextView temp35;

    TextView hour36;
    ImageView icon36;
    TextView temp36;

    TextView hour37;
    ImageView icon37;
    TextView temp37;

    TextView hour38;
    ImageView icon38;
    TextView temp38;

    TextView hour39;
    ImageView icon39;
    TextView temp39;

    TextView hour40;
    ImageView icon40;
    TextView temp40;

    TextView hour41;
    ImageView icon41;
    TextView temp41;

    TextView hour42;
    ImageView icon42;
    TextView temp42;

    TextView hour43;
    ImageView icon43;
    TextView temp43;

    TextView hour44;
    ImageView icon44;
    TextView temp44;

    TextView hour45;
    ImageView icon45;
    TextView temp45;

    TextView hour46;
    ImageView icon46;
    TextView temp46;

    TextView hour47;
    ImageView icon47;
    TextView temp47;

    TextView tempview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        daysBtn = (Button)findViewById(R.id.daysBtn);



        daysBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();

                ArrayList<String> loopday = getIntent().getStringArrayListExtra("loopDay");
                ArrayList<String>  dailyicon= getIntent().getStringArrayListExtra("dailyIcon");
                ArrayList<String> maxtemp = getIntent().getStringArrayListExtra("maxTemp");
                ArrayList<String> mintemp = getIntent().getStringArrayListExtra("minTemp");

                //第一天
                String loopday0 = loopday.get(0);
                String dailyicon0 =dailyicon.get(0);
                String maxtemp0 = maxtemp.get(0);
                String mintemp0 = mintemp.get(0);

                intent.putExtra("loopday0",loopday0);
                intent.putExtra("dailyicon0",dailyicon0);
                intent.putExtra("maxtemp0",maxtemp0);
                intent.putExtra("mintemp0",mintemp0);

                //第二天
                String loopday1 = loopday.get(1);
                String dailyicon1 =dailyicon.get(1);
                String maxtemp1 = maxtemp.get(1);
                String mintemp1 = mintemp.get(1);

                intent.putExtra("loopday1",loopday1);
                intent.putExtra("dailyicon1",dailyicon1);
                intent.putExtra("maxtemp1",maxtemp1);
                intent.putExtra("mintemp1",mintemp1);

                //第三天
                String loopday2 = loopday.get(2);
                String dailyicon2 =dailyicon.get(2);
                String maxtemp2 = maxtemp.get(2);
                String mintemp2 = mintemp.get(2);

                intent.putExtra("loopday2",loopday2);
                intent.putExtra("dailyicon2",dailyicon2);
                intent.putExtra("maxtemp2",maxtemp2);
                intent.putExtra("mintemp2",mintemp2);

                //第四天
                String loopday3 = loopday.get(3);
                String dailyicon3 =dailyicon.get(3);
                String maxtemp3 = maxtemp.get(3);
                String mintemp3 = mintemp.get(3);

                intent.putExtra("loopday3",loopday3);
                intent.putExtra("dailyicon3",dailyicon3);
                intent.putExtra("maxtemp3",maxtemp3);
                intent.putExtra("mintemp3",mintemp3);

                //第五天
                String loopday4 = loopday.get(4);
                String dailyicon4 =dailyicon.get(4);
                String maxtemp4 = maxtemp.get(4);
                String mintemp4 = mintemp.get(4);

                intent.putExtra("loopday4",loopday4);
                intent.putExtra("dailyicon4",dailyicon4);
                intent.putExtra("maxtemp4",maxtemp4);
                intent.putExtra("mintemp4",mintemp4);

                //第六天
                String loopday5 = loopday.get(5);
                String dailyicon5 =dailyicon.get(5);
                String maxtemp5 = maxtemp.get(5);
                String mintemp5 = mintemp.get(5);

                intent.putExtra("loopday5",loopday5);
                intent.putExtra("dailyicon5",dailyicon5);
                intent.putExtra("maxtemp5",maxtemp5);
                intent.putExtra("mintemp5",mintemp5);

                //第七天
                String loopday6 = loopday.get(6);
                String dailyicon6 =dailyicon.get(6);
                String maxtemp6 = maxtemp.get(6);
                String mintemp6 = mintemp.get(6);

                intent.putExtra("loopday6",loopday6);
                intent.putExtra("dailyicon6",dailyicon6);
                intent.putExtra("maxtemp6",maxtemp6);
                intent.putExtra("mintemp6",mintemp6);


                String city = getIntent().getStringExtra("city");
                String state = getIntent().getStringExtra("state");
                String degree =getIntent().getStringExtra("degreeInfo");

                //传递首页信息
                intent.putExtra("city",city);
                intent.putExtra("state",state);
                intent.putExtra("degreeInfo",degree);

                intent.putExtra("loopDay",loopday);
                intent.putExtra("dailyIcon",dailyicon);
                intent.putExtra("maxTemp",maxtemp);
                intent.putExtra("minTemp",mintemp);

                intent.setClass(DetailActivity.this, SevendaysActivity.class);// TestActivity 是要跳转到的Activity，需要在src下手动建立TestActivity.java文件
                startActivity(intent);


            }
        });

        dataTable = (TableLayout)findViewById(R.id.tableLayout1);
        plusBtn =(Button)findViewById(R.id.plusBtn);
        hideRow = (TableRow)findViewById(R.id.tableRow);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dataTable.setVisibility(View.VISIBLE);
                hideRow.setVisibility(View.INVISIBLE);
            }
        });


        //Set detail title
        title = (TextView)findViewById(R.id.textView31);

        String city = getIntent().getStringExtra("city");
        String state = getIntent().getStringExtra("state");
        String degree =getIntent().getStringExtra("degreeInfo");

        String detailTitle = "More Details in" + city + "," + state;
        title.setText(detailTitle);



        tempview= (TextView)findViewById(R.id.textView3);
        if(degree.equals("us")){
            tempview.setText("Temp(°F)");}
        else{
            tempview.setText("Temp(°C)");
        }


        ArrayList<String> loopTime = getIntent().getStringArrayListExtra("loopTime");
        ArrayList<String> hourlyIcon = getIntent().getStringArrayListExtra("hourlyIcon");
        ArrayList<String> hourlyTemp = getIntent().getStringArrayListExtra("hourlyTemp");





        hour0 = (TextView)findViewById(R.id.textView37);
        icon0 = (ImageView)findViewById(R.id.imageView2);
        temp0 = (TextView)findViewById(R.id.textView38);



        hour0.setText(loopTime.get(0));
        String hourlyicon0 = hourlyIcon.get(0);
        String hourlytemp0 = hourlyTemp.get(0);

        int imgid = 0;
        if(hourlyicon0.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon0.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon0.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon0.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon0.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon0.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon0.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon0.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon0.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon0.setImageResource(R.drawable.clear);
        temp0.setText(hourlytemp0);



        hour1 = (TextView)findViewById(R.id.textView39);
        icon1 = (ImageView)findViewById(R.id.imageView3);
        temp1 = (TextView)findViewById(R.id.textView40);

        hour1.setText(loopTime.get(1));
        String hourlyicon1 = hourlyIcon.get(1);
        String hourlytemp1 = hourlyTemp.get(1);
        if(hourlyicon1.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon1.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon1.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon1.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon1.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon1.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon1.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon1.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon1.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon1.setImageResource(imgid);
        temp1.setText(hourlytemp1);

        //第三个table
        hour2 = (TextView)findViewById(R.id.textView41);
        icon2 = (ImageView)findViewById(R.id.imageView4);
        temp2 = (TextView)findViewById(R.id.textView42);

        hour2.setText(loopTime.get(2));
        String hourlyicon2 = hourlyIcon.get(2);
        String hourlytemp2 = hourlyTemp.get(2);
        if(hourlyicon2.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon2.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon2.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon2.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon2.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon2.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon2.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon2.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon2.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon2.setImageResource(imgid);
        temp2.setText(hourlytemp2);

        //第4个table


        hour3 = (TextView)findViewById(R.id.textView43);
        icon3 = (ImageView)findViewById(R.id.imageView5);
        temp3 = (TextView)findViewById(R.id.textView44);

        hour3.setText(loopTime.get(3));
        String hourlyicon3 = hourlyIcon.get(3);
        String hourlytemp3 = hourlyTemp.get(3);


        if(hourlyicon3.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon3.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon3.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon3.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon3.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon3.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon3.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon3.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon3.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon3.setImageResource(imgid);
        temp3.setText(hourlytemp3);

        //第5个table

        hour4 = (TextView)findViewById(R.id.textView45);
        icon4 = (ImageView)findViewById(R.id.imageView6);
        temp4 = (TextView)findViewById(R.id.textView46);

        hour4.setText(loopTime.get(4));
        String hourlyicon4 = hourlyIcon.get(4);
        String hourlytemp4 = hourlyTemp.get(4);
        if(hourlyicon4.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon4.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon4.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon4.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon4.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon4.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon4.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon4.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon4.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon4.setImageResource(imgid);
        temp4.setText(hourlytemp4);

        //第6个table

        hour5 = (TextView)findViewById(R.id.textView47);
        icon5 = (ImageView)findViewById(R.id.imageView7);
        temp5 = (TextView)findViewById(R.id.textView48);

        hour5.setText(loopTime.get(5));
        String hourlyicon5 = hourlyIcon.get(5);
        String hourlytemp5 = hourlyTemp.get(5);
        if(hourlyicon5.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon5.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon5.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon5.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon5.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon5.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon5.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon5.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon5.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon5.setImageResource(imgid);
        temp5.setText(hourlytemp5);

        //第7个table
        hour6 = (TextView)findViewById(R.id.textView49);
        icon6 = (ImageView)findViewById(R.id.imageView8);
        temp6 = (TextView)findViewById(R.id.textView50);

        hour6.setText(loopTime.get(6));
        String hourlyicon6 = hourlyIcon.get(6);
        String hourlytemp6 = hourlyTemp.get(6);
        if(hourlyicon6.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon6.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon6.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon6.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon6.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon6.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon6.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon6.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon6.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon6.setImageResource(imgid);
        temp6.setText(hourlytemp6);

        //第八个table
        hour7 = (TextView)findViewById(R.id.textView51);
        icon7 = (ImageView)findViewById(R.id.imageView9);
        temp7 = (TextView)findViewById(R.id.textView52);

        hour7.setText(loopTime.get(7));
        String hourlyicon7 = hourlyIcon.get(7);
        String hourlytemp7 = hourlyTemp.get(7);
        if(hourlyicon7.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon7.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon7.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon7.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon7.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon7.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon7.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon7.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon7.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon7.setImageResource(imgid);
        temp7.setText(hourlytemp7);

        //第九个table
        hour8 = (TextView)findViewById(R.id.textView53);
        icon8 = (ImageView)findViewById(R.id.imageView10);
        temp8 = (TextView)findViewById(R.id.textView54);

        hour8.setText(loopTime.get(8));
        String hourlyicon8 = hourlyIcon.get(8);
        String hourlytemp8 = hourlyTemp.get(8);
        if(hourlyicon8.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon8.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon8.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon8.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon8.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon8.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon8.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon8.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon8.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon8.setImageResource(imgid);
        temp8.setText(hourlytemp8);

        //第10个table

        hour9 = (TextView)findViewById(R.id.textView55);
        icon9 = (ImageView)findViewById(R.id.imageView11);
        temp9 = (TextView)findViewById(R.id.textView56);

        hour9.setText(loopTime.get(9));
        String hourlyicon9 = hourlyIcon.get(9);
        String hourlytemp9 = hourlyTemp.get(9);
        if(hourlyicon8.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon8.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon8.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon8.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon8.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon8.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon9.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon9.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon9.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon9.setImageResource(imgid);
        temp9.setText(hourlytemp9);

        //第11个table

        hour10 = (TextView)findViewById(R.id.textView57);
        icon10 = (ImageView)findViewById(R.id.imageView12);
        temp10 = (TextView)findViewById(R.id.textView58);

        hour10.setText(loopTime.get(10));
        String hourlyicon10 = hourlyIcon.get(10);
        String hourlytemp10 = hourlyTemp.get(10);
        if(hourlyicon10.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon10.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon10.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon10.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon10.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon10.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon10.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon10.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon10.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon10.setImageResource(imgid);
        temp10.setText(hourlytemp10);

        //第12个table

        hour11 = (TextView)findViewById(R.id.textView59);
        icon11 = (ImageView)findViewById(R.id.imageView13);
        temp11 = (TextView)findViewById(R.id.textView60);

        hour11.setText(loopTime.get(11));
        String hourlyicon11 = hourlyIcon.get(11);
        String hourlytemp11 = hourlyTemp.get(11);
        if(hourlyicon11.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon11.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon11.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon11.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon11.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon11.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon11.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon11.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon11.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon11.setImageResource(imgid);
        temp11.setText(hourlytemp11);


        //第13个table

        hour12 = (TextView)findViewById(R.id.textView61);
        icon12 = (ImageView)findViewById(R.id.imageView14);
        temp12 = (TextView)findViewById(R.id.textView62);

        hour12.setText(loopTime.get(12));
        String hourlyicon12 = hourlyIcon.get(12);
        String hourlytemp12 = hourlyTemp.get(12);
        if(hourlyicon12.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon12.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon12.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon12.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon12.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon12.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon12.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon12.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon12.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon12.setImageResource(imgid);
        temp12.setText(hourlytemp12);

        //第14个table

        hour13 = (TextView)findViewById(R.id.textView63);
        icon13 = (ImageView)findViewById(R.id.imageView15);
        temp13 = (TextView)findViewById(R.id.textView64);

        hour13.setText(loopTime.get(13));
        String hourlyicon13 = hourlyIcon.get(13);
        String hourlytemp13 = hourlyTemp.get(13);
        if(hourlyicon13.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon13.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon12.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon13.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon13.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon13.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon13.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon13.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon13.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon13.setImageResource(imgid);
        temp13.setText(hourlytemp13);


        //第15个table

        hour14 = (TextView)findViewById(R.id.textView65);
        icon14 = (ImageView)findViewById(R.id.imageView16);
        temp14 = (TextView)findViewById(R.id.textView66);

        hour14.setText(loopTime.get(14));
        String hourlyicon14 = hourlyIcon.get(14);
        String hourlytemp14 = hourlyTemp.get(14);
        if(hourlyicon14.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon14.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon14.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon14.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon14.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon14.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon14.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon14.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon14.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon14.setImageResource(imgid);
        temp14.setText(hourlytemp14);

        //第16个table

        hour15 = (TextView)findViewById(R.id.textView67);
        icon15 = (ImageView)findViewById(R.id.imageView17);
        temp15 = (TextView)findViewById(R.id.textView68);

        hour15.setText(loopTime.get(15));
        String hourlyicon15 = hourlyIcon.get(15);
        String hourlytemp15 = hourlyTemp.get(15);
        if(hourlyicon15.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon15.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon15.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon15.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon15.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon15.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon15.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon15.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon15.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon15.setImageResource(imgid);
        temp15.setText(hourlytemp15);

        //第17个table

        hour16 = (TextView)findViewById(R.id.textView69);
        icon16 = (ImageView)findViewById(R.id.imageView18);
        temp16 = (TextView)findViewById(R.id.textView70);

        hour16.setText(loopTime.get(16));
        String hourlyicon16 = hourlyIcon.get(16);
        String hourlytemp16 = hourlyTemp.get(16);
        if(hourlyicon16.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon16.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon16.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon16.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon16.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon16.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon16.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon16.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon16.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon16.setImageResource(imgid);
        temp16.setText(hourlytemp16);

        //第18个table

        hour17 = (TextView)findViewById(R.id.textView71);
        icon17 = (ImageView)findViewById(R.id.imageView19);
        temp17 = (TextView)findViewById(R.id.textView72);

        hour17.setText(loopTime.get(17));
        String hourlyicon17 = hourlyIcon.get(17);
        String hourlytemp17 = hourlyTemp.get(17);
        if(hourlyicon17.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon17.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon17.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon17.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon17.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon17.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon17.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon17.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon17.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon17.setImageResource(imgid);
        temp17.setText(hourlytemp17);

        //第19个table

        hour18 = (TextView)findViewById(R.id.textView73);
        icon18 = (ImageView)findViewById(R.id.imageView20);
        temp18 = (TextView)findViewById(R.id.textView74);

        hour18.setText(loopTime.get(18));
        String hourlyicon18 = hourlyIcon.get(18);
        String hourlytemp18 = hourlyTemp.get(18);
        if(hourlyicon18.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon18.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon18.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon18.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon18.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon18.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon18.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon18.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon18.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon18.setImageResource(imgid);
        temp18.setText(hourlytemp18);


        //第20个table

        hour19 = (TextView)findViewById(R.id.textView75);
        icon19 = (ImageView)findViewById(R.id.imageView21);
        temp19 = (TextView)findViewById(R.id.textView76);

        hour19.setText(loopTime.get(19));
        String hourlyicon19 = hourlyIcon.get(19);
        String hourlytemp19 = hourlyTemp.get(19);
        if(hourlyicon19.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon19.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon19.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon19.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon19.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon19.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon19.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon19.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon19.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon19.setImageResource(imgid);
        temp19.setText(hourlytemp19);


        //第21个table

        hour20 = (TextView)findViewById(R.id.textView77);
        icon20 = (ImageView)findViewById(R.id.imageView22);
        temp20 = (TextView)findViewById(R.id.textView78);

        hour20.setText(loopTime.get(20));
        String hourlyicon20 = hourlyIcon.get(20);
        String hourlytemp20 = hourlyTemp.get(20);
        if(hourlyicon20.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon20.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon20.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon20.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon20.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon20.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon20.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon20.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon20.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon20.setImageResource(imgid);
        temp20.setText(hourlytemp20);

        //第22个table

        hour21 = (TextView)findViewById(R.id.textView79);
        icon21 = (ImageView)findViewById(R.id.imageView23);
        temp21 = (TextView)findViewById(R.id.textView80);

        hour21.setText(loopTime.get(21));
        String hourlyicon21 = hourlyIcon.get(21);
        String hourlytemp21 = hourlyTemp.get(21);
        if(hourlyicon21.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon21.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon21.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon21.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon21.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon21.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon21.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon21.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon21.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon21.setImageResource(imgid);
        temp21.setText(hourlytemp21);

        //第23个table

        hour22 = (TextView)findViewById(R.id.textView81);
        icon22 = (ImageView)findViewById(R.id.imageView24);
        temp22 = (TextView)findViewById(R.id.textView82);

        hour22.setText(loopTime.get(22));
        String hourlyicon22 = hourlyIcon.get(22);
        String hourlytemp22 = hourlyTemp.get(22);
        if(hourlyicon22.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon22.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon22.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon22.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon22.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon22.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon22.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon22.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon22.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon22.setImageResource(imgid);
        temp22.setText(hourlytemp22);

        //第24个Table
        hour23 = (TextView)findViewById(R.id.textView83);
        icon23 = (ImageView)findViewById(R.id.imageView25);
        temp23 = (TextView)findViewById(R.id.textView84);

        hour23.setText(loopTime.get(23));
        String hourlyicon23 = hourlyIcon.get(23);
        String hourlytemp23 = hourlyTemp.get(23);
        if(hourlyicon23.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon23.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon23.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon23.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon23.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon23.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon23.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon23.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon23.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon23.setImageResource(imgid);
        temp23.setText(hourlytemp23);


        //第25个Table
        hour24 = (TextView)findViewById(R.id.textView85);
        icon24 = (ImageView)findViewById(R.id.imageView26);
        temp24 = (TextView)findViewById(R.id.textView86);

        hour24.setText(loopTime.get(24));
        String hourlyicon24 = hourlyIcon.get(24);
        String hourlytemp24 = hourlyTemp.get(24);
        if(hourlyicon24.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon24.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon24.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon24.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon24.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon24.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon24.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon24.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon24.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon24.setImageResource(imgid);
        temp24.setText(hourlytemp24);

        //第26个table

        hour25 = (TextView)findViewById(R.id.textView87);
        icon25 = (ImageView)findViewById(R.id.imageView27);
        temp25 = (TextView)findViewById(R.id.textView88);

        hour25.setText(loopTime.get(25));
        String hourlyicon25 = hourlyIcon.get(25);
        String hourlytemp25 = hourlyTemp.get(25);
        if(hourlyicon25.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon25.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon25.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon25.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon25.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon25.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon25.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon25.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon25.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon25.setImageResource(imgid);
        temp25.setText(hourlytemp25);

        //第27个table

        hour26 = (TextView)findViewById(R.id.textView89);
        icon26 = (ImageView)findViewById(R.id.imageView28);
        temp26 = (TextView)findViewById(R.id.textView90);

        hour26.setText(loopTime.get(26));
        String hourlyicon26 = hourlyIcon.get(26);
        String hourlytemp26 = hourlyTemp.get(26);
        if(hourlyicon26.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon26.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon26.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon26.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon26.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon26.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon26.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon26.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon26.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon26.setImageResource(imgid);
        temp26.setText(hourlytemp26);


        //第28个table

        hour27 = (TextView)findViewById(R.id.textView91);
        icon27 = (ImageView)findViewById(R.id.imageView29);
        temp27 = (TextView)findViewById(R.id.textView92);

        hour27.setText(loopTime.get(27));
        String hourlyicon27 = hourlyIcon.get(27);
        String hourlytemp27 = hourlyTemp.get(27);
        if(hourlyicon27.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon27.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon27.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon27.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon27.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon27.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon27.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon27.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon27.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon27.setImageResource(imgid);
        temp27.setText(hourlytemp27);

        //第29个table

        hour28 = (TextView)findViewById(R.id.textView93);
        icon28 = (ImageView)findViewById(R.id.imageView30);
        temp28 = (TextView)findViewById(R.id.textView94);

        hour28.setText(loopTime.get(28));
        String hourlyicon28 = hourlyIcon.get(28);
        String hourlytemp28 = hourlyTemp.get(28);
        if(hourlyicon28.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon28.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon28.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon28.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon28.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon28.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon28.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon28.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon28.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon28.setImageResource(imgid);
        temp28.setText(hourlytemp28);


        //第30个table
        hour29 = (TextView)findViewById(R.id.textView95);
        icon29 = (ImageView)findViewById(R.id.imageView31);
        temp29 = (TextView)findViewById(R.id.textView96);

        hour29.setText(loopTime.get(29));
        String hourlyicon29 = hourlyIcon.get(29);
        String hourlytemp29 = hourlyTemp.get(29);
        if(hourlyicon29.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon29.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon29.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon29.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon29.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon29.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon29.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon29.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon29.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon29.setImageResource(imgid);
        temp29.setText(hourlytemp29);



        //第31个table
        hour30 = (TextView)findViewById(R.id.textView97);
        icon30 = (ImageView)findViewById(R.id.imageView32);
        temp30 = (TextView)findViewById(R.id.textView98);

        hour30.setText(loopTime.get(30));
        String hourlyicon30 = hourlyIcon.get(30);
        String hourlytemp30 = hourlyTemp.get(30);
        if(hourlyicon30.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon30.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon30.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon30.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon30.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon30.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon30.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon30.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon30.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon30.setImageResource(imgid);
        temp30.setText(hourlytemp30);


        //第32个table
        hour31 = (TextView)findViewById(R.id.textView99);
        icon31 = (ImageView)findViewById(R.id.imageView33);
        temp31 = (TextView)findViewById(R.id.textView100);

        hour31.setText(loopTime.get(31));
        String hourlyicon31 = hourlyIcon.get(31);
        String hourlytemp31 = hourlyTemp.get(31);
        if(hourlyicon31.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon31.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon31.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon31.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon31.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon31.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon31.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon31.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon31.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon31.setImageResource(imgid);
        temp31.setText(hourlytemp31);



        //第33个table
        hour32 = (TextView)findViewById(R.id.textView101);
        icon32 = (ImageView)findViewById(R.id.imageView34);
        temp32 = (TextView)findViewById(R.id.textView102);

        hour32.setText(loopTime.get(32));
        String hourlyicon32 = hourlyIcon.get(32);
        String hourlytemp32 = hourlyTemp.get(32);
        if(hourlyicon32.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon32.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon32.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon32.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon32.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon32.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon32.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon32.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon32.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon32.setImageResource(imgid);
        temp32.setText(hourlytemp32);

        //第34个table
        hour33 = (TextView)findViewById(R.id.textView103);
        icon33 = (ImageView)findViewById(R.id.imageView35);
        temp33 = (TextView)findViewById(R.id.textView104);

        hour33.setText(loopTime.get(33));
        String hourlyicon33 = hourlyIcon.get(33);
        String hourlytemp33 = hourlyTemp.get(33);
        if(hourlyicon33.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon33.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon33.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon33.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon33.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon33.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon33.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon33.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon33.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon33.setImageResource(imgid);
        temp33.setText(hourlytemp33);


        //第35个table
        hour34 = (TextView)findViewById(R.id.textView105);
        icon34 = (ImageView)findViewById(R.id.imageView36);
        temp34 = (TextView)findViewById(R.id.textView106);

        hour34.setText(loopTime.get(34));
        String hourlyicon34 = hourlyIcon.get(34);
        String hourlytemp34 = hourlyTemp.get(34);
        if(hourlyicon34.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon34.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon34.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon34.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon34.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon34.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon34.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon34.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon34.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon34.setImageResource(imgid);
        temp34.setText(hourlytemp34);


        //第36个table
        hour35 = (TextView)findViewById(R.id.textView107);
        icon35 = (ImageView)findViewById(R.id.imageView37);
        temp35 = (TextView)findViewById(R.id.textView108);

        hour35.setText(loopTime.get(35));
        String hourlyicon35 = hourlyIcon.get(35);
        String hourlytemp35 = hourlyTemp.get(35);
        if(hourlyicon35.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon35.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon35.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon35.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon35.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon35.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon35.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon35.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon35.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon35.setImageResource(imgid);
        temp35.setText(hourlytemp35);

        //37个table


        hour36 = (TextView)findViewById(R.id.textView109);
        icon36 = (ImageView)findViewById(R.id.imageView38);
        temp36 = (TextView)findViewById(R.id.textView110);

        hour36.setText(loopTime.get(36));
        String hourlyicon36 = hourlyIcon.get(36);
        String hourlytemp36 = hourlyTemp.get(36);
        if(hourlyicon36.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon36.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon36.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon36.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon36.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon36.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon36.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon36.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon36.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon36.setImageResource(imgid);
        temp36.setText(hourlytemp36);


        //38个table


        hour37 = (TextView)findViewById(R.id.textView111);
        icon37 = (ImageView)findViewById(R.id.imageView39);
        temp37 = (TextView)findViewById(R.id.textView112);

        hour37.setText(loopTime.get(37));
        String hourlyicon37 = hourlyIcon.get(37);
        String hourlytemp37 = hourlyTemp.get(37);
        if(hourlyicon37.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon37.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon37.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon37.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon37.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon37.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon37.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon37.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon37.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon37.setImageResource(imgid);
        temp37.setText(hourlytemp37);

        //39个table


        hour38 = (TextView)findViewById(R.id.textView113);
        icon38 = (ImageView)findViewById(R.id.imageView40);
        temp38 = (TextView)findViewById(R.id.textView114);

        hour38.setText(loopTime.get(38));
        String hourlyicon38 = hourlyIcon.get(38);
        String hourlytemp38 = hourlyTemp.get(38);
        if(hourlyicon38.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon38.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon38.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon38.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon38.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon38.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon38.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon38.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon38.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon38.setImageResource(imgid);
        temp38.setText(hourlytemp38);

        //40个table

        hour39 = (TextView)findViewById(R.id.textView115);
        icon39 = (ImageView)findViewById(R.id.imageView41);
        temp39 = (TextView)findViewById(R.id.textView116);

        hour39.setText(loopTime.get(39));
        String hourlyicon39 = hourlyIcon.get(39);
        String hourlytemp39 = hourlyTemp.get(39);
        if(hourlyicon39.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon39.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon39.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon39.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon39.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon39.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon39.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon39.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon39.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon39.setImageResource(imgid);
        temp39.setText(hourlytemp39);

        //41个table

        hour40 = (TextView)findViewById(R.id.textView117);
        icon40 = (ImageView)findViewById(R.id.imageView42);
        temp40 = (TextView)findViewById(R.id.textView118);

        hour40.setText(loopTime.get(40));
        String hourlyicon40 = hourlyIcon.get(40);
        String hourlytemp40 = hourlyTemp.get(40);
        if(hourlyicon40.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon40.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon40.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon40.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon40.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon40.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon40.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon40.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon40.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon40.setImageResource(imgid);
        temp40.setText(hourlytemp40);

        //42个table


        hour41 = (TextView)findViewById(R.id.textView119);
        icon41 = (ImageView)findViewById(R.id.imageView43);
        temp41 = (TextView)findViewById(R.id.textView120);

        hour41.setText(loopTime.get(41));
        String hourlyicon41 = hourlyIcon.get(41);
        String hourlytemp41 = hourlyTemp.get(41);
        if(hourlyicon41.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon41.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon41.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon41.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon41.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon41.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon41.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon41.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon41.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon41.setImageResource(imgid);
        temp41.setText(hourlytemp41);


        //43个table


        hour42 = (TextView)findViewById(R.id.textView121);
        icon42 = (ImageView)findViewById(R.id.imageView44);
        temp42 = (TextView)findViewById(R.id.textView122);

        hour42.setText(loopTime.get(42));
        String hourlyicon42 = hourlyIcon.get(42);
        String hourlytemp42 = hourlyTemp.get(42);
        if(hourlyicon42.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon42.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon42.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon42.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon42.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon42.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon42.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon42.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon42.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon42.setImageResource(imgid);
        temp42.setText(hourlytemp42);


        //44个table


        hour43 = (TextView)findViewById(R.id.textView123);
        icon43 = (ImageView)findViewById(R.id.imageView45);
        temp43 = (TextView)findViewById(R.id.textView124);

        hour43.setText(loopTime.get(43));
        String hourlyicon43 = hourlyIcon.get(43);
        String hourlytemp43 = hourlyTemp.get(43);
        if(hourlyicon43.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon43.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon43.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon43.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon43.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon43.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon43.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon43.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon43.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon43.setImageResource(imgid);
        temp43.setText(hourlytemp43);



        //45个table


        hour44 = (TextView)findViewById(R.id.textView125);
        icon44 = (ImageView)findViewById(R.id.imageView46);
        temp44 = (TextView)findViewById(R.id.textView126);

        hour44.setText(loopTime.get(44));
        String hourlyicon44 = hourlyIcon.get(44);
        String hourlytemp44 = hourlyTemp.get(44);
        if(hourlyicon44.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon44.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon44.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon44.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon44.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon44.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon44.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon44.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon44.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon44.setImageResource(imgid);
        temp44.setText(hourlytemp43);


        //第46个table
        hour45 = (TextView)findViewById(R.id.textView127);
        icon45 = (ImageView)findViewById(R.id.imageView47);
        temp45 = (TextView)findViewById(R.id.textView128);

        hour45.setText(loopTime.get(45));
        String hourlyicon45 = hourlyIcon.get(45);
        String hourlytemp45 = hourlyTemp.get(45);
        if(hourlyicon45.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon45.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon45.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon45.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon45.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon45.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon45.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon45.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon45.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon45.setImageResource(imgid);
        temp45.setText(hourlytemp45);

        //第47个table
        hour46 = (TextView)findViewById(R.id.textView129);
        icon46 = (ImageView)findViewById(R.id.imageView48);
        temp46 = (TextView)findViewById(R.id.textView130);

        hour46.setText(loopTime.get(46));
        String hourlyicon46 = hourlyIcon.get(46);
        String hourlytemp46 = hourlyTemp.get(46);
        if(hourlyicon46.equals("clear-day")){imgid =  R.drawable.clear; }
        else if (hourlyicon46.equals("clear-night")){imgid = R.drawable.clear_night; }
        else if (hourlyicon46.equals("rain")){imgid = R.drawable.rain;}
        else if (hourlyicon46.equals("snow")){imgid = R.drawable.snow;}
        else if (hourlyicon46.equals("sleet")){imgid = R.drawable.sleet;}
        else if (hourlyicon46.equals("wind")){imgid = R.drawable.wind;}
        else if (hourlyicon46.equals("fog")){imgid = R.drawable.fog;}
        else if (hourlyicon46.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
        else if (hourlyicon46.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}

        icon46.setImageResource(imgid);
        temp46.setText(hourlytemp46);


//        //第48个table
//        hour47 = (TextView)findViewById(R.id.textView131);
//        icon47 = (ImageView)findViewById(R.id.imageView49);
//        temp47 = (TextView)findViewById(R.id.textView132);
//
//        hour47.setText(loopTime.get(47));
//        String hourlyicon47 = hourlyIcon.get(47);
//        String hourlytemp47 = hourlyTemp.get(47);
//        if(hourlyicon47.equals("clear-day")){imgid =  R.drawable.clear; }
//        else if (hourlyicon47.equals("clear-night")){imgid = R.drawable.clear_night; }
//        else if (hourlyicon47.equals("rain")){imgid = R.drawable.rain;}
//        else if (hourlyicon47.equals("snow")){imgid = R.drawable.snow;}
//        else if (hourlyicon47.equals("sleet")){imgid = R.drawable.sleet;}
//        else if (hourlyicon47.equals("wind")){imgid = R.drawable.wind;}
//        else if (hourlyicon47.equals("fog")){imgid = R.drawable.fog;}
//        else if (hourlyicon47.equals("partly-cloudy-day")){imgid = R.drawable.cloud_day;}
//        else if (hourlyicon47.equals("partly-cloudy-night")){imgid = R.drawable.cloud_night;}
//
//        icon47.setImageResource(imgid);
//        temp47.setText(hourlytemp47);

    }

}
