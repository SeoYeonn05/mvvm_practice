package com.example.mvvm_practice.domain.repository

import com.example.mvvm_practice.domain.data.Login

interface AuthRepository {
    suspend fun signUp(login: Login)
    suspend fun signIn(login: Login)
}