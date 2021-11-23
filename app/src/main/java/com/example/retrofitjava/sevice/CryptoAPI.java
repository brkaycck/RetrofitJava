package com.example.retrofitjava.sevice;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    // URL BASE --> www.website.com
    //GET --> price?key=xxxx
    //https://api.nomics.com/v1/prices?key=0261f7fb314f93d33719c29e9c8512dc0c7f5853

    @GET("prices?key=0261f7fb314f93d33719c29e9c8512dc0c7f5853")
    Observable<List<CryptoModel>> getData();



    //Call<List<CryptoModel>> getData();

}
