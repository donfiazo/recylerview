package com.eddie.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.eddie.recyclerview.adapter.CountryAdapter
import com.eddie.recyclerview.databinding.ActivityMainBinding
import com.eddie.recyclerview.databinding.ActivityRecyclerViewBinding
import com.eddie.recyclerview.models.Country


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding
    private lateinit var myCountryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(


            Country(
                R.drawable.ic_brazil,
                "Brazil",
            "South America",
            40L
            ),
            Country(
                R.drawable.ic_chinese,
            "China",
            "Asia",
            1000L
            ),
            Country(
                R.drawable.ic_usa,
            "USA",
            "America",
            100L
            ),
            Country(
                R.drawable.ic_nigeria,
            "Nigeria",
            "Africa",
            200L
            ),
            Country(
                R.drawable.ic_uk,
            "United Kingdom",
                "Europe",
            50L
            )
        )
        myCountryAdapter = CountryAdapter(countries)
        binding.countryRecyclerView.adapter = myCountryAdapter
    }
}