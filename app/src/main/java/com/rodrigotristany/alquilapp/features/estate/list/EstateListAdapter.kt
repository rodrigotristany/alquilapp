package com.rodrigotristany.alquilapp.features.estate.list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodrigotristany.alquilapp.R
import com.rodrigotristany.alquilapp.domain.CatalogItem
import com.rodrigotristany.alquilapp.utils.inflate
import kotlinx.android.synthetic.main.item_estate_list.view.*
import kotlin.properties.Delegates

class EstateListAdapter(items: List<CatalogItem> = emptyList(), val listener: (CatalogItem) -> Unit)
    : RecyclerView.Adapter<EstateListAdapter.ViewHolder>() {

    private var items: List<CatalogItem> by Delegates.observable(items) { _, _, _ ->
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title = view.text_view_title
        private val country = view.text_view_city

        fun bind(item: CatalogItem) {
            title.text = item.title
            country.text = item.city
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = parent.inflate(R.layout.item_estate_list)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener { listener(items[position]) }
    }
}
