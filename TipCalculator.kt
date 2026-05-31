package tz.ac.suza.statelab

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import java.util.Locale
import kotlin.math.ceil

@Composable
fun TipCalculatorScreen() {

    var billAmount by rememberSaveable {
        mutableStateOf("")
    }

    var tipPercent by rememberSaveable {
        mutableStateOf("15")
    }

    var roundUp by rememberSaveable {
        mutableStateOf(false)
    }

    TipCalculator(
        billAmount = billAmount,
        tipPercent = tipPercent,
        roundUp = roundUp,
        onBillChange = { billAmount = it },
        onTipChange = { tipPercent = it },
        onRoundChange = { roundUp = it }
    )
}

@Composable
fun TipCalculator(
    billAmount: String,
    tipPercent: String,
    roundUp: Boolean,
    onBillChange: (String) -> Unit,
    onTipChange: (String) -> Unit,
    onRoundChange: (Boolean) -> Unit
) {

    val bill = billAmount.toDoubleOrNull() ?: 0.0
    val tip = tipPercent.toDoubleOrNull() ?: 15.0

    var tipAmount = (bill * tip) / 100

    if (roundUp) {
        tipAmount = ceil(tipAmount)
    }

    val total = bill + tipAmount

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(
            text = "Tip Calculator",
            style = MaterialTheme.typography.headlineSmall
        )

        OutlinedTextField(
            value = billAmount,
            onValueChange = onBillChange,
            label = { Text("Bill Amount") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = tipPercent,
            onValueChange = onTipChange,
            label = { Text("Tip %") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Round up tip",
                modifier = Modifier.weight(1f)
            )

            Switch(
                checked = roundUp,
                onCheckedChange = onRoundChange
            )
        }

        HorizontalDivider()

        Text(
            text = "Tip: ${
                String.format(
                    Locale.getDefault(),
                    "%.2f",
                    tipAmount
                )
            }"
        )

        Text(
            text = "Total: ${
                String.format(
                    Locale.getDefault(),
                    "%.2f",
                    total
                )
            }"
        )
    }
}