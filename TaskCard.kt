package tz.ac.suza.composebasicslab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskCard(
    title: String = "Default Task",
    description: String = "This is a default task description.",
    priority: String = "Low",
) {
    val borderColor = when (priority) {
        "High" -> Color.Red
        "Medium" -> Color(0xFFFF9800)
        else -> Color.Green
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Min),
        ) {
            Box(
                modifier = Modifier
                    .width(8.dp)
                    .fillMaxHeight()
                    .background(borderColor),
            )

            Column(
                modifier = Modifier.padding(16.dp),
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Priority: $priority",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCardPreview() {
    Column {
        TaskCard(
            title = "Finish Assignment",
            description = "Complete Compose lab exercises",
            priority = "High",
        )
        TaskCard(
            title = "Read Notes",
            description = "Study Jetpack Compose basics",
            priority = "Medium",
        )
        TaskCard(
            title = "Practice",
            description = "Build small Compose apps",
            priority = "Low",
        )
    }
}
