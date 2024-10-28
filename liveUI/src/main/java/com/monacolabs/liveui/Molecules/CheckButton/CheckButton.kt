package com.monacolabs.liveui.Molecules.CheckButton

import androidx.compose.runtime.Composable
import com.monacolabs.liveui.Models.RapidAppCallback

@Composable
fun CheckButton(
    data: CheckButtonData,
    tokens: CheckButtonTokens,
    callback: (RapidAppCallback) -> Unit
){
    CheckButton(
        data, tokens, callback
    )
}