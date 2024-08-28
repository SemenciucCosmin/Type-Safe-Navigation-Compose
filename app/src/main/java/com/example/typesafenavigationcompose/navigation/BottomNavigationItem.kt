package com.example.typesafenavigationcompose.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.typesafenavigationcompose.R

data class BottomNavigationItem(
    @StringRes val stringRes: Int,
    @DrawableRes val drawableRes: Int,
    val destination: NavDestination,
)

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        stringRes = R.string.lbl_A,
        drawableRes = R.drawable.ic_letter_a,
        destination = NavDestination.A
    ),
    BottomNavigationItem(
        stringRes = R.string.lbl_B,
        drawableRes = R.drawable.ic_letter_b,
        destination = NavDestination.B
    ),
    BottomNavigationItem(
        stringRes = R.string.lbl_C,
        drawableRes = R.drawable.ic_letter_c,
        destination = NavDestination.C
    ),
    BottomNavigationItem(
        stringRes = R.string.lbl_D,
        drawableRes = R.drawable.ic_letter_e,
        destination = NavDestination.D
    )
)
