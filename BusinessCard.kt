package tz.ac.suza.composebasicslab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Image(
            painter = painterResource(id = R.drawable.suzalogo),
            contentDescription = "Profile",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "FATMA ABRAHMAN SAID",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = "Mobile App Developer",
            color = Color.Gray,
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(),
        ) {

            Text("📧 Email")
            Text("📞 Phone")
            Text("💼 LinkedIn")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessPreview() {
    BusinessCard()
}

