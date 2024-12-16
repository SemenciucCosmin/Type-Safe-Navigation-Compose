package com.example.typesafenavigationcompose.navigation

import androidx.annotation.StringRes
import com.example.typesafenavigationcompose.R

data class TopNavigationItem(
    @StringRes val stringRes: Int,
    val destination: NavDestination,
    val isNavigateUpAllowed: Boolean,
)

val topNavigationItems = listOf(
    TopNavigationItem(
        stringRes = R.string.lbl_A,
        destination = NavDestination.A,
        isNavigateUpAllowed = false
    ),
    TopNavigationItem(
        stringRes = R.string.lbl_B,
        destination = NavDestination.B,
        isNavigateUpAllowed = false
    ),
    TopNavigationItem(
        stringRes = R.string.lbl_C,
        destination = NavDestination.C,
        isNavigateUpAllowed = false
    ),
    TopNavigationItem(
        stringRes = R.string.lbl_D,
        destination = NavDestination.D,
        isNavigateUpAllowed = false
    ),
    TopNavigationItem(
        stringRes = R.string.lbl_E,
        destination = NavDestination.E(""),
        isNavigateUpAllowed = true
    )
)
