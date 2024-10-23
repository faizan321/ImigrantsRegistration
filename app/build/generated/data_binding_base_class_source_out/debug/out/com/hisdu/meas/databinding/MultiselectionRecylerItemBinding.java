// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hisdu.meas.R;
import com.hisdu.meas.util.MultiSelectionSpinner.MultiSpinnerSearch;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MultiselectionRecylerItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView headingDropdown;

  @NonNull
  public final RecyclerView indicatorRecycler;

  @NonNull
  public final MultiSpinnerSearch multipleItemSelectionSpinner;

  private MultiselectionRecylerItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView headingDropdown, @NonNull RecyclerView indicatorRecycler,
      @NonNull MultiSpinnerSearch multipleItemSelectionSpinner) {
    this.rootView = rootView;
    this.headingDropdown = headingDropdown;
    this.indicatorRecycler = indicatorRecycler;
    this.multipleItemSelectionSpinner = multipleItemSelectionSpinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MultiselectionRecylerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MultiselectionRecylerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.multiselection_recyler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MultiselectionRecylerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.heading_dropdown;
      TextView headingDropdown = ViewBindings.findChildViewById(rootView, id);
      if (headingDropdown == null) {
        break missingId;
      }

      id = R.id.indicator_recycler;
      RecyclerView indicatorRecycler = ViewBindings.findChildViewById(rootView, id);
      if (indicatorRecycler == null) {
        break missingId;
      }

      id = R.id.multipleItemSelectionSpinner;
      MultiSpinnerSearch multipleItemSelectionSpinner = ViewBindings.findChildViewById(rootView, id);
      if (multipleItemSelectionSpinner == null) {
        break missingId;
      }

      return new MultiselectionRecylerItemBinding((LinearLayout) rootView, headingDropdown,
          indicatorRecycler, multipleItemSelectionSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
