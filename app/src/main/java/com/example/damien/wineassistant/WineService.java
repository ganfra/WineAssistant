package com.example.damien.wineassistant;

import com.example.damien.wineassistant.data.WineResult;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Damien on 6/20/2015.
 */
public interface WineService {

    @GET("/{resource}")
    void getAll(@Path("resource") String resource, @Query("size") Integer nbResults, @Query("term") String wineName, Callback<WineResult> callBack);


}
