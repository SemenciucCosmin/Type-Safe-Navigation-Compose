package com.example.typesafenavigationcompose.presentation.routeA

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.typesafenavigationcompose.R
import com.example.typesafenavigationcompose.navigation.LocalNavController
import com.example.typesafenavigationcompose.navigation.NavDestination

@Composable
fun RouteA() {
    val navController = LocalNavController.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.lbl_route_A))

        Button(
            onClick = {
                navController.navigate(
                    NavDestination.E(
                        parameter1 = "First parameter",
                        parameter2 = "Second parameter",
                    )
                )
            }
        ) {
            Text(text = stringResource(R.string.lbl_navigate_button))
        }
    }
}