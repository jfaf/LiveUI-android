package com.monacolabs.liveui.Components.DescriptionCard

import androidx.compose.runtime.Composable

@Composable
fun DescriptionCard(
    tokens: com.monacolabs.liveui.Components.DescriptionCard.DescriptionCardTokens,
    data: com.monacolabs.liveui.Components.DescriptionCard.DescriptionCardData,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit
) {
    DescriptionCard(tokens, data, callback)
}