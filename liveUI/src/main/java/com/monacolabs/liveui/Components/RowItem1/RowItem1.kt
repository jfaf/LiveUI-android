package com.monacolabs.liveui.Components.RowItem1

import androidx.compose.runtime.Composable
import com.jf.rapidapppackage.Package.Components.RowItem.RowItemData
import com.jf.rapidapppackage.Package.Models.Atom

@Composable
fun RowItem1(
    tokens: com.monacolabs.liveui.Components.RowItem1.RowItemTokens1,
    data: com.monacolabs.liveui.Components.RowItem1.RowItemData1,
    callback: (com.monacolabs.liveui.Models.RapidAppCallback) -> Unit
) {
    val rapidAppTokens = com.jf.rapidapppackage.Package.Components.RowItem.RowItemTokens(
        centerSlot = tokens.centerSlot.map {
            com.jf.rapidapppackage.Package.Models.Molecule(
                id = it.id,
                type = it.type,
                moleculeAtom = Atom(
                    itemName = it.moleculeAtom.itemName,
                    type = it.moleculeAtom.type,
                    version = it.moleculeAtom.version,
                    cornerRadiusTopRight = it.moleculeAtom.cornerRadiusTopRight,
                    cornerRadiusTopLeft = it.moleculeAtom.cornerRadiusTopLeft,
                    cornerRadiusBottomLeft = it.moleculeAtom.cornerRadiusBottomLeft,
                    cornerRadiusBottomRight = it.moleculeAtom.cornerRadiusBottomRight,
                    paddingRight = it.moleculeAtom.paddingRight,
                    paddingTop = it.moleculeAtom.paddingTop,
                    paddingLeft = it.moleculeAtom.paddingLeft,
                    paddingBottom = it.moleculeAtom.paddingBottom,
                    width = it.moleculeAtom.width,
                    relativeWidth = it.moleculeAtom.relativeWidth,
                    height = it.moleculeAtom.height,
                    relativeHeight = it.moleculeAtom.relativeHeight,
                    fill = it.moleculeAtom.fill,
                    opacity = it.moleculeAtom.opacity,
                    stroke = it.moleculeAtom.stroke,
                    strokeWidth = it.moleculeAtom.strokeWidth,
                    backgroundColor = it.moleculeAtom.backgroundColor,
                    focusColor = it.moleculeAtom.focusColor,
                    objectId = it.moleculeAtom.objectId,
                    font = it.moleculeAtom.font,
                    fontSize = it.moleculeAtom.fontSize,
                    fontWeight = it.moleculeAtom.fontWeight,
                    alignment = it.moleculeAtom.alignment,
                    multilineAlignment = it.moleculeAtom.multilineAlignment,
                    aspectRatioType = it.moleculeAtom.aspectRatioType
                ),
                atoms = it.atoms.map { atom ->
                    Atom(
                        itemName = atom.itemName
                    )
                },
                structure = it.structure
            )
        }
    )
    val rapidAppData = RowItemData(id = data.id, centerSlot = data.centerSlot)
    com.jf.rapidapppackage.Package.Components.RowItem.RowItem(rapidAppTokens, rapidAppData) {
       callback(com.monacolabs.liveui.Models.RapidAppCallback(it.key, it.value))
   }
}