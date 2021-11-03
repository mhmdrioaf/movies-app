package com.ananta.movies.movies

import androidx.lifecycle.ViewModel
import com.ananta.movies.movies.data.MovieEntity
import com.ananta.movies.movies.data.TvShowEntity
import com.ananta.movies.movies.utils.DataDummy

class MainViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()

    fun getShows(): List<TvShowEntity> = DataDummy.generateDummyTvShows()

}