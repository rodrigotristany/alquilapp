package com.rodrigotristany.alquilapp.ui.home

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodrigotristany.alquilapp.R
import com.rodrigotristany.alquilapp.utils.inflate
import kotlinx.android.synthetic.main.catalog_item.view.*
import kotlin.properties.Delegates

class CatalogListAdapter(items: List<CatalogModel> = emptyList(), val listener: (CatalogModel) -> Unit)
    : RecyclerView.Adapter<CatalogListAdapter.ViewHolder>() {

    private var items: List<CatalogModel> by Delegates.observable(items) { _, _, _ ->
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title = view.text_view_title
        private val country = view.text_view_city

        fun bind(item: CatalogModel) {
            title.text = item.title
            country.text = item.city
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = parent.inflate(R.layout.catalog_item)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener { listener(items[position]) }
    }
}