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
        icon = R.drawable.ic_mock,
        destination = NavDestination.A
    ),
    BottomNavigationItem(
        label = R.string.lbl_B,
        icon = R.drawable.ic_mock,
        destination = NavDestination.B
    ),
    BottomNavigationItem(
        label = R.string.lbl_C,
        icon = R.drawable.ic_mock,
        destination = NavDestination.C
    ),
    BottomNavigationItem(
        label = R.string.lbl_D,
        icon = R.drawable.ic_mock,
        destination = NavDestination.D
    )
)
