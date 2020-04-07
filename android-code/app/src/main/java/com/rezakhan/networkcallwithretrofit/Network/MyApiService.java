package com.rezakhan.networkcallwithretrofit.Network;

import com.rezakhan.networkcallwithretrofit.Model.User;

public interface MyApiService {
    void userValidityCheck(User userLoginCredential, ResponseCallback<String> callback);
    void getJokeFromServer(String userId, ResponseCallback<String> callback);
}
