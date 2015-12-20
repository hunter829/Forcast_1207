package com.example.hongruzh.forcast_1207;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final String LOG_TAG = "MainActivity";
    //define button and so on
    Button searchBtn;
    Button clearBtn;
    Button aboutBtn;
    Spinner stateSpinner;
    EditText streetContent;
    EditText cityContent;
    RadioButton fa;
    RadioButton cs;
    TextView alert;

    RadioGroup degreeContent;
    String degreeInfo;


    public static String URL = "http://forcastenv-env.elasticbeanstalk.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.example.hongruzh.forecast_1207",
                    PackageManager.GET_SIGNATURES);
            for (android.content.pm.Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final AsyncTaskarseJson AsyncTask = new AsyncTaskarseJson();


        searchBtn = (Button)findViewById(R.id.button3);
        clearBtn = (Button)findViewById(R.id.button4);
        aboutBtn = (Button)findViewById(R.id.button5);
        stateSpinner = (Spinner)findViewById(R.id.spinner);
        streetContent = (EditText)findViewById(R.id.editText1);
        cityContent = (EditText)findViewById(R.id.editText2);
        fa=(RadioButton)findViewById(R.id.radioButton);
        cs=(RadioButton)findViewById(R.id.radioButton2);
        alert = (TextView)findViewById(R.id.textViewalert);
        degreeContent=(RadioGroup)findViewById(R.id.degree);


        aboutBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                streetContent.setText("");
                cityContent.setText("");
                stateSpinner.setSelection(0);
                fa.setChecked(false);
                cs.setChecked(false);
                alert.setText("");

            }
        });

        ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://forecast.io"));
                startActivity(intent);
            }
        });

        degreeContent.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, final int checkedId) {

                searchBtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Log.v("Street", streetContent.getText().toString());
                        Log.v("City", cityContent.getText().toString());
                        String city_Content = cityContent.getText().toString();

                        Log.v("State", stateSpinner.getSelectedItem().toString());
                        String state_Content = stateSpinner.getSelectedItem().toString();


                        if (checkedId == fa.getId()) {
                            degreeInfo = "us";
                        } else {
                            degreeInfo = "si";
                        }


                        Log.v("degree", degreeInfo);
                        if (streetContent.getText().toString().trim().equals("")) {
                            alert.setText("Please Enter a Street");
                        }
                        else if (cityContent.getText().toString().trim().equals("")) {
                            alert.setText("Please Enter a City");
                        }
                        else if(stateSpinner.getSelectedItem().toString().equals("select")){
                            alert.setText("Please Select a State");
                        }
                        else{
                            String jsonUrl = URL+"?address="
                                    + streetContent.getText().toString().trim().replace(" ", "+") + "&city="
                                    + cityContent.getText().toString().trim().replace(" ", "+") + "&state="
                                    + stateSpinner.getSelectedItem().toString() + "&degree=" + degreeInfo;
                            Log.v("jsonUrl",jsonUrl);
                            AsyncTaskarseJson task = new AsyncTaskarseJson(MainActivity.this);
                            task.execute(jsonUrl,degreeInfo,city_Content,state_Content);
                        }

                    }
                });

            }
        });



        //spinner element  google
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.spinneArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }




}


