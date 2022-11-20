package com.sample.searchmovieapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u001eJ\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040 J\u0010\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J&\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001cH\u0002J\u0016\u0010)\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0012J\u0016\u0010+\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0018J\u0016\u0010,\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001aJ\u0016\u0010-\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001cJ\u0016\u0010.\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001eJ\u001c\u0010/\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040 J\u0016\u00100\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u001e\u00101\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0007J\u000e\u00102\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u00064"}, d2 = {"Lcom/sample/searchmovieapp/util/Prefs;", "", "()V", "DEFAULT_SUFFIX", "", "LENGTH", "all", "", "getAll", "()Ljava/util/Map;", "mPrefs", "Landroid/content/SharedPreferences;", "preferences", "getPreferences", "()Landroid/content/SharedPreferences;", "clear", "Landroid/content/SharedPreferences$Editor;", "contains", "", "key", "edit", "getBoolean", "defValue", "getDouble", "", "getFloat", "", "getInt", "", "getLong", "", "getOrderedStringSet", "", "getString", "getStringSet", "initPrefs", "", "context", "Landroid/content/Context;", "prefsName", "mode", "putBoolean", "value", "putDouble", "putFloat", "putInt", "putLong", "putOrderedStringSet", "putString", "putStringSet", "remove", "Builder", "app_debug"})
public final class Prefs {
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.searchmovieapp.util.Prefs INSTANCE = null;
    private static final java.lang.String DEFAULT_SUFFIX = "_preferences";
    private static final java.lang.String LENGTH = "#LENGTH";
    private static android.content.SharedPreferences mPrefs;
    
    private Prefs() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> getAll() {
        return null;
    }
    
    /**
     * Initialize the Prefs helper class to keep a reference to the SharedPreference for this
     * application the SharedPreference will use the package name of the application as the Key.
     * This method is deprecated please us the new builder.
     *
     * @param context the Application context.
     */
    @java.lang.Deprecated()
    public final void initPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initPrefs(android.content.Context context, java.lang.String prefsName, int mode) {
    }
    
