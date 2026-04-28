package com.pdm0126.orderupapp.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.orderupapp.components.ProductItem
import com.pdm0126.orderupapp.model.menu

@Composable
fun MenuScreen() {
    Spacer(modifier = Modifier.height(5.dp))
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(menu) { Producto ->
            ProductItem(
                product = Producto
            )

            Spacer(modifier = Modifier.height(12.dp))
        }


    }
}
