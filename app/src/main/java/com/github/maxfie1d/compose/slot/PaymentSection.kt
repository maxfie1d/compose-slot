package com.github.maxfie1d.compose.slot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PaymentSection() {
    SectionTemplate(
        title = {
            Text(text = "Payment")
        },
        action = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Info,
                    contentDescription = null,
                )
            }
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(text = "XXXX-XXXX-XXXX")
            Text(text = "XX/XX")
            Text(text = "XXX")
        }
    }
}

@Preview
@Composable
private fun PaymentSectionPreview() {
    PaymentSection()
}
