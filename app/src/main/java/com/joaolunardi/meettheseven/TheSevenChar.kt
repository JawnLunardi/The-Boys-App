package com.joaolunardi.meettheseven

data class TheSevenChar(
    var charName : String,
    var aka : Int,
    var imageRes : Int,
    var charDesc : Int
)

fun getAllSevenChars() : List<TheSevenChar> {
    return listOf<TheSevenChar>(
        TheSevenChar("Homelander", R.string.homelander_subtitle, R.drawable.homelander, R.string.homelander),
        TheSevenChar("Queen Maeve", R.string.queen_maeve_subtitle, R.drawable.queenmaeve, R.string.queenmaeve),
        TheSevenChar("Black Noir", R.string.black_noir_subtitle, R.drawable.blacknoir, R.string.blacknoir),
        TheSevenChar("The Deep", R.string.the_deep_subtitle, R.drawable.deep, R.string.deep),
        TheSevenChar("A-Train", R.string.a_train_subtitle, R.drawable.atrain, R.string.atrain),
        TheSevenChar("Starlight", R.string.starlight_subtitle, R.drawable.starlight, R.string.starlight),
        TheSevenChar("Translucent", R.string.translucent_subtitle, R.drawable.translucent, R.string.translucent)
    )}