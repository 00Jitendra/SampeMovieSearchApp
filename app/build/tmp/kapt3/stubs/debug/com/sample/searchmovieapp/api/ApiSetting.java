package com.sample.searchmovieapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/sample/searchmovieapp/api/ApiSetting;", "", "()V", "API_KEY", "", "LIMIT", "MOVIES_NAME", "PAGE_NO", "SEARCH_MOVIES", "TYPE", "app_debug"})
public final class ApiSetting {
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.searchmovieapp.api.ApiSetting INSTANCE = null;
    
    /**
     * End point and params
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_MOVIES = "/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "apikey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIES_NAME = "s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_NO = "page_no";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIMIT = "limit";
    
    private ApiSetting() {
        super();
    }
}