package com.example.mvvm_practice.domain.data

import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FirebaseAuthSource : AuthSource {
    private val firebaseAuth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    // 상태를 Booelan으로 하나? 따로 상태를 지정할 방법은 없나?
    override suspend fun signIn(login: Login) {
        withContext(Dispatchers.IO){
            firebaseAuth.signInWithEmailAndPassword(login.email, login.password).addOnCompleteListener {
                if(it.isSuccessful){

                } else{

                }
            }
        }
    }

    override suspend fun signUp(login: Login) {
        withContext(Dispatchers.IO){
            firebaseAuth.createUserWithEmailAndPassword(login.email, login.password).addOnCompleteListener {
                if(it.isSuccessful){

                } else{

                }
            }
        }
    }
}