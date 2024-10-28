package com.monacolabs.liveui.Models

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

data class Atom(
    val itemName: String? = null,
    val type: String? = null,
    val version: String? = null,
    val cornerRadiusTopRight: Int? = null,
    val cornerRadiusTopLeft: Int? = null,
    val cornerRadiusBottomRight: Int? = null,
    val cornerRadiusBottomLeft: Int? = null,
    val paddingLeft: Int? = null,
    val paddingTop: Int? = null,
    val paddingRight: Int? = null,
    val paddingBottom: Int? = null,
    val width: Int? = null,
    val relativeWidth: Float? = null,
    val height: Int? = null,
    val relativeHeight: Float? = null,
    val fill: String? = null,
    val opacity: Float? = null,
    val stroke: String? = null,
    val strokeWidth: Int? = null,
    val backgroundColor: String? = null,
    val focusColor: String? = null,
    val objectId: String? = null,
    val font: String? = null,
    val fontSize: String? = null,
    val fontWeight: String? = null,
    val alignment: String? = null,
    val multilineAlignment: String? = null,
    val aspectRatioType: String? = null
)

// Extension function for Atom to convert string to FontWeight
fun Atom.convertStringToFontWeight(): FontWeight {
    return when (this.fontWeight?.lowercase()) {
        "100" -> FontWeight.W100
        "200" -> FontWeight.W200
        "300" -> FontWeight.W300
        "400" -> FontWeight.W400
        "500" -> FontWeight.W500
        "600" -> FontWeight.W600
        "700" -> FontWeight.W700
        "800" -> FontWeight.W800
        "900" -> FontWeight.W900
        else -> FontWeight.Normal
    }
}

// Extension function for Atom to convert string to TextAlign
fun Atom.convertStringToTextAlignment(): TextAlign {
    return when (this.multilineAlignment?.lowercase()) {
        "center" -> TextAlign.Center
        "left" -> TextAlign.Left
        "right" -> TextAlign.Right
        "justify" -> TextAlign.Justify
        else -> TextAlign.Start
    }
}