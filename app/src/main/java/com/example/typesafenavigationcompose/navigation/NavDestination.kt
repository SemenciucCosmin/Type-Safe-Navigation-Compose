package com.example.typesafenavigationcompose.navigation

import androidx.annotation.StringRes
import com.example.typesafenavigationcompose.R
import kotlinx.serialization.Serializable

@Serializable
sealed class NavDestination(@StringRes val topBarTitleRes: Int) {

    @Serializable
    data object A : NavDestination(R.string.lbl_A)

    @Serializable
    data object B : NavDestination(R.string.lbl_B)

    @Serializable
    data object C : NavDestination(R.string.lbl_C)

    @Serializable
    data object D : NavDestination(R.string.lbl_D)

    @Serializable
    data object E : NavDestination(R.string.lbl_E)

    fun asRoute(): String? = this.javaClass.canonicalName
}