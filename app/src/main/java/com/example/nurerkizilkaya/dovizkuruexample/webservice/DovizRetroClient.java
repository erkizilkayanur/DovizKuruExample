package com.example.nurerkizilkaya.dovizkuruexample.webservice;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by a s u s on 18.9.2017.
 */
public class DovizRetroClient {
    public static final String BASE_URL="http://www.doviz.gen.tr/";
    private static  Retrofit retrofit=null;
    public static  Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient())
                    .build();
        }
        return  retrofit;
    }
}

