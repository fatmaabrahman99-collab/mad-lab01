package tz.ac.suza.statelab

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.Slider
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NameBadgeGenerator() {

    var firstName by rememberSaveable {
        mutableStateOf("")
    }

    var lastName by rememberSaveable {
        mutableStateOf("")
    }

    var fontSize by rememberSaveable {
        mutableStateOf(24f)
    }

    var selectedColor by remember {
        mutableStateOf(Color.Black)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(
            text = "Name Badge Generator",
            style = MaterialTheme.typography.headlineSmall
        )

        OutlinedTextField(
            value = firstName,
            onValueChange = {
                firstName = it
            },
            label = {
                Text("First Name")
            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = lastName,
            onValueChange = {
                lastName = it
            },
            label = {
                Text("Last Name")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Font Size: ${fontSize.toInt()}sp"
        )

        Slider(
            value = fontSize,
            onValueChange = {
                fontSize = it
            },
            valueRange = 0f..72f
        )

        Text("Choose Color")

        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {

            ColorCircle(
                color = Color.Red,
                onClick = {
                    selectedColor = Color.Red
                }
            )

            ColorCircle(
                color = Color.Blue,
                onClick = {
                    selectedColor = Color.Blue
                }
            )

            ColorCircle(
                color = Color.Green,
                onClick = {
                    selectedColor = Color.Green
                }
            )

            ColorCircle(
                color = Color.Black,
                onClick = {
                    selectedColor = Color.Black
                }
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "LIVE PREVIEW"
                )

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                Text(
                    text = "$firstName $lastName",
                    fontSize = fontSize.sp,
                    color = selectedColor
                )
            }
        }
    }
}

@Composable
fun ColorCircle(
    color: Color,
    onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(color)
            .clickable {
                onClick()
            }
    )
}