package com.sample.searchmovieapp.ui.home;

import java.lang.System;

/**
 * Callback for calculating the diff between two non-null items in a list.
 *
 * Used by ListAdapter to calculate the minimum number of changes between and old list and a new
 * list that's been passed to `submitList`.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/sample/searchmovieapp/ui/home/TaskDiffCallbackReport;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/sample/searchmovieapp/data/model/SearchMovies$Search;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
public final class TaskDiffCallbackReport extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.sample.searchmovieapp.data.model.SearchMovies.Search> {
    
    public TaskDiffCallbackReport() {
        super();
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.data.model.SearchMovies.Search oldItem, @org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.data.model.SearchMovies.Search newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.data.model.SearchMovies.Search oldItem, @org.jetbrains.annotations.NotNull()
    com.sample.searchmovieapp.data.model.SearchMovies.Search newItem) {
        return false;
    }
}