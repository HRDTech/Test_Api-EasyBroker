package com.solucioneshr.soft.testapi_easybroker.ui

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.solucioneshr.soft.testapi_easybroker.R
import com.solucioneshr.soft.testapi_easybroker.data.Content
import com.squareup.picasso.Picasso
import java.util.*

class ItemsRVAdapter (): RecyclerView.Adapter<ItemsRVAdapter.RVViewHolder>(){
    private var data : ArrayList<Content>?=null

fun setData(list: ArrayList<Content>){
    data = list
    notifyDataSetChanged()
}

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
    return RVViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false))
}

override fun getItemCount(): Int {
    return data?.size ?: 0
}

override fun onBindViewHolder(holder: RVViewHolder, position: Int) {
    val item = data?.get(position)
    holder.bindView(item)
    /*holder.itemView.img_delete.setOnClickListener {
        item?.let { it1 ->
            listener.onItemDeleted(it1, position)
        }
    }*/
}

class RVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bindView(item: Content?) {
        itemView.findViewById<TextView>(R.id.textLayoutItem).text = item?.title
        var urlImg = item?.title_image_thumb
        Picasso.get().load(urlImg).into(itemView.findViewById<ImageView>(R.id.imgLayoutItem))
    }

}
}


