package tz.ac.suza.composebasicslab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ResourceUsage() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
    ) {
        Text(
            text = "Resource Usage Example",
            style = MaterialTheme.typography.headlineMedium,
        )
        
        Spacer(modifier = Modifier.height(16.dp))

        // Example of using string resource
        Text(text = "App Name: ${stringResource(id = R.string.app_name)}")

        // Note: These resources (color, dimen) might need to be defined in res/values/
        // If they are missing, it will cause compilation errors.
        // Assuming standard resources for demonstration.
    }
}

@Preview(showBackground = true)
@Composable
fun ResourceUsagePreview() {
    ResourceUsage()
}
