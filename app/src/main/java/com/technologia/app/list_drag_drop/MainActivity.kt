package com.technologia.app.list_drag_drop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.technologia.app.list_drag_drop.ui.theme.List_Drag_DropTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            List_Drag_DropTheme {
                Surface(color = Color.LightGray) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(55.dp)
                                .background(MaterialTheme.colorScheme.primary),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "List Drag and Drop",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                                )
                        }

                        DragDropList(
                            items = NotesItem,
                            onMove = { fromIndex,toIndex->
                                NotesItem.move(fromIndex,toIndex)
                            }
                        )
                    }
                }
            }
        }
    }
}

val NotesItem = listOf(
    "Note 1",
    "Note 2",
    "Note 3",
    "Note 4",
    "Note 5",
    "Note 6",
    "Note 7",
    "Note 8",
    "Note 9",
    "Note 10",
    "Note 11",
    "Note 12",
    "Note 13",
    "Note 14",
    "Note 15",
    "Note 16",
    "Note 17",
    "Note 18",
    "Note 19",
    "Note 20"
).toMutableStateList()
