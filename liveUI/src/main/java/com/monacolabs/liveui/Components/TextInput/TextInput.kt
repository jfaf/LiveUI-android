package com.monacolabs.liveui.Components.TextInput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun TextInput(
    userInput: MutableState<String>,
    data: com.monacolabs.liveui.Components.TextInput.TextInputData,
    tokens: com.monacolabs.liveui.Components.TextInput.TextInputTokens,
    modifier: Modifier,
    onKeyboardDismissed: () -> Unit
) {
    TextInput(userInput, data, tokens, modifier, onKeyboardDismissed)
}