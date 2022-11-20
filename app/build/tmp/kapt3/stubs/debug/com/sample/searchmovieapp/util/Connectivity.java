package com.sample.searchmovieapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\tH\u0014J\b\u0010\u0010\u001a\u00020\tH\u0014J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sample/searchmovieapp/util/Connectivity;", "Landroidx/lifecycle/LiveData;", "", "()V", "application", "Landroid/app/Application;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "init", "", "isConnected", "context", "Landroid/content/Context;", "isInternetOn", "isNetworkAvailable", "onActive", "onInactive", "registerBroadCastReceiver", "unRegisterBroadCastReceiver", "app_debug"})
public final class Connectivity extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.searchmovieapp.util.Connectivity INSTANCE = null;
    private static android.content.BroadcastReceiver broadcastReceiver;
    private static android.app.Application application;
    
    private Connectivity() {
        super(null);
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    public final boolean isInternetOn() {
        return false;
    }
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    private final void registerBroadCastReceiver() {
    }
    
    public final boolean isConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final void unRegisterBroadCastReceiver() {
    }
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}