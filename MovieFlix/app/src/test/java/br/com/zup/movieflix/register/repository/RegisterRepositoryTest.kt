package br.com.zup.movieflix.register.repository

import br.com.zup.movieflix.register.model.RegisterModel
import org.junit.Test
import org.junit.Assert.*

class RegisterRepositoryTest {

    @Test
    fun registerUser_returnUser() {
        val user = RegisterModel(
            userName = "Felipe",
            email = "felipe.dearaujo@zup.com.br",
            password = "melhorProfessorDoMundo"
        )
        val result = RegisterRepository().registerUser(user)

        assertEquals(result.userName, "Felipe")
        assertEquals(result.email, "felipe.dearaujo@zup.com.br")
        assertEquals(result.password, "melhorProfessorDoMundo")
    }
}