package com.monacolabs.liveui.Molecules.CheckButton

data class CheckButtonData(
    val id: String,
    val leadingSlot: List<String> = listOf(),
    val centerSlot: String? = null,
    val isSelected: Boolean
)