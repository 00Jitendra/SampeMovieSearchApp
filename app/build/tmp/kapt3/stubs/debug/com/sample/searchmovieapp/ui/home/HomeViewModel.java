package com.sample.searchmovieapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/sample/searchmovieapp/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_moviesItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sample/searchmovieapp/data/model/SearchMovies$Search;", "_noDataFoundVisibility", "", "mUpdatedMovieList", "getMUpdatedMovieList", "()Ljava/util/List;", "moviesItems", "Landroidx/lifecycle/LiveData;", "getMoviesItems", "()Landroidx/lifecycle/LiveData;", "noDataFoundVisibility", "getNoDataFoundVisibility", "loadMovieList", "", "apiKey", "", "fragmentActivity", "Lcom/sample/searchmovieapp/ui/home/HomeFragment;", "movieName", "type", "pageNo", "limit", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>> _moviesItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>> moviesItems = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _noDataFoundVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> noDataFoundVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search> mUpdatedMovieList = null;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>> getMoviesItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNoDataFoundVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search> getMUpdatedMovieList() {
        return null;
    }
    
    /**
     * function to search movies list
     */
    public final void loadMovieList(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.ui.home.HomeFragment fragmentActivity, @org.jetbrains.annotations.NotNull()
    java.lang.String movieName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String limit) {
    }
}