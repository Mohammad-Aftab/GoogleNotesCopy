package com.lordsam.googlenotescopy.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lordsam.googlenotescopy.R
import com.lordsam.googlenotescopy.ui.theme.GoogleNotesCopyTheme

@Composable
fun SplashScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(weight = 1.0f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier
                        .size(size = 200.dp),
                    painter = painterResource(id = R.drawable.baseline_note_add_24),
                    contentDescription = stringResource(R.string.app_icon),
                    tint = colorResource(id = R.color.yellow)
                )
                Spacer(modifier = Modifier.height(height = 40.dp))
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(weight = 1.0f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier,
                    text = "Google Workspace",
                    fontWeight = FontWeight.Bold,
                    fontSize = 36.sp
                )
                Spacer(modifier = Modifier.height(height = 160.dp))
            }
        }
    }
}

@Preview
@Composable
fun PreviewSplashScreen() {
    GoogleNotesCopyTheme {
        SplashScreen()
    }
}