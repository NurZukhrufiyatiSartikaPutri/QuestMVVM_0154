package com.example.activity6.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity6.model.DataJK.JenisK
import com.example.activity6.view.FormSiswa
import com.example.activity6.view.TampilSiswa
import com.example.activity6.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulir,
    Detail,
}

