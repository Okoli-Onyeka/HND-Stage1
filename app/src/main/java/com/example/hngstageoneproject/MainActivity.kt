package com.example.hngstageoneproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hngstageoneproject.ui.theme.HNGStageOneProjectTheme
import com.example.hngstageoneproject.ui.theme.WebViewActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HNGStageOneProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val intent = Intent(this, WebViewActivity::class.java)

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Slack Profile",
                            fontSize = 35.sp,
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .width(300.dp)
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = "Name: ${getString(R.string.profile_name)}",
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .width(300.dp)
                                .padding(top = 12.dp, bottom = 12.dp)
                        )
                        Spacer(modifier = Modifier.padding(10.dp))
                        Image(
                            painter = painterResource(id = R.drawable.profile_img) ,
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(300.dp)
                                .border(BorderStroke(5.dp, Color.Red), RoundedCornerShape(6.dp))
                                .padding(0.dp)
                                .clip(RoundedCornerShape(12.dp))
                        )
                        Spacer(modifier = Modifier.padding(20.dp))

                        Button(
                            onClick = {startActivity(intent)},
                            shape = RoundedCornerShape(9.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                            modifier = Modifier.width(300.dp).height(48.dp)

                        ) {
                            Text(text = "Open GitHub")
                        }
                    }
                }
            }
        }
    }
}