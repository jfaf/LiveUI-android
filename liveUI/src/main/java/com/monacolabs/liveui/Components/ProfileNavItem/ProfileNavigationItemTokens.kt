package com.monacolabs.liveui.Components.ProfileNavItem

data class ProfileNavigationItemTokens (
    val background: com.monacolabs.liveui.Models.Atom?,
    val leadingSlot: com.monacolabs.liveui.Models.Molecule?,
    val centerSlot: List<com.monacolabs.liveui.Models.Molecule>,
    val trailingSlot: com.monacolabs.liveui.Models.Molecule?
)