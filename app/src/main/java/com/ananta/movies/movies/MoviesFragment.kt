package com.ananta.movies.movies

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ananta.movies.adapter.MoviesAdapter
import com.ananta.movies.databinding.FragmentMoviesBinding
import com.ananta.movies.detail.DetailMovieActivity
import com.ananta.movies.movies.data.MovieEntity

class MoviesFragment : Fragment() {

    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MainViewModel::class.java]

            val movies = viewModel.getMovies()

            val moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovies(movies)

            fragmentMoviesBinding.progressBar.visibility = View.GONE

            with(fragmentMoviesBinding.rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
            }

            moviesAdapter.setOnItemClickCallback(object : MoviesAdapter.OnItemClickCallback {
                override fun onItemClicked(data: MovieEntity) {
                    showMoviesDetail(data)
                }
            })
        }
    }

    private fun showMoviesDetail(data: MovieEntity) {
        val intent = Intent(activity, DetailMovieActivity::class.java)
        intent.putExtra(DetailMovieActivity.EXTRA_TITLE, data.title)
        intent.putExtra(DetailMovieActivity.EXTRA_DESCRIPTION, data.description)
        intent.putExtra(DetailMovieActivity.EXTRA_DIRECTOR, data.director)
        intent.putExtra(DetailMovieActivity.EXTRA_BUDGET, data.budget)
        intent.putExtra(DetailMovieActivity.EXTRA_GENRE, data.genre)
        intent.putExtra(DetailMovieActivity.EXTRA_YEAR, data.year)
        intent.putExtra(DetailMovieActivity.EXTRA_PICTURE, data.imagePath)
        intent.putExtra(DetailMovieActivity.EXTRA_URL, data.url)

        startActivity(intent)

    }
}