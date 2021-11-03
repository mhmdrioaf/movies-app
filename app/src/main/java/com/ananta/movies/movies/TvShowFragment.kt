package com.ananta.movies.movies

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ananta.movies.adapter.TvShowsAdapter
import com.ananta.movies.databinding.FragmentTvShowBinding
import com.ananta.movies.detail.DetailMovieActivity
import com.ananta.movies.movies.data.TvShowEntity

class TvShowFragment : Fragment() {

    private lateinit var fragmentTvhShowBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentTvhShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvhShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MainViewModel::class.java]
            val shows = viewModel.getShows()
            fragmentTvhShowBinding.progressBar.visibility = View.GONE

            val showsAdapter = TvShowsAdapter()
            showsAdapter.setShows(shows)

            with(fragmentTvhShowBinding.rvShows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = showsAdapter
            }

            showsAdapter.setOnItemClickCallback(object : TvShowsAdapter.OnItemClickCallback {
                override fun onItemClicked(data: TvShowEntity) {
                    moveToDetail(data)
                }
            })

        }
    }

    private fun moveToDetail(data: TvShowEntity) {
        val intent = Intent(activity, DetailMovieActivity::class.java)

        intent.putExtra(DetailMovieActivity.EXTRA_TITLE, data.title)
        intent.putExtra(DetailMovieActivity.EXTRA_COUNTRY, data.country)
        intent.putExtra(DetailMovieActivity.EXTRA_GENRE, data.genre)
        intent.putExtra(DetailMovieActivity.EXTRA_SEASONS, data.seasons)
        intent.putExtra(DetailMovieActivity.EXTRA_DESCRIPTION, data.description)
        intent.putExtra(DetailMovieActivity.EXTRA_YEAR, data.year)
        intent.putExtra(DetailMovieActivity.EXTRA_PICTURE, data.imagePath)
        intent.putExtra(DetailMovieActivity.EXTRA_URL, data.url)

        startActivity(intent)
    }
}