package com.monacolabs.liveui.Components.ProfileNavItem

import androidx.compose.runtime.Composable

@Composable
fun ProfileNavItem(
    tokens: com.monacolabs.liveui.Components.ProfileNavItem.ProfileNavigationItemTokens,
    data: com.monacolabs.liveui.Components.ProfileNavItem.ProfileNavigationItemData,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit,
) {
    ProfileNavItem(tokens, data, callback)
}