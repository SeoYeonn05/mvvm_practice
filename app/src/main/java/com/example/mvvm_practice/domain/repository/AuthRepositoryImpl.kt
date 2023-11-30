package com.example.mvvm_practice.domain.repository

import com.example.mvvm_practice.domain.data.AuthManager
import com.example.mvvm_practice.domain.data.FirebaseAuthSource
import com.example.mvvm_practice.domain.data.Login
import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authManager: AuthManager
) : AuthRepository {
    override suspend fun signUp(login: Login) = authManager.signUp(login)

    override suspend fun signIn(login: Login) = authManager.signIn(login)
}