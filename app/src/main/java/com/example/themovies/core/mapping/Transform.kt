package com.example.themovies.core.mapping

import com.example.themovies.core.database.entities.FavoriteMovieDB
import com.example.themovies.core.database.entities.MovieDB
import com.example.themovies.core.models.movie.Movie
import com.example.themovies.core.models.movie.MovieVO
import com.example.themovies.core.models.review.Review
import com.example.themovies.core.models.review.ReviewVO
import com.example.themovies.core.models.trailer.Trailer
import com.example.themovies.core.models.trailer.TrailerVO



fun MovieDB.toMovie(): Movie {
    return Movie(id, originalTitle, overview, posterPath, releaseDate, rating, voteCount, uniqueId)
}

fun MovieVO.toMovieDB(): MovieDB {
    return MovieDB(id, originalTitle, overview, posterPath, releaseDate, rating, voteCount)
}

fun TrailerVO.toTrailer(): Trailer {
    return Trailer(key, name, type)
}

fun ReviewVO.toReview(): Review {
    return Review(author, content, postingDate)
}

fun Movie.toFavoriteMovieDB(): FavoriteMovieDB {
    return FavoriteMovieDB(id, originalTitle, overview, posterPath, releaseDate, rating, voteCount, uniqueId)
}

fun FavoriteMovieDB.toMovie() : Movie {
    return Movie(id, originalTitle, overview, posterPath, releaseDate, rating, voteCount, uniqueId)
}
