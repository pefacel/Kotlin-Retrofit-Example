package com.pefacel.dogapiapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    // async functions must be suspend
    @GET
    suspend fun getDogsByBreeds(@Url url: String): Response<DogsResponse>
}