package com.monacolabs.liveui.Containers.RowList

import androidx.compose.runtime.Composable

@Composable
fun RowList(
    data: com.monacolabs.liveui.Containers.RowList.RowListData,
    tokens: com.monacolabs.liveui.Containers.RowList.RowListTokens,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit) {
    RowList(
        data,
        tokens,
        callback
    )
}