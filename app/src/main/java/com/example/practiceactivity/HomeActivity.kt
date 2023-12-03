package com.example.practiceactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.practiceactivity.databinding.ActivityHomeBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

      /*  binding.logoutbtn.setOnClickListener {
            Firebase.auth.signOut()
            startActivity(Intent(this@HomeActivity,MainActivity::class.java))
            finish()
        }*/
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.logout -> {Firebase.auth.signOut()
                startActivity(Intent(this@HomeActivity,MainActivity::class.java))
                finish()}


        }

        return super.onOptionsItemSelected(item)
    }
}