// Generated by view binder compiler. Do not edit!
package com.hisdu.meas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hisdu.meas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.grantland.widget.AutofitTextView;

public final class SectionRoleItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView checkImage;

  @NonNull
  public final LinearLayout policyTypeCard;

  @NonNull
  public final AutofitTextView title;

  private SectionRoleItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView checkImage,
      @NonNull LinearLayout policyTypeCard, @NonNull AutofitTextView title) {
    this.rootView = rootView;
    this.checkImage = checkImage;
    this.policyTypeCard = policyTypeCard;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SectionRoleItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SectionRoleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.section_role_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SectionRoleItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.check_image;
      ImageView checkImage = ViewBindings.findChildViewById(rootView, id);
      if (checkImage == null) {
        break missingId;
      }

      id = R.id.policy_type_card;
      LinearLayout policyTypeCard = ViewBindings.findChildViewById(rootView, id);
      if (policyTypeCard == null) {
        break missingId;
      }

      id = R.id.title;
      AutofitTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new SectionRoleItemBinding((LinearLayout) rootView, checkImage, policyTypeCard, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
