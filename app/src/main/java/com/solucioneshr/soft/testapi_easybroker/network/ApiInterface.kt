package com.solucioneshr.soft.testapi_easybroker.network

import com.solucioneshr.soft.testapi_easybroker.data.Data_Properties
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {

    @Headers("X-Authorization: l7u502p8v46ba3ppgvj5y2aad50lb9")
    @GET("properties")
    fun getData(): Call<Data_Properties>

}