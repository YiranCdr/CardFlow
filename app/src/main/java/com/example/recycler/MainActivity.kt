package com.example.recycler

import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycler_view: RecyclerView
    private lateinit var view_adapter: RecyclerView.Adapter<*>
    private lateinit var view_manager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var reports = ArrayList<Report>()
        var report1: Report = Report(
                r_img_url = "https://i.imgur.com/H981AN7.jpg",
                r_description = "Description: This is card1",
                r_id = "report_id",
                r_location = Pair(3.3, 3.333),
                r_tag_list = arrayOf("Dog", "Travle"),
                r_time_str = "time and date here",
                r_title = "Hello doggy!",
                r_tname = "travel",
                r_uid = "admin_id",
                r_username = "admin"
            )
        var report2: Report = Report(
                r_img_url = "https://www.mcdonalds.com/etc/designs/mcdonalds/en/_jcr_content/genericpage/genericpagecontent/sitelevelconfiguration/logoimage.img.png",
                r_description = "Description: This is card2",
                r_id = "report_id",
                r_location = Pair(3.3, 3.333),
                r_tag_list = arrayOf("Food", "Travle"),
                r_time_str = "time and date here",
                r_title = "Hello World!",
                r_tname = "travel",
                r_uid = "admin_id",
                r_username = "admin"
            )
        reports.add(report1)
        reports.add(report2)

        view_manager = LinearLayoutManager(this)
        view_adapter = RecyclerAdapter(reports)

        recycler_view = findViewById<RecyclerView>(R.id.recycler_view).apply {
            layoutManager = view_manager
            adapter = view_adapter
        }
    }
}
