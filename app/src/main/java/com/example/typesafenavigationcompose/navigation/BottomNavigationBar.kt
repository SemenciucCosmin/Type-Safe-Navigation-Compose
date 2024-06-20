package com.example.typesafenavigationcompose.navigation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar() {
    val navController = LocalNavController.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    NavigationBar {
        bottomNavigationItems.forEach { navigationItem ->
            NavigationBarItem(
                selected = navBackStackEntry?.navDestination == navigationItem.destination,
                onClick = {
                    navController.navigate(navigationItem.destination) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(navigationItem.icon),
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = stringResource(navigationItem.label))
                }
            )
        }
    }
}
