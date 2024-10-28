package com.monacolabs.liveui.Components.VerticalCard

data class VerticalCardTokens(
    val background: com.monacolabs.liveui.Models.Atom?,
    val leadingSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val centerSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val trailingSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val extraSlot1: List<com.monacolabs.liveui.Models.Molecule>,
    val extraSlot2: List<com.monacolabs.liveui.Models.Molecule>,
    val extraSlot3: List<com.monacolabs.liveui.Models.Molecule>,
    val extraSlot4: List<com.monacolabs.liveui.Models.Molecule>
)