package com.solucioneshr.soft.testapi_easybroker.data

data class Operation(
    val amount: Double,
    val currency: String,
    val formatted_amount: String,
    val type: String,
    val unit: String
)