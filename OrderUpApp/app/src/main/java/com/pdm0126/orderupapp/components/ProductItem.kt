package com.pdm0126.orderupapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.pdm0126.orderupapp.R
import com.pdm0126.orderupapp.data.Producto

@Composable
fun ProductItem(
    product: Producto
){
    Card(modifier = Modifier.fillMaxWidth()){
        Text(
            text = product.nombre,
            style = MaterialTheme.typography.bodyMedium,
        )
        Text(
            text = "${product.precio}",
            style = MaterialTheme.typography.bodySmall
        )

    }

}