package com.sample.searchmovieapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/sample/searchmovieapp/ui/home/MovieFragmentAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/sample/searchmovieapp/data/model/SearchMovies$Search;", "Lcom/sample/searchmovieapp/ui/home/MovieFragmentAdapter$ViewHolder;", "viewModel", "Lcom/sample/searchmovieapp/ui/home/HomeViewModel;", "context", "Lcom/sample/searchmovieapp/ui/home/HomeFragment;", "(Lcom/sample/searchmovieapp/ui/home/HomeViewModel;Lcom/sample/searchmovieapp/ui/home/HomeFragment;)V", "getContext", "()Lcom/sample/searchmovieapp/ui/home/HomeFragment;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "data", "", "ViewHolder", "app_debug"})
public final class MovieFragmentAdapter extends androidx.recyclerview.widget.ListAdapter<com.sample.searchmovieapp.data.model.SearchMovies.Search, com.sample.searchmovieapp.ui.home.MovieFragmentAdapter.ViewHolder> {
    private final com.sample.searchmovieapp.ui.home.HomeViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.searchmovieapp.ui.home.HomeFragment context = null;
    
    public MovieFragmentAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.ui.home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.ui.home.HomeFragment context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.searchmovieapp.ui.home.HomeFragment getContext() {
        return null;
    }
    
    public final void swapData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search> data) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.ui.home.MovieFragmentAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.searchmovieapp.ui.home.MovieFragmentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/searchmovieapp/ui/home/MovieFragmentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sample/searchmovieapp/databinding/ItemMovieBinding;", "(Lcom/sample/searchmovieapp/databinding/ItemMovieBinding;)V", "getBinding", "()Lcom/sample/searchmovieapp/databinding/ItemMovieBinding;", "bind", "", "viewModel", "Lcom/sample/searchmovieapp/ui/home/HomeViewModel;", "item", "Lcom/sample/searchmovieapp/data/model/SearchMovies$Search;", "context", "Lcom/sample/searchmovieapp/ui/home/HomeFragment;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.sample.searchmovieapp.databinding.ItemMovieBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.sample.searchmovieapp.ui.home.MovieFragmentAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.sample.searchmovieapp.databinding.ItemMovieBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.searchmovieapp.databinding.ItemMovieBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.sample.searchmovieapp.ui.home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull()
        com.sample.searchmovieapp.data.model.SearchMovies.Search item, @org.jetbrains.annotations.NotNull()
        com.sample.searchmovieapp.ui.home.HomeFragment context) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/searchmovieapp/ui/home/MovieFragmentAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/sample/searchmovieapp/ui/home/MovieFragmentAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.sample.searchmovieapp.ui.home.MovieFragmentAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}