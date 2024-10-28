package com.monacolabs.liveui.Components.DescriptionCard

data class DescriptionCardTokens (
    val background: com.monacolabs.liveui.Models.Atom?,
    val leadingSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val centerSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val trailingSlot: List<com.monacolabs.liveui.Models.Molecule>
)