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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HolderSearchBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView searchImageCardView;

  @NonNull
  public final ImageView searchImageView;

  @NonNull
  public final TextView searchTextView;

  private HolderSearchBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView searchImageCardView, @NonNull ImageView searchImageView,
      @NonNull TextView searchTextView) {
    this.rootView = rootView;
    this.searchImageCardView = searchImageCardView;
    this.searchImageView = searchImageView;
    this.searchTextView = searchTextView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HolderSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HolderSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.holder_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HolderSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.search_image_card_view;
      CardView searchImageCardView = ViewBindings.findChildViewById(rootView, id);
      if (searchImageCardView == null) {
        break missingId;
      }

      id = R.id.search_image_view;
      ImageView searchImageView = ViewBindings.findChildViewById(rootView, id);
      if (searchImageView == null) {
        break missingId;
      }

      id = R.id.search_text_view;
      TextView searchTextView = ViewBindings.findChildViewById(rootView, id);
      if (searchTextView == null) {
        break missingId;
      }

      return new HolderSearchBinding((RelativeLayout) rootView, searchImageCardView,
          searchImageView, searchTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}