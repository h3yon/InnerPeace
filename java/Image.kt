package com.project.innerpeace

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val imageSrc : Int,
    val imageTitle: String,
    val imageSummary : String,
    val imageDesc : String
) : Parcelable