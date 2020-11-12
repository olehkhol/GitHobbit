package ua.`in`.khol.oleh.githobbit.github

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GitRetrofit {
    private const val BASE_URL = "https://api.github.com/"

    val gitService: GitService = buildRetrofit().create(GitService::class.java)

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}