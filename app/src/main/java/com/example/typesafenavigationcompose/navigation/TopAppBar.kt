package com.example.typesafenavigationcompose.navigation

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.typesafenavigationcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    val navController = LocalNavController.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    navBackStackEntry?.destination?.let { navDestination ->
        val topNavigationItem = topNavigationItems.firstOrNull {
            navDestination.hasRoute(it.destination::class)
        } ?: return@let

        CenterAlignedTopAppBar(
            title = { Text(stringResource(topNavigationItem.stringRes)) },
            navigationIcon = {
                if (topNavigationItem.isNavigateUpAllowed) {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_back),
                            contentDescription = null
                        )
                    }
                }
            }
        )
    }
}
