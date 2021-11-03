package com.ananta.movies.movies

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun getMovies() {
        val moviesEntity = viewModel.getMovies()
        assertNotNull(moviesEntity)
        assertEquals(10, moviesEntity.size)
    }

    @Test
    fun getShows() {
        val showsEntity = viewModel.getShows()
        assertNotNull(showsEntity)
        assertEquals(10, showsEntity.size)
    }
}