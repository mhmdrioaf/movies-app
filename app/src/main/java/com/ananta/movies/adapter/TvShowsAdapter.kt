package com.ananta.movies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ananta.movies.R
import com.ananta.movies.databinding.ItemMoviesBinding
import com.ananta.movies.movies.data.TvShowEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvShowsAdapter : RecyclerView.Adapter<TvShowsAdapter.ShowsViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    private var listShows = ArrayList<TvShowEntity>()

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun setShows(shows: List<TvShowEntity>?) {
        if (shows == null) return
        this.listShows.clear()
        this.listShows.addAll(shows)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShowsViewHolder {
        val itemMoviesBinding =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowsViewHolder(itemMoviesBinding)
    }

    override fun onBindViewHolder(holder: ShowsViewHolder, position: Int) {
        val shows = listShows[position]
        holder.bind(shows)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listShows[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount(): Int = listShows.size

    class ShowsViewHolder(private val binding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(shows: TvShowEntity) {
            with(binding) {
                tvTitle.text = shows.title
                tvGenre.text = shows.genre
                tvCompany.text = shows.country
                tvYear.text = shows.year
            }

            Glide.with(itemView.context)
                .load(shows.imagePath)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(binding.ivMovieImage)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: TvShowEntity)
    }

}