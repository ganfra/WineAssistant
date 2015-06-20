package com.example.damien.wineassistant;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * Created by Damien on 6/20/2015.
 */
public class WineClient {

    private static final String URL = "http://services.wine.com/api/beta2/service.svc/json";
    private static final String API_KEY = "43cdc8b09cb6a73de8323fcb05ee6498";
    private static WineService wineService;

    static {
        initWineAdapter();
    }

    private WineClient() {
    }

    public static WineService get() {
        return wineService;
    }

    private static void initWineAdapter() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addQueryParam("apikey", API_KEY);
                    }
                })
                .setEndpoint(URL)
                .build();

        wineService = restAdapter.create(WineService.class);
    }
}
