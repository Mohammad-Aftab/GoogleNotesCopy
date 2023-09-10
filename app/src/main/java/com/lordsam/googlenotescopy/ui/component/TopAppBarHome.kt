package com.lordsam.googlenotescopy.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lordsam.googlenotescopy.R
import com.lordsam.googlenotescopy.ui.theme.GoogleNotesCopyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarHome() {

    TopAppBar(
        modifier = Modifier
            .padding(all = 12.dp)
            .clip(shape = RoundedCornerShape(percent = 50))
            .shadow(elevation = 1.dp),
        colors = TopAppBarDefaults
            .mediumTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
        navigationIcon = {
            Icon(
                modifier = Modifier
                    .padding(all = 8.dp),
                painter = painterResource(id = R.drawable.baseline_menu_24),
                contentDescription = stringResource(R.string.menu)
            )         
        },
        title = {
            Text(
                modifier = Modifier
                    .padding(all = 8.dp),
                text = stringResource(R.string.search_your_notes)
            )
        },
        actions = {
            Row {
                Icon(
                    modifier = Modifier
                        .padding(all = 8.dp),
                    painter = painterResource(id = R.drawable.baseline_splitscreen_24),
                    contentDescription = stringResource(R.string.list_view)
                )
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .padding(all = 8.dp),
                    painter = painterResource(id = R.drawable.baseline_account_circle_24),
                    contentDescription = stringResource(R.string.profile_icon)
                )
            }
        }
    )
}

@Preview
@Composable
fun PreviewTopAppBarHome() {
    GoogleNotesCopyTheme {
        TopAppBarHome()
    }
}