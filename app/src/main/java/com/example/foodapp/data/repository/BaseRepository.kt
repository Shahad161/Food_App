package com.example.foodapp.data.repository

import android.util.Log
import retrofit2.Response

abstract class BaseRepository {

    protected suspend fun <T> wrap(function: suspend () -> Response<T>): T {
        val response = function()
        return if (response.isSuccessful) {
            response.body()!!
        } else {
            Log.i("aaa", response.body().toString())
            throw Throwable("response is not successful")
        }
    }
}