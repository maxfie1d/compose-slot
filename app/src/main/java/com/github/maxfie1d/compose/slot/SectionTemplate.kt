package com.github.maxfie1d.compose.slot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.maxfie1d.compose.slot.ui.theme.ComposeslotTheme

@Composable
fun SectionTemplate(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit = {},
    action: @Composable () -> Unit = {},
    content: @Composable () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
        shape = RoundedCornerShape(32.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .then(modifier),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier.weight(1f),
                ) {
                    ProvideTextStyle(
                        MaterialTheme.typography.titleLarge,
                    ) {
                        title()
                    }
                }
                action()
            }
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SectionTemplatePreview() {
    ComposeslotTheme {
        SectionTemplate(
            modifier = Modifier.fillMaxWidth(),
            title = {
                Text(text = "Title slot")
            },
            action = {
                TextButton(onClick = {}) {
                    Text(text = "Action slot")
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "Content slot",
                )
            }
        }
    }
}
