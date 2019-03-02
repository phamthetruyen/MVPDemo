package com.example.mvpdemo.Api;

import com.example.mvpdemo.Model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/bins/nl4ya")
    Call<ItemResponse> getItems();

}
