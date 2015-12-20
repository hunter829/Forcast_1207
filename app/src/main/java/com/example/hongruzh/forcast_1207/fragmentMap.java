package com.example.hongruzh.forcast_1207;

import android.app.Fragment;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.hamweather.aeris.communication.Action;
import com.hamweather.aeris.communication.AerisCallback;
import com.hamweather.aeris.communication.AerisEngine;
import com.hamweather.aeris.communication.AerisRequest;
import com.hamweather.aeris.communication.BatchBuilder;
import com.hamweather.aeris.communication.BatchCallback;
import com.hamweather.aeris.communication.BatchCommunicationTask;
import com.hamweather.aeris.communication.Endpoint;
import com.hamweather.aeris.communication.EndpointType;
import com.hamweather.aeris.communication.loaders.ObservationsTask;
import com.hamweather.aeris.communication.loaders.ObservationsTaskCallback;
import com.hamweather.aeris.communication.parameter.FieldsParameter;
import com.hamweather.aeris.communication.parameter.PlaceParameter;
import com.hamweather.aeris.maps.AerisMapView;
import com.hamweather.aeris.maps.AerisMapView.AerisMapType;
import com.hamweather.aeris.maps.MapViewFragment;
import com.hamweather.aeris.maps.interfaces.OnAerisMapLongClickListener;
import com.hamweather.aeris.maps.interfaces.OnAerisMarkerInfoWindowClickListener;
import com.hamweather.aeris.model.AerisBatchResponse;
import com.hamweather.aeris.model.AerisError;
import com.hamweather.aeris.model.AerisResponse;
import com.hamweather.aeris.response.ObservationResponse;
import com.hamweather.aeris.tiles.AerisTile;

import java.util.List;


public class fragmentMap extends MapViewFragment implements
        OnAerisMapLongClickListener, AerisCallback{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AerisEngine.initWithKeys(this.getString(R.string.aeris_client_id), this.getString(R.string.aeris_client_secret), getActivity());


        Bundle bundle = getArguments();

        double lat = bundle.getDouble("lat");
        double lng = bundle.getDouble("lng");

        Location location = new Location("");
        location.setLatitude(lat);
        location.setLongitude(lng);

        View view = inflater.inflate(R.layout.fragment_map, container, false);
        mapView = (AerisMapView) view.findViewById(R.id.fragment_map);
        mapView.init(savedInstanceState, AerisMapType.GOOGLE);
        mapView.setOnAerisMapLongClickListener(this);
        mapView.moveToLocation(location,7);
        mapView.addLayer(AerisTile.RADSAT);
        return view;
    }

    @Override
    public void onMapLongClick(double lat, double longitude) {
        // code to handle map long press. i.e. Fetch current conditions?
        // see demo app MapFragment.java
    }
    @Override
    public void onResult(EndpointType endpointType, AerisResponse aerisResponse) {

   }

}
