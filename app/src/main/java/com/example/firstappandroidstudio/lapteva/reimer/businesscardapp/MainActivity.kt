package com.example.firstappandroidstudio.lapteva.reimer.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
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
import com.example.firstappandroidstudio.lapteva.reimer.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme{
                Surface (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
                {
                    BasicInformation()
                    ContactInformation()
                }
            }
        }
    }
}

@Composable
fun BasicInformation(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.padding(top = 200.dp))
        Image(
            painter = painterResource(id = R.drawable.icon_avatar),
            contentDescription = stringResource(R.string.icon_avatar),
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF018786),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.title_text),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Blue,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Spacer(modifier = Modifier.padding(top = 300.dp))
    }
}

@Composable
fun ContactInformation(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(start = 100.dp),
        verticalArrangement = Arrangement.Bottom
    ){
        Row(modifier = Modifier.padding(bottom = 8.dp)){
            Image(
                painter = painterResource(id = R.drawable.icon_telephone),
                contentDescription = stringResource(R.string.phone_icon),
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier.padding(bottom = 8.dp)){
            Image(
                painter = painterResource(id = R.drawable.icon_telegram),
                contentDescription = stringResource(R.string.telegram_icon),
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = stringResource(R.string.name_telegram),
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.icon_mail),
                contentDescription = stringResource(R.string.email_icon),
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(){
    BusinessCardAppTheme {
        BasicInformation()
        ContactInformation()
    }
}