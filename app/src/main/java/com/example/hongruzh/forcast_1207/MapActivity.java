package com.example.hongruzh.forcast_1207;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hamweather.aeris.communication.AerisEngine;
import com.hamweather.aeris.communication.loaders.ObservationsTask;
import com.hamweather.aeris.communication.loaders.ObservationsTaskCallback;
import com.hamweather.aeris.communication.parameter.PlaceParameter;
import com.hamweather.aeris.model.AerisError;

import java.util.List;

/**
 * Created by hongruzh on 12/8/15.
 */
public class MapActivity  extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frame = new FrameLayout(this);
        setContentView(frame, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        frame.setId(R.id.content);

        AerisEngine.initWithKeys(this.getString(R.string.aeris_client_id), this.getString(R.string.aeris_client_secret), this);

        double lat = getIntent().getDoubleExtra("lat",0);
        double lon = getIntent().getDoubleExtra("lon",0);
        PlaceParameter place = new PlaceParameter("lat,lon");





        Fragment fragment = new fragmentMap();
        Bundle bundle = new Bundle();
        bundle.putDouble("lat", lat);
        bundle.putDouble("lng", lon);

        fragment.setArguments(bundle);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.content,fragment).commit();






        ObservationsTask task = new ObservationsTask(this,
                new ObservationsTaskCallback() {

                    @Override
                    public void onObservationsFailed(AerisError error) {
                        // handle fail here
                    }

                    @Override
                    public void onObservationsLoaded(List responses) {
                        // handle successful loading here.
                    }

                });

    }

}
