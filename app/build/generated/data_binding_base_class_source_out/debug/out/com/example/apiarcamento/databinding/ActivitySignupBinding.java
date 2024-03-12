// Generated by view binder compiler. Do not edit!
package com.example.apiarcamento.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.example.apiarcamento.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText MSurnameField;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final RelativeLayout container;

  @NonNull
  public final LinearLayout contenedorApellidos;

  @NonNull
  public final EditText emailField;

  @NonNull
  public final Spinner genderSpinner;

  @NonNull
  public final EditText nameField;

  @NonNull
  public final TextView nomApp;

  @NonNull
  public final EditText passwordField;

  @NonNull
  public final ScrollView scroll;

  @NonNull
  public final TextView textCredits;

  @NonNull
  public final TextView textEmail;

  @NonNull
  public final TextView textGender;

  @NonNull
  public final TextView textLastname1;

  @NonNull
  public final TextView textLastname2;

  @NonNull
  public final TextView textName;

  @NonNull
  public final TextView textNoCuenta;

  @NonNull
  public final TextView textPassword;

  @NonNull
  public final EditText usernameField;

  private ActivitySignupBinding(@NonNull RelativeLayout rootView, @NonNull EditText MSurnameField,
      @NonNull LottieAnimationView animationView, @NonNull Button btnLogin,
      @NonNull RelativeLayout container, @NonNull LinearLayout contenedorApellidos,
      @NonNull EditText emailField, @NonNull Spinner genderSpinner, @NonNull EditText nameField,
      @NonNull TextView nomApp, @NonNull EditText passwordField, @NonNull ScrollView scroll,
      @NonNull TextView textCredits, @NonNull TextView textEmail, @NonNull TextView textGender,
      @NonNull TextView textLastname1, @NonNull TextView textLastname2, @NonNull TextView textName,
      @NonNull TextView textNoCuenta, @NonNull TextView textPassword,
      @NonNull EditText usernameField) {
    this.rootView = rootView;
    this.MSurnameField = MSurnameField;
    this.animationView = animationView;
    this.btnLogin = btnLogin;
    this.container = container;
    this.contenedorApellidos = contenedorApellidos;
    this.emailField = emailField;
    this.genderSpinner = genderSpinner;
    this.nameField = nameField;
    this.nomApp = nomApp;
    this.passwordField = passwordField;
    this.scroll = scroll;
    this.textCredits = textCredits;
    this.textEmail = textEmail;
    this.textGender = textGender;
    this.textLastname1 = textLastname1;
    this.textLastname2 = textLastname2;
    this.textName = textName;
    this.textNoCuenta = textNoCuenta;
    this.textPassword = textPassword;
    this.usernameField = usernameField;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.MSurnameField;
      EditText MSurnameField = ViewBindings.findChildViewById(rootView, id);
      if (MSurnameField == null) {
        break missingId;
      }

      id = R.id.animationView;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      RelativeLayout container = (RelativeLayout) rootView;

      id = R.id.contenedorApellidos;
      LinearLayout contenedorApellidos = ViewBindings.findChildViewById(rootView, id);
      if (contenedorApellidos == null) {
        break missingId;
      }

      id = R.id.emailField;
      EditText emailField = ViewBindings.findChildViewById(rootView, id);
      if (emailField == null) {
        break missingId;
      }

      id = R.id.genderSpinner;
      Spinner genderSpinner = ViewBindings.findChildViewById(rootView, id);
      if (genderSpinner == null) {
        break missingId;
      }

      id = R.id.nameField;
      EditText nameField = ViewBindings.findChildViewById(rootView, id);
      if (nameField == null) {
        break missingId;
      }

      id = R.id.nom_app;
      TextView nomApp = ViewBindings.findChildViewById(rootView, id);
      if (nomApp == null) {
        break missingId;
      }

      id = R.id.passwordField;
      EditText passwordField = ViewBindings.findChildViewById(rootView, id);
      if (passwordField == null) {
        break missingId;
      }

      id = R.id.scroll;
      ScrollView scroll = ViewBindings.findChildViewById(rootView, id);
      if (scroll == null) {
        break missingId;
      }

      id = R.id.textCredits;
      TextView textCredits = ViewBindings.findChildViewById(rootView, id);
      if (textCredits == null) {
        break missingId;
      }

      id = R.id.text_email;
      TextView textEmail = ViewBindings.findChildViewById(rootView, id);
      if (textEmail == null) {
        break missingId;
      }

      id = R.id.text_gender;
      TextView textGender = ViewBindings.findChildViewById(rootView, id);
      if (textGender == null) {
        break missingId;
      }

      id = R.id.text_lastname1;
      TextView textLastname1 = ViewBindings.findChildViewById(rootView, id);
      if (textLastname1 == null) {
        break missingId;
      }

      id = R.id.text_lastname2;
      TextView textLastname2 = ViewBindings.findChildViewById(rootView, id);
      if (textLastname2 == null) {
        break missingId;
      }

      id = R.id.text_name;
      TextView textName = ViewBindings.findChildViewById(rootView, id);
      if (textName == null) {
        break missingId;
      }

      id = R.id.textNoCuenta;
      TextView textNoCuenta = ViewBindings.findChildViewById(rootView, id);
      if (textNoCuenta == null) {
        break missingId;
      }

      id = R.id.text_password;
      TextView textPassword = ViewBindings.findChildViewById(rootView, id);
      if (textPassword == null) {
        break missingId;
      }

      id = R.id.usernameField;
      EditText usernameField = ViewBindings.findChildViewById(rootView, id);
      if (usernameField == null) {
        break missingId;
      }

      return new ActivitySignupBinding((RelativeLayout) rootView, MSurnameField, animationView,
          btnLogin, container, contenedorApellidos, emailField, genderSpinner, nameField, nomApp,
          passwordField, scroll, textCredits, textEmail, textGender, textLastname1, textLastname2,
          textName, textNoCuenta, textPassword, usernameField);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
