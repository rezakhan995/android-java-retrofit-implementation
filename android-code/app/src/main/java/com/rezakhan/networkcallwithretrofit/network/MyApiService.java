package com.rezakhan.networkcallwithretrofit.network;

import com.rezakhan.networkcallwithretrofit.model.User;

public interface MyApiService {
    void userValidityCheck(User userLoginCredential, ResponseCallback<String> callback);
    void getJokeFromServer(String userId, ResponseCallback<String> callback);
}
