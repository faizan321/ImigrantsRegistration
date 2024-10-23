// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout mainAppBarLayout;

  @NonNull
  public final BottomNavigationView mainBottomNavigationView;

  @NonNull
  public final Toolbar mainToolbar;

  @NonNull
  public final FragmentContainerView navHostFragmentContainer;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout mainAppBarLayout,
      @NonNull BottomNavigationView mainBottomNavigationView, @NonNull Toolbar mainToolbar,
      @NonNull FragmentContainerView navHostFragmentContainer) {
    this.rootView = rootView;
    this.mainAppBarLayout = mainAppBarLayout;
    this.mainBottomNavigationView = mainBottomNavigationView;
    this.mainToolbar = mainToolbar;
    this.navHostFragmentContainer = navHostFragmentContainer;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_app_bar_layout;
      AppBarLayout mainAppBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (mainAppBarLayout == null) {
        break missingId;
      }

      id = R.id.main_bottom_navigation_view;
      BottomNavigationView mainBottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (mainBottomNavigationView == null) {
        break missingId;
      }

      id = R.id.main_toolbar;
      Toolbar mainToolbar = ViewBindings.findChildViewById(rootView, id);
      if (mainToolbar == null) {
        break missingId;
      }

      id = R.id.nav_host_fragment_container;
      FragmentContainerView navHostFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (navHostFragmentContainer == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, mainAppBarLayout,
          mainBottomNavigationView, mainToolbar, navHostFragmentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
