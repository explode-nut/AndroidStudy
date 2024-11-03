package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleTheme {
                Surface {
                    TextExe()
                }
            }
        }
    }
}

// exe1
@Composable
fun ArticleExe(modifier: Modifier) {
    val img = painterResource(R.drawable.bg_compose_background)
    Column(modifier) {
        Image(
            painter = img,
            contentDescription = null,

        )
        Text(
            text = stringResource(R.string.app_title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.app_paragraph_1),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.app_paragraph_2),
            modifier = Modifier.padding(16.dp)
        )
    }
}

// exe2
@Composable
fun CompleteExe(modifier: Modifier = Modifier) {
    val img = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = img,
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.app_complete_text_1),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.app_complete_text_2),
            fontSize = 16.sp
        )
    }
}

// exe3
@Composable
fun TextExe(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                .weight(1f)
                .background(Color(0xFFEADDFF))
                .padding(16.dp)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.app_part_1_title),
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.app_part_1_text),
                    textAlign = TextAlign.Justify,
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.app_part_2_title),
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.app_part_2_text),
                    textAlign = TextAlign.Justify
                )
            }
        }

        Row(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.app_part_3_title),
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.app_part_3_text),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.app_part_4_title),
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = stringResource(R.string.app_part_4_text),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArticleTheme {
        TextExe()
    }
}