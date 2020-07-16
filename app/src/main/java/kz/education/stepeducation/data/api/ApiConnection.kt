package kz.education.stepeducation.data.api

import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class ApiConnection {

    lateinit var retrofit: Retrofit

    constructor(){
        initializeRetrofit()
    }

    fun initializeRetrofit(){
        retrofit = Retrofit.Builder()
            .baseUrl(ApiConstants.baseUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(initializeOkHttpClient())
            .build()
    }

    fun initializeOkHttpClient() : OkHttpClient{
        val client = OkHttpClient
            .Builder()
            .addInterceptor(initializeHttpLogging())
            .build()

        return client
    }

    fun initializeHttpLogging() : HttpLoggingInterceptor{
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun initializeAPI(): API{
        return retrofit.create(API::class.java)
    }
}