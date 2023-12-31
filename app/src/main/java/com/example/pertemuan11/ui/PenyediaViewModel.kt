package com.example.pertemuan11.ui

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan11.KontakAplikation
import com.example.pertemuan11.ui.home.viewmodel.HomeViewModel
import com.example.pertemuan11.ui.kontak.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiKontak().container.KontakRepository) }
        initializer { InsertViewModel(aplikasiKontak().container.KontakRepository) }
    }
}

fun CreationExtras.aplikasiKontak(): KontakAplikation =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplikation)