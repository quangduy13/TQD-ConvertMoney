package com.example.quangduy.moneyconvert.service;

import com.example.quangduy.moneyconvert.dto.MoneyDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by quangduy on 20/03/2017.
 */

public interface MoneyService {
    @GET("/api/live")
    Call<MoneyDTO> getListMoney(@Query("access_key")String access_key, @Query("currencies") String currencies);
}
