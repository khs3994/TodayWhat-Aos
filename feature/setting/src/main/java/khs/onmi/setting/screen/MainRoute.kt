package khs.onmi.setting.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MainRoute(
    navController: NavController,
) {
    MainScreen(
        onBackPressed = { navController.popBackStack() }
    )
}