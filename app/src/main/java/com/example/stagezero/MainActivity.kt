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
                    OpenLinkButton()
                }
            }
        }
    }
}

@Composable
fun GitHubLinkButton(onClickGitHub: () -> Unit, onClickFlutter: () -> Unit, onClickReact: () -> Unit, onClickKotlin: () -> Unit, onClickDev: () -> Unit,onClickAndroid:()->Unit,onClickIOS:()->Unit,onClickTelex:()->Unit,onClickDelve:()->Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedButton(onClick = { onClickGitHub() }) {
            Text("Open GitHub Link")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickFlutter() }) {
            Text("Flutter Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickReact() }) {
            Text("React-native Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickKotlin() }) {
            Text("Kotlin Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickDev() }) {
            Text("Mobile Developers Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickAndroid() }) {
            Text("Android Developers Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickIOS() }) {
            Text("iOS Developers Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickTelex() }) {
            Text("Telex Page")
        }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButton(onClick = { onClickDelve() }) {
            Text("Delve Page")
        }

    }
}

@Composable
fun OpenLinkButton() {
    val context = LocalContext.current
    GitHubLinkButton(
        onClickGitHub = { openLink(context, "https://github.com/FrankKamala/stage0.git") },
        onClickFlutter = { openLink(context, "https://flutter.dev") },
        onClickReact = { openLink(context, "https://reactnative.dev") },
        onClickKotlin = { openLink(context, "https://kotlinlang.org") },
        onClickDev = { openLink(context, "https://hng.tech/hire/android-developers")},
        onClickAndroid = { openLink(context, "https://hng.tech/hire/android-developers")},
        onClickIOS = { openLink(context, "https://hng.tech/hire/android-developers")},
        onClickTelex = { openLink(context, "https://hng.tech/hire/android-developers")},
        onClickDelve = { openLink(context, "https://delve.fun/")},

    )
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
