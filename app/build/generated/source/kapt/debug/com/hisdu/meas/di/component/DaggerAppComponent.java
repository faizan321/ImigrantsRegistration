package com.hisdu.meas.di.component;

import android.app.Application;
import com.hisdu.meas.MainApplication;
import com.hisdu.meas.data.repository.CategoryRepository;
import com.hisdu.meas.data.repository.CategoryRepository_Factory;
import com.hisdu.meas.data.repository.IndicatorRepository;
import com.hisdu.meas.data.repository.IndicatorRepository_Factory;
import com.hisdu.meas.data.repository.RecipeRepository;
import com.hisdu.meas.data.repository.RecipeRepository_Factory;
import com.hisdu.meas.data.repository.UserRepository;
import com.hisdu.meas.data.repository.UserRepository_Factory;
import com.hisdu.meas.data.source.local.AppDatabase;
import com.hisdu.meas.data.source.remote.APIService;
import com.hisdu.meas.di.module.DatabaseModule_ProvideAppDatabaseFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideClientFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideLoggingInterceptorFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideMoshiConverterFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideMoshiFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideOkhttpCacheFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideRetrofitFactory;
import com.hisdu.meas.di.module.NetworkModule_ProvideServiceFactory;
import com.hisdu.meas.ui.Attendance.AttendanceFragment;
import com.hisdu.meas.ui.Attendance.AttendanceFragment_MembersInjector;
import com.hisdu.meas.ui.Dashboard.DashboardFragment;
import com.hisdu.meas.ui.Dashboard.DashboardFragment_MembersInjector;
import com.hisdu.meas.ui.Dashboard.DashboardViewModel;
import com.hisdu.meas.ui.Dashboard.DashboardViewModel_Factory;
import com.hisdu.meas.ui.Feedback.FeedbackFragment;
import com.hisdu.meas.ui.Feedback.FeedbackFragment_MembersInjector;
import com.hisdu.meas.ui.Indicators.IndicatorsFragment;
import com.hisdu.meas.ui.Indicators.IndicatorsFragment_MembersInjector;
import com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment;
import com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment_MembersInjector;
import com.hisdu.meas.ui.category.CategoryFragment;
import com.hisdu.meas.ui.category.CategoryFragment_MembersInjector;
import com.hisdu.meas.ui.category.CategoryViewModel;
import com.hisdu.meas.ui.category.CategoryViewModel_Factory;
import com.hisdu.meas.ui.detail.DetailFragment;
import com.hisdu.meas.ui.detail.DetailFragment_MembersInjector;
import com.hisdu.meas.ui.favorite.FavoriteFragment;
import com.hisdu.meas.ui.favorite.FavoriteFragment_MembersInjector;
import com.hisdu.meas.ui.main.MainActivity;
import com.hisdu.meas.ui.main.MainActivity_MembersInjector;
import com.hisdu.meas.ui.recipes.RecipeViewModel;
import com.hisdu.meas.ui.recipes.RecipeViewModel_Factory;
import com.hisdu.meas.ui.recipes.RecipesFragment;
import com.hisdu.meas.ui.recipes.RecipesFragment_MembersInjector;
import com.hisdu.meas.ui.roles.ModuleFragment;
import com.hisdu.meas.ui.roles.ModuleFragment_MembersInjector;
import com.hisdu.meas.ui.roles.RolesFragment;
import com.hisdu.meas.ui.roles.RolesFragment_MembersInjector;
import com.hisdu.meas.ui.roles.SectionFragment;
import com.hisdu.meas.ui.roles.SectionFragment_MembersInjector;
import com.hisdu.meas.ui.search.SearchFragment;
import com.hisdu.meas.ui.search.SearchFragment_MembersInjector;
import com.hisdu.meas.ui.survey.BHUSurveyFragment;
import com.hisdu.meas.ui.survey.BHUSurveyFragment_MembersInjector;
import com.hisdu.meas.ui.survey.SurveyFragment;
import com.hisdu.meas.ui.survey.SurveyFragment_MembersInjector;
import com.squareup.moshi.Moshi;
import com.zest.android.ui.login.IndicatorViewModel;
import com.zest.android.ui.login.IndicatorViewModel_Factory;
import com.zest.android.ui.login.LoginActivity;
import com.zest.android.ui.login.LoginActivity_MembersInjector;
import com.zest.android.ui.login.LoginViewModel;
import com.zest.android.ui.login.LoginViewModel_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<Moshi> provideMoshiProvider;

  private Provider<MoshiConverterFactory> provideMoshiConverterProvider;

  private Provider<Application> appProvider;

  private Provider<Cache> provideOkhttpCacheProvider;

  private Provider<OkHttpClient> provideClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<APIService> provideServiceProvider;

  private Provider<AppDatabase> provideAppDatabaseProvider;

  private DaggerAppComponent(Application appParam) {

    initialize(appParam);

  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Application appParam) {
    this.provideMoshiProvider = DoubleCheck.provider(NetworkModule_ProvideMoshiFactory.create());
    this.provideMoshiConverterProvider = NetworkModule_ProvideMoshiConverterFactory.create(provideMoshiProvider);
    this.appProvider = InstanceFactory.create(appParam);
    this.provideOkhttpCacheProvider = NetworkModule_ProvideOkhttpCacheFactory.create(appProvider);
    this.provideClientProvider = DoubleCheck.provider(NetworkModule_ProvideClientFactory.create(NetworkModule_ProvideLoggingInterceptorFactory.create(), provideOkhttpCacheProvider));
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(provideMoshiConverterProvider, provideClientProvider));
    this.provideServiceProvider = NetworkModule_ProvideServiceFactory.create(provideRetrofitProvider);
    this.provideAppDatabaseProvider = DoubleCheck.provider(DatabaseModule_ProvideAppDatabaseFactory.create(appProvider));
  }

  @Override
  public void inject(MainApplication app) {
  }

  @Override
  public MainComponent.Factory mainComponent() {
    return new MainComponentFactory(appComponent);
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Application app) {
      Preconditions.checkNotNull(app);
      return new DaggerAppComponent(app);
    }
  }

  private static final class MainComponentFactory implements MainComponent.Factory {
    private final DaggerAppComponent appComponent;

    private MainComponentFactory(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public MainComponent create() {
      return new MainComponentImpl(appComponent);
    }
  }

  private static final class MainComponentImpl implements MainComponent {
    private final DaggerAppComponent appComponent;

    private final MainComponentImpl mainComponentImpl = this;

    private Provider<UserRepository> userRepositoryProvider;

    private Provider<DashboardViewModel> dashboardViewModelProvider;

    private Provider<RecipeRepository> recipeRepositoryProvider;

    private Provider<RecipeViewModel> recipeViewModelProvider;

    private Provider<CategoryRepository> categoryRepositoryProvider;

    private Provider<CategoryViewModel> categoryViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<IndicatorRepository> indicatorRepositoryProvider;

    private Provider<IndicatorViewModel> indicatorViewModelProvider;

    private MainComponentImpl(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.userRepositoryProvider = UserRepository_Factory.create(appComponent.provideServiceProvider, appComponent.provideAppDatabaseProvider);
      this.dashboardViewModelProvider = DashboardViewModel_Factory.create(userRepositoryProvider);
      this.recipeRepositoryProvider = RecipeRepository_Factory.create(appComponent.provideServiceProvider, appComponent.provideAppDatabaseProvider);
      this.recipeViewModelProvider = RecipeViewModel_Factory.create(recipeRepositoryProvider);
      this.categoryRepositoryProvider = CategoryRepository_Factory.create(appComponent.provideServiceProvider, appComponent.provideAppDatabaseProvider);
      this.categoryViewModelProvider = CategoryViewModel_Factory.create(categoryRepositoryProvider);
      this.loginViewModelProvider = LoginViewModel_Factory.create(userRepositoryProvider);
      this.indicatorRepositoryProvider = IndicatorRepository_Factory.create(appComponent.provideServiceProvider, appComponent.provideAppDatabaseProvider);
      this.indicatorViewModelProvider = IndicatorViewModel_Factory.create(indicatorRepositoryProvider);
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    @Override
    public void inject(RecipesFragment recipesFragment) {
      injectRecipesFragment(recipesFragment);
    }

    @Override
    public void inject(FavoriteFragment favoriteFragment) {
      injectFavoriteFragment(favoriteFragment);
    }

    @Override
    public void inject(CategoryFragment categoryFragment) {
      injectCategoryFragment(categoryFragment);
    }

    @Override
    public void inject(SearchFragment searchFragment) {
      injectSearchFragment(searchFragment);
    }

    @Override
    public void inject(DetailFragment detailFragment) {
      injectDetailFragment(detailFragment);
    }

    @Override
    public void inject(LoginActivity loginActivity) {
      injectLoginActivity(loginActivity);
    }

    @Override
    public void inject(DashboardFragment dashboardFragment) {
      injectDashboardFragment(dashboardFragment);
    }

    @Override
    public void inject(RolesFragment rolesFragment) {
      injectRolesFragment(rolesFragment);
    }

    @Override
    public void inject(MasterIndicatorsFragment masterIndicators) {
      injectMasterIndicatorsFragment(masterIndicators);
    }

    @Override
    public void inject(AttendanceFragment attendanceFragment) {
      injectAttendanceFragment(attendanceFragment);
    }

    @Override
    public void inject(SurveyFragment surveyFragment) {
      injectSurveyFragment(surveyFragment);
    }

    @Override
    public void inject(IndicatorsFragment indicatorsFragment) {
      injectIndicatorsFragment(indicatorsFragment);
    }

    @Override
    public void inject(FeedbackFragment imagesFragment) {
      injectFeedbackFragment(imagesFragment);
    }

    @Override
    public void inject(SectionFragment sectionFragment) {
      injectSectionFragment(sectionFragment);
    }

    @Override
    public void inject(ModuleFragment moduleFragment) {
      injectModuleFragment(moduleFragment);
    }

    @Override
    public void inject(BHUSurveyFragment bhuSurveyFragment) {
      injectBHUSurveyFragment(bhuSurveyFragment);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private RecipesFragment injectRecipesFragment(RecipesFragment instance) {
      RecipesFragment_MembersInjector.injectViewModelProvider(instance, recipeViewModelProvider);
      return instance;
    }

    private FavoriteFragment injectFavoriteFragment(FavoriteFragment instance) {
      FavoriteFragment_MembersInjector.injectViewModelProvider(instance, recipeViewModelProvider);
      return instance;
    }

    private CategoryFragment injectCategoryFragment(CategoryFragment instance) {
      CategoryFragment_MembersInjector.injectViewModelProvider(instance, categoryViewModelProvider);
      return instance;
    }

    private SearchFragment injectSearchFragment(SearchFragment instance) {
      SearchFragment_MembersInjector.injectViewModelProvider(instance, recipeViewModelProvider);
      return instance;
    }

    private DetailFragment injectDetailFragment(DetailFragment instance) {
      DetailFragment_MembersInjector.injectViewModelProvider(instance, recipeViewModelProvider);
      return instance;
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectViewModelProvider(instance, loginViewModelProvider);
      return instance;
    }

    private DashboardFragment injectDashboardFragment(DashboardFragment instance) {
      DashboardFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private RolesFragment injectRolesFragment(RolesFragment instance) {
      RolesFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private MasterIndicatorsFragment injectMasterIndicatorsFragment(
        MasterIndicatorsFragment instance) {
      MasterIndicatorsFragment_MembersInjector.injectViewModelProvider(instance, indicatorViewModelProvider);
      return instance;
    }

    private AttendanceFragment injectAttendanceFragment(AttendanceFragment instance) {
      AttendanceFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private SurveyFragment injectSurveyFragment(SurveyFragment instance) {
      SurveyFragment_MembersInjector.injectViewModelProvider(instance, indicatorViewModelProvider);
      return instance;
    }

    private IndicatorsFragment injectIndicatorsFragment(IndicatorsFragment instance) {
      IndicatorsFragment_MembersInjector.injectViewModelProvider(instance, indicatorViewModelProvider);
      return instance;
    }

    private FeedbackFragment injectFeedbackFragment(FeedbackFragment instance) {
      FeedbackFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private SectionFragment injectSectionFragment(SectionFragment instance) {
      SectionFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private ModuleFragment injectModuleFragment(ModuleFragment instance) {
      ModuleFragment_MembersInjector.injectViewModelProvider(instance, dashboardViewModelProvider);
      return instance;
    }

    private BHUSurveyFragment injectBHUSurveyFragment(BHUSurveyFragment instance) {
      BHUSurveyFragment_MembersInjector.injectViewModelProvider(instance, indicatorViewModelProvider);
      return instance;
    }
  }
}
