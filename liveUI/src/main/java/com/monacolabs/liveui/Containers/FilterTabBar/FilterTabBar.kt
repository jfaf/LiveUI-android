package com.monacolabs.liveui.Containers.FilterTabBar

import androidx.compose.runtime.Composable

@Composable
fun FilterTabBar(
    data: com.monacolabs.liveui.Containers.FilterTabBar.FilterTabBarData,
    tokens: com.monacolabs.liveui.Containers.FilterTabBar.FilterTabBarTokens,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit
) {
    FilterTabBar(
        data,
        tokens,
        callback
    )
}