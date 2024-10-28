package com.monacolabs.liveui.Molecules.RadioButton

data class RadioButtonData(
    val id: String,
    val leadingSlot: String? = null,
    val centerSlot: String? = null,
    val trailingSlot: List<String?> = listOf(),
    val isSelected: Boolean
)