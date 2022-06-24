package br.com.zup.movieflix.login.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.movieflix.PREFERENCE_KEY
import br.com.zup.movieflix.USER_NAME_LOGIN_KEY
import br.com.zup.movieflix.USER_PASSWORD_LOGIN_KEY
import br.com.zup.movieflix.login.model.LoginModel
import br.com.zup.movieflix.login.repository.LoginRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = LoginRepository()
    private var _response: MutableLiveData<LoginModel> = MutableLiveData()
    val response: LiveData<LoginModel> = _response



    fun authentication (login : LoginModel){
        try {
            _response.value = repository.authenticate(login)
        }catch (ex: Exception){
            Log.i("Error", "------> ${ex.message}")
        }

    }
}