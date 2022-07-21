package br.com.zup.movieflix.register.repository

import br.com.zup.movieflix.register.model.RegisterModel

class RegisterRepository {

    private var registeredUser : RegisterModel = RegisterModel("", "", "")

    fun registerUser (user : RegisterModel) : RegisterModel {
        registeredUser = user
        return registeredUser
    }
}