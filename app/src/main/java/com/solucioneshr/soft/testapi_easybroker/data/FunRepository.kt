package com.solucioneshr.soft.testapi_easybroker.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.solucioneshr.soft.testapi_easybroker.network.ApiClient
import com.solucioneshr.soft.testapi_easybroker.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FunRepository {
    private var apiInterface: ApiInterface?=null

    init {
        apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    }

    fun getDataJson(): LiveData<Data_Properties>{
        val dataResponse = MutableLiveData<Data_Properties>()

        apiInterface?.getData()?.enqueue(object : Callback<Data_Properties>{

            override fun onResponse(call: Call<Data_Properties>, response: Response<Data_Properties>) {
                val res = response.body()
                if (response.code() == 200 &&  res!=null){
                    dataResponse.value = res
                }else{
                    dataResponse.value = null
                }
            }

            override fun onFailure(call: Call<Data_Properties>, t: Throwable) {
                dataResponse.value = null
            }

        })
        return dataResponse
    }
}