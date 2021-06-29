package com.eddie.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eddie.recyclerview.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
    }
}