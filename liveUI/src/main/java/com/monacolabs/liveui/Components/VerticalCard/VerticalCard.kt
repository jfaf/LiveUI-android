package com.monacolabs.liveui.Components.VerticalCard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun VerticalCard(
    tokens: com.monacolabs.liveui.Components.VerticalCard.VerticalCardTokens,
    data: com.monacolabs.liveui.Components.VerticalCard.VerticalCardData,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit,
    horizontalAlignment: Alignment.Horizontal,
    isBottomAligned: Boolean
) {
    VerticalCard(
        tokens,
        data,
        callback,
        horizontalAlignment,
        isBottomAligned
    )
}