package com.zainpradana.bcads4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var dataList = ArrayList<FilmModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "Kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami memperbaikinya",
                "Action",
                R.drawable.ic_ad_astra,
                0,
                0.0F
            )
        )
        dataList.add(
            FilmModel(
                "2",
                "A Rainy Day in New York",
                "Kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami memperbaikinya",
                "Action",
                R.drawable.ic_avengers,
                0,
                0.0F
            )
        )
        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "Kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami memperbaikinya",
                "Action",
                R.drawable.ic_poster_sonic,
                0,
                0.0F
            )
        )
        dataList.add(
            FilmModel(
                "2",
                "A Rainy Day in New York",
                "Kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami memperbaikinya",
                "Action",
                R.drawable.ic_avengers,
                0,
                0.0F
            )
        )
        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "Kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami memperbaikinya",
                "Action",
                R.drawable.ic_poster_sonic,
                0,
                0.0F
            )
        )

        rv_movie.adapter = MovieAdapter(dataList){

        }

    }
}