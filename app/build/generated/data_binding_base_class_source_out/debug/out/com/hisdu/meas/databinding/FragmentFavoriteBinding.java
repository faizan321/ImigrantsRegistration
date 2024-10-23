// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFavoriteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout favoriteEmptyContainer;

  @NonNull
  public final ImageView favoriteEmptyImageView;

  @NonNull
  public final TextView favoriteEmptyTextView;

  @NonNull
  public final RecyclerView favoriteRecyclerView;

  private FragmentFavoriteBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout favoriteEmptyContainer, @NonNull ImageView favoriteEmptyImageView,
      @NonNull TextView favoriteEmptyTextView, @NonNull RecyclerView favoriteRecyclerView) {
    this.rootView = rootView;
    this.favoriteEmptyContainer = favoriteEmptyContainer;
    this.favoriteEmptyImageView = favoriteEmptyImageView;
    this.favoriteEmptyTextView = favoriteEmptyTextView;
    this.favoriteRecyclerView = favoriteRecyclerView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.favorite_empty_container;
      RelativeLayout favoriteEmptyContainer = ViewBindings.findChildViewById(rootView, id);
      if (favoriteEmptyContainer == null) {
        break missingId;
      }

      id = R.id.favorite_empty_image_view;
      ImageView favoriteEmptyImageView = ViewBindings.findChildViewById(rootView, id);
      if (favoriteEmptyImageView == null) {
        break missingId;
      }

      id = R.id.favorite_empty_text_view;
      TextView favoriteEmptyTextView = ViewBindings.findChildViewById(rootView, id);
      if (favoriteEmptyTextView == null) {
        break missingId;
      }

      id = R.id.favorite_recycler_view;
      RecyclerView favoriteRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (favoriteRecyclerView == null) {
        break missingId;
      }

      return new FragmentFavoriteBinding((RelativeLayout) rootView, favoriteEmptyContainer,
          favoriteEmptyImageView, favoriteEmptyTextView, favoriteRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
