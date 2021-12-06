package com.github.maxfie1d.compose.slot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CartSection() {
    SectionTemplate(
        title = {
            Text(text = "Cart")
        },
        action = {
            TextButton(onClick = {}) {
                Text(text = "See all")
            }
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            IntRange(1, 6).forEach {
                Text(text = "Item $it")
            }
            Text(text = "...")
        }
    }
}

@Preview
@Composable
private fun CartSectionPreview() {
    CartSection()
}
