package com.jpapa.login_ui_practice_jpapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jpapa.login_ui_practice_jpapa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.BTNLogin.setOnClickListener {
            Toast.makeText(this, binding.IDInput.toString(), Toast.LENGTH_SHORT).show()
            if (binding.IDInput.toString() == "jidong.son@gmail.com") {
                if (binding.PWInput.toString() == "9621158") {
                    Toast.makeText(this, "관리자로 로그인하였습니다.", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "PW가 틀렸습니다.", Toast.LENGTH_SHORT).show()
                }
            }



        }
    }
}