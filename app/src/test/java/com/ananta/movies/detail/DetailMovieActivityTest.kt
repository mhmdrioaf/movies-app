package com.ananta.movies.detail

import com.ananta.movies.movies.MainViewModel
import com.ananta.movies.movies.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailMovieActivityTest {

    private lateinit var viewModel: MainViewModel

    private val dummyMovies = DataDummy.generateDummyMovies()[0]
    private val dummyShows = DataDummy.generateDummyTvShows()[0]

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun onCreate() {

        val moviesEntity = viewModel.getMovies()[0]
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.title, moviesEntity.title)
        assertEquals(dummyMovies.description, moviesEntity.description)
        assertEquals(dummyMovies.director, moviesEntity.director)
        assertEquals(dummyMovies.genre, moviesEntity.genre)
        assertEquals(dummyMovies.budget, moviesEntity.budget)
        assertEquals(dummyMovies.imagePath, moviesEntity.imagePath)
        assertEquals(dummyMovies.year, moviesEntity.year)

        val showsEntity = viewModel.getShows()[0]
        assertNotNull(showsEntity)
        assertEquals(dummyShows.title, showsEntity.title)
        assertEquals(dummyShows.country, showsEntity.country)
        assertEquals(dummyShows.genre, showsEntity.genre)
        assertEquals(dummyShows.seasons, showsEntity.seasons)
        assertEquals(dummyShows.description, showsEntity.description)
        assertEquals(dummyShows.year, showsEntity.year)
        assertEquals(dummyShows.imagePath, showsEntity.imagePath)

    }
}