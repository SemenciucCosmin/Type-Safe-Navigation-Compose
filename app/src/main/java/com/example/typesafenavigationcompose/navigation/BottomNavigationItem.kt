package com.example.typesafenavigationcompose.navigation

import com.example.typesafenavigationcompose.R

data class BottomNavigationItem(
    val label: Int,
    val icon: Int,
    val destination: NavDestination,
)

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        label = R.string.lbl_A,
        icon = R.drawable.ic_letter_a,
        destination = NavDestination.A
    ),
    BottomNavigationItem(
        label = R.string.lbl_B,
        icon = R.drawable.ic_letter_b,
        destination = NavDestination.B
    ),
    BottomNavigationItem(
        label = R.string.lbl_C,
        icon = R.drawable.ic_letter_c,
        destination = NavDestination.C
    ),
    BottomNavigationItem(
        label = R.string.lbl_D,
        icon = R.drawable.ic_letter_e,
        destination = NavDestination.D
    )
)
