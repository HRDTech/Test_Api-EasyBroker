package com.solucioneshr.soft.testapi_easybroker.data

data class Content(
    val agent: String,
    val bathrooms: Int,
    val bedrooms: Int,
    val construction_size: Double,
    val location: String,
    val lot_size: Double,
    val operations: List<Operation>,
    val parking_spaces: Any,
    val property_type: String,
    val public_id: String,
    val show_prices: Boolean,
    val title: String,
    val title_image_full: String,
    val title_image_thumb: String,
    val updated_at: String
)