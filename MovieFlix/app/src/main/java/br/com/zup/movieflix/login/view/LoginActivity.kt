package br.com.zup.movieflix.login.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.movieflix.databinding.ActivityLoginBinding
import br.com.zup.movieflix.home.view.HomeActivity
import br.com.zup.movieflix.register.view.RegisterActivity


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvRegistro.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.bvLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}