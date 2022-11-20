package com.sample.searchmovieapp.util.extns;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a.\u0010\u0007\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001a\u0010\u000f\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r\u00a8\u0006\u0012"}, d2 = {"hideKeyboard", "", "Landroid/app/Activity;", "Landroid/content/Context;", "view", "Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "setupSnackbar", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "snackbarEvent", "Landroidx/lifecycle/LiveData;", "Lcom/sample/searchmovieapp/util/Event;", "", "timeLength", "showSnackbar", "snackbarText", "", "app_debug"})
public final class ViewExtKt {
    
    /**
     * Transforms static java function Snackbar.make() to an extension function on View.
     */
    public static final void showSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showSnackbar, @org.jetbrains.annotations.NotNull()
    java.lang.String snackbarText, int timeLength) {
    }
    
    /**
     * Triggers a snackbar message when the value contained by snackbarTaskMessageLiveEvent is modified.
     */
    public static final void setupSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setupSnackbar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.sample.searchmovieapp.util.Event<java.lang.Integer>> snackbarEvent, int timeLength) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}