package com.hisdu.meas.ui.roles

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.R
import com.hisdu.meas.data.model.Recipe
import com.hisdu.meas.databinding.RolesFragmentBinding
import com.hisdu.meas.ui.Dashboard.DashboardViewModel
import com.hisdu.meas.ui.main.MainActivity
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import javax.inject.Inject
import javax.inject.Provider
import kotlin.math.roundToInt

class RolesFragment : Fragment(),RoleClickListener {


    private var mRecipe: Recipe? = null
    private lateinit var binding: RolesFragmentBinding
    private lateinit var viewModel: DashboardViewModel

        @Inject
    lateinit var viewModelProvider: Provider<DashboardViewModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).mainComponent.inject(this)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T = viewModelProvider.get() as T
        }).get(DashboardViewModel::class.java)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = RolesFragmentBinding.inflate(layoutInflater)


        val fieldHeight = resources?.getDimension(R.dimen.item_height_small)?.roundToInt()
        binding.rolesRecycler.setLayoutManager(object : GridLayoutManager(context, 2) {
            override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {
                // force height of viewHolder here, this will override layout_height from xml
                if (fieldHeight != null) {
                    lp.width = width / 2
                    lp.height = fieldHeight
                }

                return true
            }
        })

//        var userid= Prefs.getInt(AppConstant.USERID,0)
//        if(userid!=0){
//            viewModel.getUser(userid)
//        }



        return binding.root
    }



    companion object {

        private val TAG = RolesFragment::class.java.name
    }

}
