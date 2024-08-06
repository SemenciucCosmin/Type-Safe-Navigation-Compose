package com.example.typesafenavigationcompose.navigation

import androidx.navigation.NavBackStackEntry
import androidx.navigation.toRoute

val NavBackStackEntry.navDestination: NavDestination?
    get() = when (this.destination.route?.substringBefore(String.SLASH)) {
        NavDestination.A.asRoute() -> this.toRoute<NavDestination.A>()
        NavDestination.B.asRoute() -> this.toRoute<NavDestination.B>()
        NavDestination.C.asRoute() -> this.toRoute<NavDestination.C>()
        NavDestination.D.asRoute() -> this.toRoute<NavDestination.D>()
        NavDestination.E.asRoute() -> this.toRoute<NavDestination.E>()
        else -> null
    }
