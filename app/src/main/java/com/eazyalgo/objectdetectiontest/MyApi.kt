package com.eazyalgo.objectdetectiontest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MyApi {
    @GET("posts/{id}")
    fun getDataById(@Path("id") id: Int) : Call<DataItem>
}