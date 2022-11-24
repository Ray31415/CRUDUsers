package com.raypl.crudusers.model

import com.google.gson.annotations.SerializedName

class UserAPIModel (
    @SerializedName("name") var name: String?,
    @SerializedName("birthdate") var birthdate: String?,
    @SerializedName("id") var id: String?
        )