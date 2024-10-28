package com.monacolabs.liveui.Components.SecureTextInput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun SecureTextInput(
    userInput: MutableState<String>,
    data: com.monacolabs.liveui.Components.TextInput.TextInputData,
    tokens: com.monacolabs.liveui.Components.TextInput.TextInputTokens,
    modifier: Modifier
) {
    SecureTextInput(userInput, data, tokens, modifier)
}