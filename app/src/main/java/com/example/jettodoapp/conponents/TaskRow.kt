package com.example.jettodoapp.conponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettodoapp.Task


@Composable
fun TaskRow(
    task: Task,
    onClickRow: (Task) -> Unit,
    onClickDelete: (Task) -> Unit
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        elevation = 5.dp
    ) {
        Row(
            modifier = Modifier
                .clickable { onClickRow(task) }
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = task.title)
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { onClickDelete(task) }) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = "削除")
                
            }

        }

    }

}

@Preview
@Composable
private fun PreviewTaskRow(){
    TaskRow(
        Task(title = "プレビュー", description = ""),
        onClickRow = {},
        onClickDelete = {}
    )
}