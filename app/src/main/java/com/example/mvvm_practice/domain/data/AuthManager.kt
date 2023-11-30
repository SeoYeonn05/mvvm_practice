package com.example.mvvm_practice.domain.data

import javax.inject.Inject

class AuthManager @Inject constructor(private val source: AuthSource) {

    suspend fun signIn(login: Login) = source.signIn(login)
    suspend fun signUp(login: Login) = source.signUp(login)
}