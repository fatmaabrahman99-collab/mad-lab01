package tz.ac.suza.statelab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterApp() {

    var count by rememberSaveable {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = count.toString(),
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Button(
                onClick = {
                    if (count > 0) {
                        count--
                    }
                }
            ) {
                Text("-")
            }

            Button(
                onClick = {
                    count++
                }
            ) {
                Text("+")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                count = 0
            }
        ) {
            Text("Reset")
        }
    }
}