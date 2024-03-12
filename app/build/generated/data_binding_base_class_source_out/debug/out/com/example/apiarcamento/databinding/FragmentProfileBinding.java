// Generated by view binder compiler. Do not edit!
package com.example.apiarcamento.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.apiarcamento.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView avatar;

  @NonNull
  public final LinearLayout cerrarSesion;

  @NonNull
  public final RelativeLayout contenedor1;

  @NonNull
  public final RelativeLayout contenedorInfo;

  @NonNull
  public final TextView fragmentTittle;

  @NonNull
  public final LinearLayout misDatos;

  @NonNull
  public final LinearLayout misVehiculos;

  @NonNull
  public final TextView tvLogout;

  @NonNull
  public final TextView tvMV;

  @NonNull
  public final TextView tvMisDatos;

  @NonNull
  public final TextView username;

  private FragmentProfileBinding(@NonNull FrameLayout rootView, @NonNull ImageView avatar,
      @NonNull LinearLayout cerrarSesion, @NonNull RelativeLayout contenedor1,
      @NonNull RelativeLayout contenedorInfo, @NonNull TextView fragmentTittle,
      @NonNull LinearLayout misDatos, @NonNull LinearLayout misVehiculos,
      @NonNull TextView tvLogout, @NonNull TextView tvMV, @NonNull TextView tvMisDatos,
      @NonNull TextView username) {
    this.rootView = rootView;
    this.avatar = avatar;
    this.cerrarSesion = cerrarSesion;
    this.contenedor1 = contenedor1;
    this.contenedorInfo = contenedorInfo;
    this.fragmentTittle = fragmentTittle;
    this.misDatos = misDatos;
    this.misVehiculos = misVehiculos;
    this.tvLogout = tvLogout;
    this.tvMV = tvMV;
    this.tvMisDatos = tvMisDatos;
    this.username = username;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
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
      id = R.id.avatar;
      ImageView avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.cerrarSesion;
      LinearLayout cerrarSesion = ViewBindings.findChildViewById(rootView, id);
      if (cerrarSesion == null) {
        break missingId;
      }

      id = R.id.contenedor1;
      RelativeLayout contenedor1 = ViewBindings.findChildViewById(rootView, id);
      if (contenedor1 == null) {
        break missingId;
      }

      id = R.id.contenedorInfo;
      RelativeLayout contenedorInfo = ViewBindings.findChildViewById(rootView, id);
      if (contenedorInfo == null) {
        break missingId;
      }

      id = R.id.fragmentTittle;
      TextView fragmentTittle = ViewBindings.findChildViewById(rootView, id);
      if (fragmentTittle == null) {
        break missingId;
      }

      id = R.id.misDatos;
      LinearLayout misDatos = ViewBindings.findChildViewById(rootView, id);
      if (misDatos == null) {
        break missingId;
      }

      id = R.id.misVehiculos;
      LinearLayout misVehiculos = ViewBindings.findChildViewById(rootView, id);
      if (misVehiculos == null) {
        break missingId;
      }

      id = R.id.tvLogout;
      TextView tvLogout = ViewBindings.findChildViewById(rootView, id);
      if (tvLogout == null) {
        break missingId;
      }

      id = R.id.tvMV;
      TextView tvMV = ViewBindings.findChildViewById(rootView, id);
      if (tvMV == null) {
        break missingId;
      }

      id = R.id.tvMisDatos;
      TextView tvMisDatos = ViewBindings.findChildViewById(rootView, id);
      if (tvMisDatos == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentProfileBinding((FrameLayout) rootView, avatar, cerrarSesion, contenedor1,
          contenedorInfo, fragmentTittle, misDatos, misVehiculos, tvLogout, tvMV, tvMisDatos,
          username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
