package com.ananta.movies.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.ananta.movies.R
import com.ananta.movies.movies.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyShows = DataDummy.generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovies.size
            )
        )
    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_title_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_value)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.tv_director_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_director_value)).check(matches(withText(dummyMovies[0].director)))
        onView(withId(R.id.tv_genre_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_value)).check(matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.tv_budget_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_budget_value)).check(matches(withText(dummyMovies[0].budget)))
        onView(withId(R.id.tv_description_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_value)).check(matches(withText(dummyMovies[0].description)))
        onView(withId(R.id.tv_year_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_year_value)).check(matches(withText(dummyMovies[0].year)))


    }

    @Test
    fun loadShows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_shows)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyShows.size
            )
        )
    }

    @Test
    fun loadDetailShows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_shows)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_title_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_value)).check(matches(withText(dummyShows[0].title)))
        onView(withId(R.id.tv_director_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_director_value)).check(matches(withText(dummyShows[0].country)))
        onView(withId(R.id.tv_genre_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_value)).check(matches(withText(dummyShows[0].genre)))
        onView(withId(R.id.tv_budget_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_budget_value)).check(matches(withText(dummyShows[0].seasons)))
        onView(withId(R.id.tv_description_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_value)).check(matches(withText(dummyShows[0].description)))
        onView(withId(R.id.tv_year_value)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_year_value)).check(matches(withText(dummyShows[0].year)))
    }

}