package tz.ac.suza.composebasicslab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaterialComponentsMiniShowcase() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Components")
                },
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = "This is a Material 3 Card",
                    modifier = Modifier.padding(20.dp),
                )
            }

            Button(onClick = {}) {
                Text("Primary Button")
            }

            OutlinedButton(onClick = {}) {
                Text("Outlined Button")
            }

            ElevatedButton(onClick = {}) {
                Text("Elevated Button")
            }

            TextButton(onClick = {}) {
                Text("Text Button")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MaterialShowcasePreview() {
    MaterialComponentsMiniShowcase()
}
