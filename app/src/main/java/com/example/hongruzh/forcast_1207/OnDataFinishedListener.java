package com.example.hongruzh.forcast_1207;

import org.json.JSONObject;

/**
 * Created by hongruzh on 12/7/15.
 */
public interface OnDataFinishedListener {
    public void onDataSuccessfully(JSONObject data);

    public void onDataFailed();
}
