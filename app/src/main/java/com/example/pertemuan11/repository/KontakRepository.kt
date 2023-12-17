package com.example.pertemuan11.repository

import com.example.pertemuan11.model.Kontak
import com.example.pertemuan11.service_api.KontakService


interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}