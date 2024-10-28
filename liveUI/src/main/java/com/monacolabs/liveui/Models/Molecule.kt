package com.monacolabs.liveui.Models

data class Molecule(
    val id: String? = null,
    val type: String?,
    val atoms: List<com.monacolabs.liveui.Models.Atom>,
    val structure: String?,
    val moleculeAtom: com.monacolabs.liveui.Models.Atom
)