    /**
     * Retrieves a stored int value.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not
     * an int.
     * @see android.content.SharedPreferences.getInt
     */
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    /**
     * Retrieves a stored int value, or 0 if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or 0.
     * @throws ClassCastException if there is a preference with this name that is not
     * an int.
     * @see android.content.SharedPreferences.getInt
     */
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    /**
     * Retrieves a stored boolean value.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not a boolean.
     * @see android.content.SharedPreferences.getBoolean
     */
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    /**
     * Retrieves a stored boolean value, or false if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or false.
     * @throws ClassCastException if there is a preference with this name that is not a boolean.
     * @see android.content.SharedPreferences.getBoolean
     */
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    /**
     * Retrieves a stored long value.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not a long.
     * @see android.content.SharedPreferences.getLong
     */
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defValue) {
        return 0L;
    }
    
    /**
     * Retrieves a stored long value, or 0 if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or 0.
     * @throws ClassCastException if there is a preference with this name that is not a long.
     * @see android.content.SharedPreferences.getLong
     */
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    /**
     * Returns the double that has been saved as a long raw bits value in the long preferences.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue the double Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not a long.
     * @see android.content.SharedPreferences.getLong
     */
    public final double getDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double defValue) {
        return 0.0;
    }
    
    /**
     * Returns the double that has been saved as a long raw bits value in the long preferences.
     * Returns 0 if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or 0.
     * @throws ClassCastException if there is a preference with this name that is not a long.
     * @see android.content.SharedPreferences.getLong
     */
    public final double getDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0;
    }
    
    /**
     * Retrieves a stored float value.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not a float.
     * @see android.content.SharedPreferences.getFloat
     */
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defValue) {
        return 0.0F;
    }
    
    /**
     * Retrieves a stored float value, or 0 if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or 0.
     * @throws ClassCastException if there is a preference with this name that is not a float.
     * @see android.content.SharedPreferences.getFloat
     */
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0F;
    }
    
    /**
     * Retrieves a stored String value.
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * @throws ClassCastException if there is a preference with this name that is not a String.
     * @see android.content.SharedPreferences.getString
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defValue) {
        return null;
    }
    
    /**
     * Retrieves a stored String value, or an empty string if the preference does not exist.
     *
     * @param key      The name of the preference to retrieve.
     * @return Returns the preference value if it exists, or "".
     * @throws ClassCastException if there is a preference with this name that is not a String.
     * @see android.content.SharedPreferences.getString
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Retrieves a Set of Strings as stored by [.putStringSet]. On Honeycomb and
     * later this will call the native implementation in SharedPreferences, on older SDKs this will
     * call [.getOrderedStringSet].
     * **Note that the native implementation of [SharedPreferences.getStringSet] does not reliably preserve the order of the Strings in the Set.**
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference values if they exist, or defValues otherwise.
     * @throws ClassCastException if there is a preference with this name that is not a Set.
     * @see android.content.SharedPreferences.getStringSet
     * @see .getOrderedStringSet
     */
    @org.jetbrains.annotations.Nullable()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    public final java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defValue) {
        return null;
    }
    
    /**
     * Retrieves a Set of Strings as stored by [.putOrderedStringSet],
     * preserving the original order. Note that this implementation is heavier than the native
     * [.getStringSet] method (which does not guarantee to preserve order).
     *
     * @param key      The name of the preference to retrieve.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValues otherwise.
     * @throws ClassCastException if there is a preference with this name that is not a Set of
     * Strings.
     * @see .getStringSet
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getOrderedStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defValue) {
        return null;
    }
    
    /**
     * Stores a long value.
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putLong
     */
    public final void putLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    /**
     * Stores an integer value.
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putInt
     */
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    /**
     * Stores a double value as a long raw bits value.
     *
     * @param key   The name of the preference to modify.
     * @param value The double value to be save in the preferences.
     * @see android.content.SharedPreferences.Editor.putLong
     */
    public final void putDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    /**
     * Stores a float value.
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putFloat
     */
    public final void putFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    /**
     * Stores a boolean value.
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putBoolean
     */
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    /**
     * Stores a String value.
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putString
     */
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * Stores a Set of Strings. On Honeycomb and later this will call the native implementation in
     * SharedPreferences.Editor, on older SDKs this will call [.putOrderedStringSet].
     * **Note that the native implementation of [Editor.putStringSet] does not reliably preserve the order of the Strings in the Set.**
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see android.content.SharedPreferences.Editor.putStringSet
     * @see .putOrderedStringSet
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    public final void putStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value) {
    }
    
    /**
     * Stores a Set of Strings, preserving the order.
     * Note that this method is heavier that the native implementation [.putStringSet] (which does not reliably preserve the order of the Set). To preserve the order of the
     * items in the Set, the Set implementation must be one that as an iterator with predictable
     * order, such as [LinkedHashSet].
     *
     * @param key   The name of the preference to modify.
     * @param value The new value for the preference.
     * @see .putStringSet
     * @see .getOrderedStringSet
     */
    public final void putOrderedStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value) {
    }
    
    /**
     * Removes a preference value.
     *
     * @param key The name of the preference to remove.
     * @see android.content.SharedPreferences.Editor.remove
     */
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    /**
     * Checks if a value is stored for the given key.
     *
     * @param key The name of the preference to check.
     * @return `true` if the storage contains this key value, `false` otherwise.
     * @see android.content.SharedPreferences.contains
     */
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    /**
     * Removed all the stored keys and values.
     *
     * @return the [Editor] for chaining. The changes have already been committed/applied
     * through the execution of this method.
     * @see android.content.SharedPreferences.Editor.clear
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor clear() {
        return null;
    }
    
    /**
     * Returns the Editor of the underlying SharedPreferences instance.
     *
     * @return An Editor
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor edit() {
        return null;
    }
    
    /**
     * Builder class for the EasyPrefs instance. You only have to call this once in the Application
     * onCreate. And in the rest of the code base you can call Prefs.method name.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/sample/searchmovieapp/util/Prefs$Builder;", "", "()V", "mContext", "Landroid/content/Context;", "mKey", "", "mMode", "", "mUseDefault", "", "build", "", "setContext", "context", "setMode", "mode", "setPrefsName", "prefsName", "setUseDefaultSharedPreference", "defaultSharedPreference", "app_debug"})
    public static final class Builder {
        private java.lang.String mKey;
        private android.content.Context mContext;
        private int mMode = -1;
        private boolean mUseDefault = false;
        
        public Builder() {
            super();
        }
        
        /**
         * Set the filename of the SharedPreference instance. Usually this is the application's
         * packagename.xml but it can be modified for migration purposes or customization.
         *
         * @param prefsName the filename used for the SharedPreference
         * @return the [com.pixplicity.easyprefs.library.Prefs.Builder] object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.sample.searchmovieapp.util.Prefs.Builder setPrefsName(@org.jetbrains.annotations.NotNull()
        java.lang.String prefsName) {
            return null;
        }
        
        /**
         * Set the Context used to instantiate the SharedPreferences
         *
         * @param context the application context
         * @return the [com.pixplicity.easyprefs.library.Prefs.Builder] object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.sample.searchmovieapp.util.Prefs.Builder setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Set the mode of the SharedPreference instance.
         *
         * @param mode Operating mode.  Use 0 or [Context.MODE_PRIVATE] for the
         * default operation, [Context.MODE_WORLD_READABLE]
         * @return the [com.pixplicity.easyprefs.library.Prefs.Builder] object.
         * @see Context.getSharedPreferences
         */
        @org.jetbrains.annotations.NotNull()
        @android.annotation.SuppressLint(value = {"WorldReadableFiles", "WorldWriteableFiles"})
        public final com.sample.searchmovieapp.util.Prefs.Builder setMode(int mode) {
            return null;
        }
        
        /**
         * Set the default SharedPreference file name. Often the package name of the application is
         * used, but if the [android.preference.PreferenceActivity] or [ ] is used the system will append that with
         * _preference.
         *
         * @param defaultSharedPreference true if default SharedPreference name should used.
         * @return the [com.pixplicity.easyprefs.library.Prefs.Builder] object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.sample.searchmovieapp.util.Prefs.Builder setUseDefaultSharedPreference(boolean defaultSharedPreference) {
            return null;
        }
        
        /**
         * Initialize the SharedPreference instance to used in the application.
         *
         * @throws RuntimeException if Context has not been set.
         */
        public final void build() {
        }
    }
}