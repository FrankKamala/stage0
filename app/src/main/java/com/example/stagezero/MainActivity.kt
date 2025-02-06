package com.example.stagezero

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stagezero.ui.theme.StageZeroTheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StageZeroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    OpenLinkButton( )
                }
            }
        }
    }
}

@Composable
fun GitHubLinkButton(onClick: () -> Unit) {
    Column( modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        ElevatedButton(onClick = { onClick() }) {
            Text("Open GitHub Link")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClick() }) {
            Text("Open GitHub Link")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClick() }) {
            Text("Open GitHub Link")
        }

    }

}

@Composable
fun OpenLinkButton() {
    val context = LocalContext.current
    GitHubLinkButton {
        openLink(context, "https://github.com/FrankKamala/stage0.git")
    }

}


fun openLink(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}

@Preview(showBackground = true)
@Composable
fun GitHubLinkButtonPreview() {
    StageZeroTheme {
        OpenLinkButton()
    }
}
