package com.example.typesafenavigationcompose.presentation.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.typesafenavigationcompose.navigation.BottomNavigationBar
import com.example.typesafenavigationcompose.navigation.LocalNavController
import com.example.typesafenavigationcompose.navigation.NavigationGraph
import com.example.typesafenavigationcompose.navigation.TopAppBar
import com.example.typesafenavigationcompose.navigation.bottomNavigationItems
import com.example.typesafenavigationcompose.navigation.navDestination
import com.example.typesafenavigationcompose.presentation.theme.MedicalClinicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.navDestination
            val bottomNavigationDestinations = bottomNavigationItems.map { it.destination }
            val shouldShowBottomBar = currentDestination in bottomNavigationDestinations

            MedicalClinicTheme {
                CompositionLocalProvider(LocalNavController provides navController) {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = { TopAppBar() },
                        bottomBar = {
                            AnimatedVisibility(
                                visible = shouldShowBottomBar,
                                enter = expandVertically(),
                                exit = shrinkVertically(),
                                content = { BottomNavigationBar() }
                            )
                        }
                    ) { paddingValues ->
                        NavigationGraph(
                            modifier = Modifier.padding(paddingValues),
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}
