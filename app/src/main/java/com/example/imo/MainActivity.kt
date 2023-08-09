package com.example.imo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.adapter.ImoAdapter
import com.example.imo.model.User

class MainActivity : AppCompatActivity() {
    lateinit var userList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        loadView()
        val rvMain = findViewById<RecyclerView>(R.id.rv_main)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMain.adapter = ImoAdapter(userList)


    }
    private fun loadView() {

        userList = ArrayList()

        userList.add(
            User(
                "https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
                "Senda gapim bor",
                "Polat",
                "yesterday",
                true
            )
        )
        userList.add(
            User(
                "https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
                "Meni so'rabsiz",
                "Don Vito",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
                "Buyuring brat",
                "Tommy shelby",
                "today",
                true
            )
        )
        userList.add(
            User(
                "https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
                "Pul kerakmi",
                "Elon Musk",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
                "Kuchimi ko'rdingma",
                "Arnold Schwarzenegger",
                "5 years ago",
                true
            )
        )
        userList.add(
            User(
                "https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
                "Senda gapim bor",
                "Polat",
                "yesterday",
                true
            )
        )
        userList.add(
            User(
                "https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
                "Meni so'rabsiz",
                "Don Vito",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
                "Buyuring brat",
                "Tommy shelby",
                "today",
                true
            )
        )
        userList.add(
            User(
                "https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
                "Pul kerakmi",
                "Elon Musk",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
                "Kuchimi ko'rdingma",
                "Arnold Schwarzenegger",
                "5 years ago",
                true
            )
        )
        userList.add(
            User(
                "https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
                "Senda gapim bor",
                "Polat",
                "yesterday",
                true
            )
        )
        userList.add(
            User(
                "https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
                "Meni so'rabsiz",
                "Don Vito",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
                "Buyuring brat",
                "Tommy shelby",
                "today",
                true
            )
        )
        userList.add(
            User(
                "https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
                "Pul kerakmi",
                "Elon Musk",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
                "Kuchimi ko'rdingma",
                "Arnold Schwarzenegger",
                "5 years ago",
                true
            )
        )
        userList.add(
            User(
                "https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
                "Senda gapim bor",
                "Polat",
                "yesterday",
                true
            )
        )
        userList.add(
            User(
                "https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
                "Meni so'rabsiz",
                "Don Vito",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
                "Buyuring brat",
                "Tommy shelby",
                "today",
                true
            )
        )
        userList.add(
            User(
                "https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
                "Pul kerakmi",
                "Elon Musk",
                "today",
                false
            )
        )
        userList.add(
            User(
                "https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
                "Kuchimi ko'rdingma",
                "Arnold Schwarzenegger",
                "5 years ago",
                true
            )
        )
    }
}