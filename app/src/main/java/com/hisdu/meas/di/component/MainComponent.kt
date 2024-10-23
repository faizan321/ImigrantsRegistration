package com.hisdu.meas.di.component

import com.hisdu.meas.di.ActivityScope
import com.hisdu.meas.ui.Attendance.AttendanceFragment
import com.hisdu.meas.ui.Dashboard.DashboardFragment
import com.hisdu.meas.ui.Indicators.IndicatorsFragment
import com.hisdu.meas.ui.Indicators.MasterIndicatorsFragment
import com.hisdu.meas.ui.category.CategoryFragment
import com.hisdu.meas.ui.detail.DetailFragment
import com.hisdu.meas.ui.favorite.FavoriteFragment
import com.hisdu.meas.ui.Feedback.FeedbackFragment
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.ui.recipes.RecipesFragment
import com.hisdu.meas.ui.roles.ModuleFragment
import com.hisdu.meas.ui.roles.RolesFragment
import com.hisdu.meas.ui.roles.SectionFragment
import com.hisdu.meas.ui.search.SearchFragment
import com.hisdu.meas.ui.survey.BHUSurveyFragment
import com.hisdu.meas.ui.survey.SurveyFragment
import com.zest.android.ui.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(recipesFragment: RecipesFragment)
    fun inject(favoriteFragment: FavoriteFragment)
    fun inject(categoryFragment: CategoryFragment)
    fun inject(searchFragment: SearchFragment)
    fun inject(detailFragment: DetailFragment)
    fun inject(loginActivity: LoginActivity)
    fun inject(dashboardFragment: DashboardFragment)
    fun inject(rolesFragment: RolesFragment)
    fun inject(masterIndicators: MasterIndicatorsFragment)
    fun inject(attendanceFragment: AttendanceFragment)
    fun inject(surveyFragment: SurveyFragment)
    fun inject(indicatorsFragment: IndicatorsFragment)
    fun inject(imagesFragment: FeedbackFragment)
    fun inject(sectionFragment: SectionFragment)
    fun inject(moduleFragment: ModuleFragment)
    fun inject(bhuSurveyFragment: BHUSurveyFragment)
}