package com.avinash.weather15june.interfaces;

/**
 * Created by Avinash.Padalkar on 15/06/2017.
 */

public interface ResponseListener {

    void onSuccess(String response);
    void onFail(String response);
    void onError(String response);
}
