package sola.martin.open_api_android_app.ui.auth

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import sola.martin.open_api_android_app.viewmodels.ViewModelProviderFactory
import java.lang.Exception
import javax.inject.Inject

abstract class BaseAuthFragment : DaggerFragment(){

    val TAG = "AppDebug"

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var viewModel: AuthViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = activity?.let {
            ViewModelProvider(this, providerFactory).get(AuthViewModel::class.java)
        }?: throw Exception("#Invalid Activity")
    }
}