package com.example.imo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.adapter.ImoAdapter
import com.example.imo.model.Users


class MainActivity : AppCompatActivity() {
    lateinit var usersList:ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        loadList()
        val rvMain=findViewById<RecyclerView>(R.id.rv_main)
        rvMain.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvMain.adapter=ImoAdapter(usersList)

    }

    private fun loadList() {

        usersList= ArrayList()

        usersList.add(Users("https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
            true,
            "Polat Alemdar",
            "Jo'ra senda gapim bor",
            "04:05"))
        usersList.add(Users("https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
            true,
            "Don Vito",
            "Meni so'rabsiz",
            "16:45"))
        usersList.add(Users("https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
            false,
            "Tommy shelby",
            "Buyuring brat",
            "22:00"))
        usersList.add(Users("https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
            false,
            "Elon Musk",
            "Pul kerakmi",
            "22:30"))
        usersList.add(Users("https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
            false,
            "Arnold Schwarzenegger",
            "Kuchimi ko'rdingma",
            "23:24"))
        usersList.add(Users("https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
            true,
            "Polat Alemdar",
            "Jo'ra senda gapim bor",
            "04:05"))
        usersList.add(Users("https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
            true,
            "Don Vito",
            "Meni so'rabsiz",
            "16:45"))
        usersList.add(Users("https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
            false,
            "Tommy shelby",
            "Buyuring brat",
            "22:00"))
        usersList.add(Users("https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
            false,
            "Elon Musk",
            "Pul kerakmi",
            "22:30"))
        usersList.add(Users("https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
            false,
            "Arnold Schwarzenegger",
            "Kuchimi ko'rdingma",
            "23:24"))
        usersList.add(Users("https://img.medyatava.com/rcman/Cw1280h720q95gc/storage/files/images/2022/08/27/polatkapak-bXn7_cover.jpg",
            true,
            "Polat Alemdar",
            "Jo'ra senda gapim bor",
            "04:05"))
        usersList.add(Users("https://i.pinimg.com/736x/a9/db/4c/a9db4c8e6d1c8a18ff69e89689a968cd.jpg",
            true,
            "Don Vito",
            "Meni so'rabsiz",
            "16:45"))
        usersList.add(Users("https://oboi-telefon.ru/wallpapers/56499/30657.jpg",
            false,
            "Tommy shelby",
            "Buyuring brat",
            "22:00"))
        usersList.add(Users("https://img.tsargrad.tv/1/2/75_20210108_gaf_u39_003.jpg",
            false,
            "Elon Musk",
            "Pul kerakmi",
            "22:30"))
        usersList.add(Users("https://rukminim1.flixcart.com/image/1408/1408/poster/q/t/4/medium-poster119-arnold-schwarzenegger-bodybuilding-poster-hd-original-imaernfrvgyfz2bb.jpeg?q=90",
            false,
            "Arnold Schwarzenegger",
            "Kuchimi ko'rdingma",
            "23:24"))
    }
}