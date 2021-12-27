package com.solucioneshr.soft.testapi_easybroker.data

data class Pagination(
    val limit: Int,
    val next_page: String,
    val page: Int,
    val total: Int
)