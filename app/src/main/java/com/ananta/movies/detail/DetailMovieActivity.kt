package com.ananta.movies.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ananta.movies.R
import com.ananta.movies.databinding.ActivityDetailMovieBinding
import com.bumptech.glide.Glide

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val director = intent.getStringExtra(EXTRA_DIRECTOR)
        val budget = intent.getStringExtra(EXTRA_BUDGET)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val year = intent.getStringExtra(EXTRA_YEAR)
        val imagePath = intent.getStringExtra(EXTRA_PICTURE)
        val url = intent.getStringExtra(EXTRA_URL)

        val country = intent.getStringExtra(EXTRA_COUNTRY)
        val seasons = intent.getStringExtra(EXTRA_SEASONS)

        binding.tvTitleValue.text = title
        binding.tvDescriptionValue.text = description
        binding.tvGenreValue.text = genre
        binding.tvYearValue.text = year

        binding.progressBar.visibility = View.GONE

        if (director != null) {
            binding.tvDirectorValue.text = director
        } else {
            binding.tvDirector.text = getString(R.string.country)
            binding.tvDirectorValue.text = country
        }

        if (budget != null) {
            binding.tvBudgetValue.text = budget
        } else {
            binding.tvBudget.text = getString(R.string.seasons)
            binding.tvBudgetValue.text = seasons
        }

        Glide.with(binding.root)
            .load(imagePath)
            .error(R.drawable.ic_error)
            .into(binding.ivMoviePoster)

        binding.btnShare.setOnClickListener {
            if (url != null) {
                share(url)
            }
        }

    }

    private fun share(url: String) {
        val intent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, url)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(intent, null)
        startActivity(shareIntent)
    }

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_DESCRIPTION = "description"
        const val EXTRA_DIRECTOR = "director"
        const val EXTRA_BUDGET = "budget"
        const val EXTRA_GENRE = "genre"
        const val EXTRA_YEAR = "year"
        const val EXTRA_PICTURE = "picture"
        const val EXTRA_COUNTRY = "country"
        const val EXTRA_SEASONS = "seasons"
        const val EXTRA_URL = "url"
    }
}