package com.yuricfurusho.architecturetemplate2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yuricfurusho.architecturetemplate2022.ui.ContractorsListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, ContractorsListActivity::class.java))
        finish()
    }
}