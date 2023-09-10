package com.lordsam.googlenotescopy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lordsam.googlenotescopy.ui.screen.HomeScreen
import com.lordsam.googlenotescopy.ui.screen.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SPLASH_SCREEN.name) {
        composable(Routes.SPLASH_SCREEN.name) {
            SplashScreen(navController = navController)
        }
        composable(Routes.HOME_SCREEN.name) {
            HomeScreen(navController = navController)
        }
    }
}