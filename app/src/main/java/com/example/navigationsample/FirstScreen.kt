package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FirstScreen(navigationToSecondScreen : () -> Unit){
    var name by remember { mutableStateOf("") }
    var nameOutput by remember { mutableStateOf("Your name is: ") }

    Column(
        Modifier
            .fillMaxSize()
            .padding(15.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedTextField(value = name, onValueChange = {
            name = it
        })
        Text(text = "Hello $nameOutput")
        Row {
            Button(onClick = { nameOutput = name}) {
                Text(text = "Submit!")
            }
            Button(onClick = { navigationToSecondScreen() }) {
                Text(text = "Go to next Screen!")
            }
        }
      

      


    }
}
@Preview(showBackground = true)
@Composable
fun firstPreview(){
    FirstScreen ({})
}