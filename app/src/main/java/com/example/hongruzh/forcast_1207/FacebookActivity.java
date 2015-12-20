package com.example.hongruzh.forcast_1207;

/**
 * Created by hongruzh on 12/8/15.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.widget.ShareButton;
import com.facebook.share.widget.ShareDialog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FacebookActivity extends FragmentActivity{

    CallbackManager callbackManager;
    ShareDialog shareDialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.facebook);

        String city = getIntent().getStringExtra("city");
        String state = getIntent().getStringExtra("state");
        String degree =getIntent().getStringExtra("degreeInfo");

        String imgIcon = getIntent().getStringExtra("imgIcon");
        String temperature_r = getIntent().getStringExtra("temperature_r");
        String summaryDes_r =  getIntent().getStringExtra("summaryDes_r");

         String imgurl = null;

        if(imgIcon.equals("clear-day")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/clear.png" ; }
        else if (imgIcon.equals("clear-night")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/clear_night.png";}
        else if (imgIcon.equals("rain")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/rain.png" ;}
        else if (imgIcon.equals("snow")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/snow.png" ;}
        else if (imgIcon.equals("sleet")){imgurl ="http://cs-server.usc.edu:45678/hw/hw8/images/sleet.png" ;}
        else if (imgIcon.equals("wind")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/wind.png";}
        else if (imgIcon.equals("fog")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/fog.png";}
        else if (imgIcon.equals("partly-cloudy-day")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/cloud_day.png";}
        else if (imgIcon.equals("partly-cloudy-night")){imgurl = "http://cs-server.usc.edu:45678/hw/hw8/images/cloud_night.png";}

        callbackManager = CallbackManager.Factory.create();
        shareDialog = new ShareDialog(this);

        shareDialog.registerCallback(callbackManager, new FacebookCallback<Sharer.Result>() {
            @Override
            public void onSuccess(Sharer.Result result) {
                Toast.makeText(getApplicationContext(),"Posted Successfully!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {
                Log.e("FB", "cancel");
                Toast.makeText(getApplicationContext(),"Posted Cancelled!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException e) {
                Log.e("FB", "error");
                Toast.makeText(getApplicationContext(),"Posted Cancelled!",Toast.LENGTH_LONG).show();
            }

        });



        if (ShareDialog.canShow(ShareLinkContent.class)) {
            ShareLinkContent linkContent = new ShareLinkContent.Builder()
                    .setContentUrl(Uri.parse("http://forecast.io"))
                    .setImageUrl(Uri.parse(imgurl))
                    .setContentTitle("Current Weather in" + " " + city + "," + state)
                    .setContentDescription(summaryDes_r+" "+temperature_r)
                    .build();
            shareDialog.show(linkContent);
        }
    }
    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);

    }
}

