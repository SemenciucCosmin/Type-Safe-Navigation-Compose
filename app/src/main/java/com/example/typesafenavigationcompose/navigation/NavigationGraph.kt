package com.example.typesafenavigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.typesafenavigationcompose.presentation.routeA.RouteA
import com.example.typesafenavigationcompose.presentation.routeB.RouteB
import com.example.typesafenavigationcompose.presentation.routeC.RouteC
import com.example.typesafenavigationcompose.presentation.routeD.RouteD
import com.example.typesafenavigationcompose.presentation.routeE.RouteE

@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavDestination.A,
        modifier = modifier
    ) {
        composable<NavDestination.A> { RouteA() }
        composable<NavDestination.B> { RouteB() }
        composable<NavDestination.C> { RouteC() }
        composable<NavDestination.D> { RouteD() }
        composable<NavDestination.E> { RouteE() }
    }
}
