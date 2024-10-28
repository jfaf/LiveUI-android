package com.monacolabs.liveui.Components.TransactionItem

data class TransactionItemTokens(
    val leadingSlot: com.monacolabs.liveui.Models.Molecule?,
    val centerSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val trailingSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val divider: com.monacolabs.liveui.Models.Molecule?
)