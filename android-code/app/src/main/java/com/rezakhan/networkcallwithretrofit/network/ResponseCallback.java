package com.rezakhan.networkcallwithretrofit.network;

public interface ResponseCallback<T> {
    void onSuccess(T data);
    void onError(Throwable th);
}
