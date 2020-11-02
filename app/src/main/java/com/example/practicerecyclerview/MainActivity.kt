package com.example.practicerecyclerview


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private val movie = arrayOf("Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice ")
    private val movieYear = arrayOf("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016")

    private var rv_movie: RecyclerView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var movieList:ArrayList<Movie> = ArrayList<Movie>()

        for (i in 0 until movie.size) {
            val mov = Movie(movie[i], movieYear[i])
            movieList.add(mov)
        }

        rv_movie = findViewById(R.id.rv_movie);
        rv_movie?.setHasFixedSize(true)
        rv_movie?.layoutManager = LinearLayoutManager(this)
        val movieAdapter = MovieAdapter(movieList)
        rv_movie?.adapter = movieAdapter



    }
}