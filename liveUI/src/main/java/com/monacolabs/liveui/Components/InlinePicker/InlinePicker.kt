package com.monacolabs.liveui.Components.InlinePicker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@Composable
fun InlinePicker(
    selection: MutableState<String>,
    inputs: List<String>,
    data: com.monacolabs.liveui.Components.InlinePicker.InlinePickerData,
    tokens: com.monacolabs.liveui.Components.InlinePicker.InlinePickerTokens
) {
    InlinePicker(selection, inputs, data, tokens)
}