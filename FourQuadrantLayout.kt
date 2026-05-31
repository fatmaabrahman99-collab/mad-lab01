package tz.ac.suza.composebasicslab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuadrantItem(
    title: String,
    description: String,
    color: Color,
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = description)
    }
}

@Composable
fun FourQuadrantLayout() {

    Column(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                "Text",
                "Displays text on screen.",
                Color.Green,
                Modifier.weight(1f),
            )

            QuadrantItem(
                "Image",
                "Displays images.",
                Color.Yellow,
                Modifier.weight(1f),
            )
        }

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                "Row",
                "Arranges items horizontally.",
                Color.Cyan,
                Modifier.weight(1f),
            )

            QuadrantItem(
                "Column",
                "Arranges items vertically.",
                Color.LightGray,
                Modifier.weight(1f),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FourQuadrantPreview() {
    FourQuadrantLayout()
}