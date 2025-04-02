package com.example.glidetest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.glidetest.ui.theme.GlideTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlideTestTheme {
                val localContext = LocalContext.current

                Column {
                    Button(onClick = {
                        startActivity(Intent(localContext, ImageLoadActivity::class.java))
                    }) {
                        Text(text = "이미지 로드 이동하기")
                    }
                }

            }
        }
    }
}
