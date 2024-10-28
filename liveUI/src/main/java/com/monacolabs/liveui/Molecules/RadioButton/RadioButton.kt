package com.monacolabs.liveui.Molecules.RadioButton

import androidx.compose.runtime.Composable
import com.monacolabs.liveui.Models.RapidAppCallback

@Composable
fun RadioButton(
    data: RadioButtonData,
    tokens: RadioButtonTokens,
    callback: (RapidAppCallback) -> Unit
){
    RadioButton(
        data, tokens, callback
    )
}