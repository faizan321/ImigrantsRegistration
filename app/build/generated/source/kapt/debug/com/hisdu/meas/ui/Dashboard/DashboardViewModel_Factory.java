package com.hisdu.meas.ui.Dashboard;

import com.hisdu.meas.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  private final Provider<UserRepository> recipeRepositoryProvider;

  public DashboardViewModel_Factory(Provider<UserRepository> recipeRepositoryProvider) {
    this.recipeRepositoryProvider = recipeRepositoryProvider;
  }

  @Override
  public DashboardViewModel get() {
    return newInstance(recipeRepositoryProvider.get());
  }

  public static DashboardViewModel_Factory create(
      Provider<UserRepository> recipeRepositoryProvider) {
    return new DashboardViewModel_Factory(recipeRepositoryProvider);
  }

  public static DashboardViewModel newInstance(UserRepository recipeRepository) {
    return new DashboardViewModel(recipeRepository);
  }
}
