package com.solucioneshr.soft.testapi_easybroker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.solucioneshr.soft.testapi_easybroker.data.Data_Properties
import com.solucioneshr.soft.testapi_easybroker.data.FunRepository

class FunViewModels(application: Application): AndroidViewModel(application) {
    private var funRepository: FunRepository? = null
    var getModelLiveData: LiveData<Data_Properties>? = null

    init {
        funRepository = FunRepository()
        getModelLiveData = MutableLiveData()
    }

    fun getDataJson(){
        getModelLiveData = funRepository?.getDataJson()
    }

}