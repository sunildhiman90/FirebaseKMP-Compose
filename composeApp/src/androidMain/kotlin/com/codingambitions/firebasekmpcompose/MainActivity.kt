package com.codingambitions.firebasekmpcompose

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseOptions
import dev.gitlive.firebase.initialize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Firebase.initialize(
            applicationContext,
            options = FirebaseOptions(
                applicationId = "1:989450187258:android:a2bcb561ffc4e469693443",
                apiKey = "AIzaSyCAxelH0-YztIi4We56NKxoLsDuLYkz5ng",
                projectId = "fir-cmp-demo"
            )
        )

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}