package com.lordsam.googlenotescopy.ui.screen

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lordsam.googlenotescopy.ui.component.TopAppBarHome
import com.lordsam.googlenotescopy.ui.theme.GoogleNotesCopyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBarHome()
        },
        bottomBar = {

        },
        floatingActionButton = {
            //Docked FAB
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
        ) {

        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    GoogleNotesCopyTheme {
        HomeScreen(navController = rememberNavController())
    }
}