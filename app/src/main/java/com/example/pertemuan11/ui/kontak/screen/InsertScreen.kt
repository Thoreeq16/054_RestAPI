package com.example.pertemuan11.ui.kontak.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertemuan11.navigation.DestinasiNavigasi
import com.example.pertemuan11.ui.PenyediaViewModel
import com.example.pertemuan11.ui.kontak.viewmodel.InsertViewModel

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = "Entry Siswa"
}

@Composable
fun EntryKontakScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: InsertViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {}