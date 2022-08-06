package br.com.portfolio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path
import br.com.portfolio.app.repositories.data.model.Repo

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}