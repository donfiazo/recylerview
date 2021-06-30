package com.eddie.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eddie.recyclerview.databinding.CountryItemsBinding
import com.eddie.recyclerview.models.Country

class CountryAdapter (val countries: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder> (){

    class CountryViewHolder(var binding: CountryItemsBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(country: Country){
        binding.flag.setImageResource(country.flag)
        binding.Continent.text = country.continent
        binding.Name.text = country.name
        binding.Population.text = country.population.toString()
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = CountryItemsBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries [position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
       return countries.size
    }
}