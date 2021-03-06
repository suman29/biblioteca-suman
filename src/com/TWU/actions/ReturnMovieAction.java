package com.twu.actions;

import com.twu.Library;
import com.twu.Messages;
import com.twu.menu.Option;
import com.twu.movies.Movie;
import com.twu.views.ReturnMovieView;
import com.twu.users.User;

// It allows the customer to return the movie to library.

public class ReturnMovieAction implements Option {
    private Library library;
    private ReturnMovieView returnMovieView;

    public ReturnMovieAction(Library library, ReturnMovieView returnMovieView) {
        this.library = library;
        this.returnMovieView = returnMovieView;
    }

    @Override
    public void perform(User customer) {
        returnMovieView.displayMessage(Messages.ENTER_MOVIE_NAME);
        String movieTitle = returnMovieView.takeUserInputForReturningMovie();
        Movie movie = library.movieSearcher(movieTitle);
        library.returnMovie(movie);
        returnMovieView.displayMessage(movie.getAppropriateMessageOnReturnMovieAction());
    }

    @Override
    public void perform() {

    }
}
