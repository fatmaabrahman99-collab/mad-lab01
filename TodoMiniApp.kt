package tz.ac.suza.statelab

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodoScreen() {

    var task by rememberSaveable {
        mutableStateOf("")
    }

    val items = remember {
        mutableStateListOf<String>()
    }

    TodoList(
        items = items,
        text = task,
        onTextChange = {
            task = it
        },

        onAdd = {
            if (task.isNotBlank()) {
                items.add(task)
                task = ""
            }
        },

        onRemove = {
            items.remove(it)
        }
    )
}

@Composable
fun TodoList(
    items: List<String>,
    text: String,
    onTextChange: (String) -> Unit,
    onAdd: () -> Unit,
    onRemove: (String) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Text(
            text = "Todo Mini App",
            style = MaterialTheme.typography.headlineSmall
        )

        Row {

            OutlinedTextField(
                value = text,
                onValueChange = onTextChange,
                modifier = Modifier.weight(1f),
                label = {
                    Text("Enter task")
                }
            )

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Button(
                onClick = onAdd
            ) {
                Text("Add")
            }
        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        if (items.isEmpty()) {

            Text(
                text = "No tasks available"
            )

        } else {

            items.forEach { item ->

                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = item,
                            modifier = Modifier.weight(1f)
                        )

                        Button(
                            onClick = {
                                onRemove(item)
                            }
                        ) {
                            Text("✕")
                        }
                    }
                }
            }
        }
    }
}