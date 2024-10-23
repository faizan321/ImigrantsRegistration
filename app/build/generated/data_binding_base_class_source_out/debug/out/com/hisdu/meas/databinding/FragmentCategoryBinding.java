// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCategoryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ContentLoadingProgressBar categoryProgressBar;

  @NonNull
  public final RecyclerView categoryRecyclerView;

  private FragmentCategoryBinding(@NonNull RelativeLayout rootView,
      @NonNull ContentLoadingProgressBar categoryProgressBar,
      @NonNull RecyclerView categoryRecyclerView) {
    this.rootView = rootView;
    this.categoryProgressBar = categoryProgressBar;
    this.categoryRecyclerView = categoryRecyclerView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_progress_bar;
      ContentLoadingProgressBar categoryProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (categoryProgressBar == null) {
        break missingId;
      }

      id = R.id.category_recycler_view;
      RecyclerView categoryRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (categoryRecyclerView == null) {
        break missingId;
      }

      return new FragmentCategoryBinding((RelativeLayout) rootView, categoryProgressBar,
          categoryRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
