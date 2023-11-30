package com.example.mvvm_practice.domain.data

interface AuthSource {
    suspend fun signIn(login: Login)
    suspend fun signUp(login: Login)
}