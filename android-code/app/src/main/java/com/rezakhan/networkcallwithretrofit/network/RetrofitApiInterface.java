package com.rezakhan.networkcallwithretrofit.network;

import com.rezakhan.networkcallwithretrofit.model.User;
import com.rezakhan.networkcallwithretrofit.model.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitApiInterface {

    @POST("retrofit_get_post/server_side_code.php")
    Call<ServerResponse> getUserValidity(@Body User userLoginCredential);

    @GET("retrofit_get_post/server_side_code.php")
    Call<ServerResponse> getJoke(@Query("user_id") String userId);
}

