package com.example.imo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imo.R
import com.example.imo.model.Users

class ImoAdapter(val list:ArrayList<Users>):RecyclerView.Adapter<ImoAdapter.ImoViewHolder>() {

    class ImoViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile)
        val ivStatus=view.findViewById<ImageView>(R.id.iv_status)
        val tvName=view.findViewById<TextView>(R.id.tv_name)
        val tvMessage=view.findViewById<TextView>(R.id.tv_message)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImoViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_imo,parent,false)
        return ImoViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: ImoViewHolder, position: Int) {

        val users=list[position]
        holder.tvName.text=users.name
        holder.tvMessage.text=users.message
        holder.tvTime.text=users.time
        Glide.with(holder.ivProfile).load(users.profile).into(holder.ivProfile)

        if (users.status){

            holder.ivStatus.visibility=View.VISIBLE

        }else{

            holder.ivStatus.visibility=View.GONE

        }

    }

}