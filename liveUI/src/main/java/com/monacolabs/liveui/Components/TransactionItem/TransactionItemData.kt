package com.monacolabs.liveui.Components.TransactionItem

data class TransactionItemData(
    val id: String,
    val leadingSlot: List<String>,
    val centerSlot: List<String>,
    val trailingSlot: List<String>
)