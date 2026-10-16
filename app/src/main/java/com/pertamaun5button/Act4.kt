package com.pertamaun5button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier){
    // Variable-variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("")}
    var textAlamat by remember { mutableStateOf("")}
    var textJK by remember { mutableStateOf("")}

    // Variable-variable untuk menyimpan data yang di perolah dari komponn UI (sebagai simulasi database aja)
    var nama by remember { mutableStateOf("")}
    var alamat by remember { mutableStateOf("")}
    var jenis by remember { mutableStateOf("")}
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    Column(modifier = Modifier.padding(top = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large, // styling corner
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")}, // label field
            onValueChange = { //  event ketika ada perubahan
                textNama = it
            }
        )
    }
}