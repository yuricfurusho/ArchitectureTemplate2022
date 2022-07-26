package com.yuricfurusho.architecturetemplate2022.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.ArchitectureTemplate2022Theme

// TODO yuri: rename: remove List from the name
class ContractorsListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArchitectureTemplate2022Theme {
                ContractorsScreen()
            }
        }
    }
}