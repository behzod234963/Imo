package com.example.imo.adapter

import android.media.tv.TvView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imo.R
import com.example.imo.model.User

class ImoAdapter(val list:ArrayList<User>):RecyclerView.Adapter<ImoAdapter.ImoViewHolder>() {

    class ImoViewHolder(view:View):RecyclerView.ViewHolder(view){

        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile)
        val tvName=view.findViewById<TextView>(R.id.tv_name)
        val tvMessage=view.findViewById<TextView>(R.id.tv_message)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)
        val ivStatus=view.findViewById<ImageView>(R.id.iv_status)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImoViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_imo,parent,false)
        return ImoViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: ImoViewHolder, position: Int) {

        val user=list[position]
        holder.tvName.text=user.name
        holder.tvMessage.text=user.message
        holder.tvTime.text=user.time
        Glide.with(holder.ivProfile).load(user.profile).into(holder.ivProfile)
        if(user.status){

            holder.ivStatus.visibility=View.VISIBLE

        }else{

            holder.ivStatus.visibility=View.GONE

        }

    }

}