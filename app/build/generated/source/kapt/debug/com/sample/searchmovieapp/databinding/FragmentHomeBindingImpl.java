package com.sample.searchmovieapp.databinding;
import com.sample.searchmovieapp.R;
import com.sample.searchmovieapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_search_movie, 3);
        sViewsWithIds.put(R.id.clearSearchTextBtn, 4);
        sViewsWithIds.put(R.id.goBtn, 5);
        sViewsWithIds.put(R.id.swipeRefresh, 6);
        sViewsWithIds.put(R.id.listProgress, 7);
        sViewsWithIds.put(R.id.progressContainer, 8);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.FrameLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.FrameLayout) bindings[8]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[6]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieList.setTag(null);
        this.noDataFound.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchMovieViewModel == variableId) {
            setSearchMovieViewModel((com.sample.searchmovieapp.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchMovieViewModel(@Nullable com.sample.searchmovieapp.ui.home.HomeViewModel SearchMovieViewModel) {
        this.mSearchMovieViewModel = SearchMovieViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.searchMovieViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchMovieViewModelMoviesItems((androidx.lifecycle.LiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>>) object, fieldId);
            case 1 :
                return onChangeSearchMovieViewModelNoDataFoundVisibility((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchMovieViewModelMoviesItems(androidx.lifecycle.LiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>> SearchMovieViewModelMoviesItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchMovieViewModelNoDataFoundVisibility(androidx.lifecycle.LiveData<java.lang.Integer> SearchMovieViewModelNoDataFoundVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sample.searchmovieapp.ui.home.HomeViewModel searchMovieViewModel = mSearchMovieViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search>> searchMovieViewModelMoviesItems = null;
        int androidxDatabindingViewDataBindingSafeUnboxSearchMovieViewModelNoDataFoundVisibilityGetValue = 0;
        java.lang.Integer searchMovieViewModelNoDataFoundVisibilityGetValue = null;
        java.util.List<com.sample.searchmovieapp.data.model.SearchMovies.Search> searchMovieViewModelMoviesItemsGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> searchMovieViewModelNoDataFoundVisibility = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (searchMovieViewModel != null) {
                        // read searchMovieViewModel.moviesItems
                        searchMovieViewModelMoviesItems = searchMovieViewModel.getMoviesItems();
                    }
                    updateLiveDataRegistration(0, searchMovieViewModelMoviesItems);


                    if (searchMovieViewModelMoviesItems != null) {
                        // read searchMovieViewModel.moviesItems.getValue()
                        searchMovieViewModelMoviesItemsGetValue = searchMovieViewModelMoviesItems.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (searchMovieViewModel != null) {
                        // read searchMovieViewModel.noDataFoundVisibility
                        searchMovieViewModelNoDataFoundVisibility = searchMovieViewModel.getNoDataFoundVisibility();
                    }
                    updateLiveDataRegistration(1, searchMovieViewModelNoDataFoundVisibility);


                    if (searchMovieViewModelNoDataFoundVisibility != null) {
                        // read searchMovieViewModel.noDataFoundVisibility.getValue()
                        searchMovieViewModelNoDataFoundVisibilityGetValue = searchMovieViewModelNoDataFoundVisibility.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(searchMovieViewModel.noDataFoundVisibility.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSearchMovieViewModelNoDataFoundVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(searchMovieViewModelNoDataFoundVisibilityGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.sample.searchmovieapp.ui.home.HomeBindingAdapterKt.setMovieList(this.movieList, searchMovieViewModelMoviesItemsGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.noDataFound.setVisibility(androidxDatabindingViewDataBindingSafeUnboxSearchMovieViewModelNoDataFoundVisibilityGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchMovieViewModel.moviesItems
        flag 1 (0x2L): searchMovieViewModel.noDataFoundVisibility
        flag 2 (0x3L): searchMovieViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}