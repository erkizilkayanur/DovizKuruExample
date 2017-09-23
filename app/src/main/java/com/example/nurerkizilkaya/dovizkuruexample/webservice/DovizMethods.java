package com.example.nurerkizilkaya.dovizkuruexample.webservice;

import com.example.nurerkizilkaya.dovizkuruexample.model.Doviz;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by a s u s on 18.9.2017.
 */
public interface DovizMethods {
  @GET("doviz_json.asp")
  Call<Doviz> getDoviz();


}


