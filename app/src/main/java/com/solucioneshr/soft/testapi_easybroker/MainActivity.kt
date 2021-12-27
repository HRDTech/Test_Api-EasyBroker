package com.solucioneshr.soft.testapi_easybroker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.solucioneshr.soft.testapi_easybroker.data.Content
import com.solucioneshr.soft.testapi_easybroker.ui.ItemsRVAdapter
import com.solucioneshr.soft.testapi_easybroker.viewmodel.FunViewModels

class MainActivity : AppCompatActivity() {
    private lateinit var vm: FunViewModels
    private lateinit var adapter: ItemsRVAdapter
    private lateinit var rvHome: RecyclerView
    private lateinit var layoutProgress: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutProgress = findViewById(R.id.layoutProgress)
        rvHome = findViewById(R.id.rvMainActivity)
        vm = ViewModelProvider(this)[FunViewModels::class.java]
        initAdapter()
        vm.getDataJson()
        vm.getModelLiveData?.observe(this, Observer {
            if (it!=null){
                adapter.setData(it.content as ArrayList<Content>)
            }else{
                showToast("Something went wrong")
            }
            layoutProgress.visibility = View.GONE
        })


    }

    private fun initAdapter() {
        adapter = ItemsRVAdapter()
        rvHome.layoutManager = LinearLayoutManager(this)
        rvHome.setHasFixedSize(true)
        rvHome.adapter = adapter
    }

    private fun showToast(msg:String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}