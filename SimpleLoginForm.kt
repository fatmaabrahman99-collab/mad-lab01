package tz.ac.suza.statelab

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun LoginForm() {

    var email by rememberSaveable {
        mutableStateOf("")
    }

    var password by rememberSaveable {
        mutableStateOf("")
    }

    var showPassword by rememberSaveable {
        mutableStateOf(false)
    }

    var status by rememberSaveable {
        mutableStateOf("")
    }

    val isValid =
        email.contains("@") &&
                password.length >= 6

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(
            text = "Simple Login Form",
            style = MaterialTheme.typography.headlineSmall
        )

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {
                Text("Email")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("Password")
            },
            visualTransformation =
                if (showPassword)
                    VisualTransformation.None
                else
                    PasswordVisualTransformation(),

            modifier = Modifier.fillMaxWidth()
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = showPassword,
                onCheckedChange = {
                    showPassword = it
                }
            )

            Text("Show Password")
        }

        Button(
            onClick = {
                status = "Login Successful!"
            },
            enabled = isValid,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Login")
        }

        Text(
            text = status
        )
    }
}