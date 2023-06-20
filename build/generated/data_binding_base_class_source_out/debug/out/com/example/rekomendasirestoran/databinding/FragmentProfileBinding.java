// Generated by view binder compiler. Do not edit!
package com.example.rekomendasirestoran.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rekomendasirestoran.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView TextView01;

  @NonNull
  public final TextView TextView02;

  @NonNull
  public final TextView TextView03;

  @NonNull
  public final TextView TextView04;

  @NonNull
  public final LinearLayout linearTop;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull TextView TextView01,
      @NonNull TextView TextView02, @NonNull TextView TextView03, @NonNull TextView TextView04,
      @NonNull LinearLayout linearTop, @NonNull TextView textView1, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.TextView01 = TextView01;
    this.TextView02 = TextView02;
    this.TextView03 = TextView03;
    this.TextView04 = TextView04;
    this.linearTop = linearTop;
    this.textView1 = textView1;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TextView01;
      TextView TextView01 = ViewBindings.findChildViewById(rootView, id);
      if (TextView01 == null) {
        break missingId;
      }

      id = R.id.TextView02;
      TextView TextView02 = ViewBindings.findChildViewById(rootView, id);
      if (TextView02 == null) {
        break missingId;
      }

      id = R.id.TextView03;
      TextView TextView03 = ViewBindings.findChildViewById(rootView, id);
      if (TextView03 == null) {
        break missingId;
      }

      id = R.id.TextView04;
      TextView TextView04 = ViewBindings.findChildViewById(rootView, id);
      if (TextView04 == null) {
        break missingId;
      }

      id = R.id.linearTop;
      LinearLayout linearTop = ViewBindings.findChildViewById(rootView, id);
      if (linearTop == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, TextView01, TextView02,
          TextView03, TextView04, linearTop, textView1, textView2, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}