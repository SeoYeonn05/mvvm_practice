package com.example.mvvm_practice.domain.repository

interface UserRepository {
    suspend fun setUser()
    suspend fun getUser()
}