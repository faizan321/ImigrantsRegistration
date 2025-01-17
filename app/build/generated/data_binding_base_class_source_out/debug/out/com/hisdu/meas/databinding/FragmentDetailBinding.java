// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.adroitandroid.chipcloud.ChipCloud;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FloatingActionButton detailFab;

  @NonNull
  public final RelativeLayout detailImageContainer;

  @NonNull
  public final AppCompatTextView detailInstructionsTextView;

  @NonNull
  public final NestedScrollView detailNestedScrollView;

  @NonNull
  public final ChipCloud detailTagChipCloud;

  @NonNull
  public final LinearLayout detailTagsContainer;

  @NonNull
  public final AppCompatImageView detailToolbarImageView;

  @NonNull
  public final AppCompatImageView detailToolbarTransparentImageView;

  private FragmentDetailBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FloatingActionButton detailFab, @NonNull RelativeLayout detailImageContainer,
      @NonNull AppCompatTextView detailInstructionsTextView,
      @NonNull NestedScrollView detailNestedScrollView, @NonNull ChipCloud detailTagChipCloud,
      @NonNull LinearLayout detailTagsContainer, @NonNull AppCompatImageView detailToolbarImageView,
      @NonNull AppCompatImageView detailToolbarTransparentImageView) {
    this.rootView = rootView;
    this.detailFab = detailFab;
    this.detailImageContainer = detailImageContainer;
    this.detailInstructionsTextView = detailInstructionsTextView;
    this.detailNestedScrollView = detailNestedScrollView;
    this.detailTagChipCloud = detailTagChipCloud;
    this.detailTagsContainer = detailTagsContainer;
    this.detailToolbarImageView = detailToolbarImageView;
    this.detailToolbarTransparentImageView = detailToolbarTransparentImageView;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detail_fab;
      FloatingActionButton detailFab = ViewBindings.findChildViewById(rootView, id);
      if (detailFab == null) {
        break missingId;
      }

      id = R.id.detail_image_container;
      RelativeLayout detailImageContainer = ViewBindings.findChildViewById(rootView, id);
      if (detailImageContainer == null) {
        break missingId;
      }

      id = R.id.detail_instructions_text_view;
      AppCompatTextView detailInstructionsTextView = ViewBindings.findChildViewById(rootView, id);
      if (detailInstructionsTextView == null) {
        break missingId;
      }

      id = R.id.detail_nested_scroll_view;
      NestedScrollView detailNestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (detailNestedScrollView == null) {
        break missingId;
      }

      id = R.id.detail_tag_chip_cloud;
      ChipCloud detailTagChipCloud = ViewBindings.findChildViewById(rootView, id);
      if (detailTagChipCloud == null) {
        break missingId;
      }

      id = R.id.detail_tags_container;
      LinearLayout detailTagsContainer = ViewBindings.findChildViewById(rootView, id);
      if (detailTagsContainer == null) {
        break missingId;
      }

      id = R.id.detail_toolbar_image_view;
      AppCompatImageView detailToolbarImageView = ViewBindings.findChildViewById(rootView, id);
      if (detailToolbarImageView == null) {
        break missingId;
      }

      id = R.id.detail_toolbar_transparent_image_view;
      AppCompatImageView detailToolbarTransparentImageView = ViewBindings.findChildViewById(rootView, id);
      if (detailToolbarTransparentImageView == null) {
        break missingId;
      }

      return new FragmentDetailBinding((CoordinatorLayout) rootView, detailFab,
          detailImageContainer, detailInstructionsTextView, detailNestedScrollView,
          detailTagChipCloud, detailTagsContainer, detailToolbarImageView,
          detailToolbarTransparentImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
