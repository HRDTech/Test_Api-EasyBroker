package com.solucioneshr.soft.testapi_easybroker

import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.solucioneshr.soft.testapi_easybroker.data.Content
import com.solucioneshr.soft.testapi_easybroker.viewmodel.FunViewModels
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : ViewModelStoreOwner {
    private lateinit var vm: FunViewModels

    @Test
    fun read_Data() {
        vm = ViewModelProvider(this)[FunViewModels::class.java]
        vm.getDataJson()


    }

    override fun getViewModelStore(): ViewModelStore {
        TODO("Not yet implemented")
    }
}

