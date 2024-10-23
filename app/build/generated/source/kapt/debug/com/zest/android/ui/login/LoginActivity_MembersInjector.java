package com.zest.android.ui.login;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginViewModel> viewModelProvider;

  public LoginActivity_MembersInjector(Provider<LoginViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<LoginActivity> create(Provider<LoginViewModel> viewModelProvider) {
    return new LoginActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectViewModelProvider(instance, viewModelProvider);
  }

  @InjectedFieldSignature("com.zest.android.ui.login.LoginActivity.viewModelProvider")
  public static void injectViewModelProvider(LoginActivity instance,
      Provider<LoginViewModel> viewModelProvider) {
    instance.viewModelProvider = viewModelProvider;
  }
}
