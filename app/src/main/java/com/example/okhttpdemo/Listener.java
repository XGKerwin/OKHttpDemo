package com.example.okhttpdemo;

import java.io.IOException;

public interface Listener<T> {
    void onResponse(T response);

    void onErrorResponse(IOException error);
}
