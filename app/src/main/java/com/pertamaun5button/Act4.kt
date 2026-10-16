package com.pertamaun5button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun FormDataDiri(){
    // Variable-variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("")}
    var textAlamat by remember { mutableStateOf("")}
    var textJK by remember { mutableStateOf("")}

    // Variable-variable untuk menyimpan data yang di perolah dari komponn UI (sebagai simulasi database aja)
    var nama by remember { mutableStateOf("")}
}