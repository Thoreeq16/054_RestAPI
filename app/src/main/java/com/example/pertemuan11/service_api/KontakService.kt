package com.example.pertemuan11.service_api

import com.example.pertemuan11.model.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers

interface KontakService {
    @Headers(
        "Accept: application/json"
    )
    @GET("siswa.json")
    suspend fun getKontak(): List<Kontak>
}