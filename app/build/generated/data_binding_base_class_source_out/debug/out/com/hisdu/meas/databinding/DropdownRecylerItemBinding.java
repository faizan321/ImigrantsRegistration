// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hisdu.meas.R;
import com.hisdu.meas.util.SearchAbleSpiner.SearchableSpinner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DropdownRecylerItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout divisonLayout;

  @NonNull
  public final SearchableSpinner dropdown;

  @NonNull
  public final TextView headingDropdown;

  @NonNull
  public final RecyclerView indicatorRecycler;

  @NonNull
  public final ConstraintLayout mainLayout;

  @NonNull
  public final RadioGroup radiogroup;

  @NonNull
  public final TextInputEditText remark;

  @NonNull
  public final TextInputLayout remarkLayout;

  private DropdownRecylerItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout divisonLayout, @NonNull SearchableSpinner dropdown,
      @NonNull TextView headingDropdown, @NonNull RecyclerView indicatorRecycler,
      @NonNull ConstraintLayout mainLayout, @NonNull RadioGroup radiogroup,
      @NonNull TextInputEditText remark, @NonNull TextInputLayout remarkLayout) {
    this.rootView = rootView;
    this.divisonLayout = divisonLayout;
    this.dropdown = dropdown;
    this.headingDropdown = headingDropdown;
    this.indicatorRecycler = indicatorRecycler;
    this.mainLayout = mainLayout;
    this.radiogroup = radiogroup;
    this.remark = remark;
    this.remarkLayout = remarkLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DropdownRecylerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DropdownRecylerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dropdown_recyler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DropdownRecylerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divison_layout;
      RelativeLayout divisonLayout = ViewBindings.findChildViewById(rootView, id);
      if (divisonLayout == null) {
        break missingId;
      }

      id = R.id.dropdown;
      SearchableSpinner dropdown = ViewBindings.findChildViewById(rootView, id);
      if (dropdown == null) {
        break missingId;
      }

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

      ConstraintLayout mainLayout = (ConstraintLayout) rootView;

      id = R.id.radiogroup;
      RadioGroup radiogroup = ViewBindings.findChildViewById(rootView, id);
      if (radiogroup == null) {
        break missingId;
      }

      id = R.id.remark;
      TextInputEditText remark = ViewBindings.findChildViewById(rootView, id);
      if (remark == null) {
        break missingId;
      }

      id = R.id.remark_layout;
      TextInputLayout remarkLayout = ViewBindings.findChildViewById(rootView, id);
      if (remarkLayout == null) {
        break missingId;
      }

      return new DropdownRecylerItemBinding((ConstraintLayout) rootView, divisonLayout, dropdown,
          headingDropdown, indicatorRecycler, mainLayout, radiogroup, remark, remarkLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
