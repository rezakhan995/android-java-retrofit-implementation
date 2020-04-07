package com.rezakhan.networkcallwithretrofit.Network;

public interface ResponseCallback<T> {
    void onSuccess(T data);
    void onError(Throwable th);
}
