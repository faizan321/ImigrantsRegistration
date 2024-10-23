package com.hisdu.meas.ui.category;

import com.hisdu.meas.data.repository.CategoryRepository;
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
public final class CategoryViewModel_Factory implements Factory<CategoryViewModel> {
  private final Provider<CategoryRepository> categoryRepositoryProvider;

  public CategoryViewModel_Factory(Provider<CategoryRepository> categoryRepositoryProvider) {
    this.categoryRepositoryProvider = categoryRepositoryProvider;
  }

  @Override
  public CategoryViewModel get() {
    return newInstance(categoryRepositoryProvider.get());
  }

  public static CategoryViewModel_Factory create(
      Provider<CategoryRepository> categoryRepositoryProvider) {
    return new CategoryViewModel_Factory(categoryRepositoryProvider);
  }

  public static CategoryViewModel newInstance(CategoryRepository categoryRepository) {
    return new CategoryViewModel(categoryRepository);
  }
}
