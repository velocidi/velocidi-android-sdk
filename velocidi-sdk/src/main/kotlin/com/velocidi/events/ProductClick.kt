package com.velocidi.events

import kotlinx.serialization.Serializable

@Serializable
data class ProductClick(
    override val siteId: String,
    override val clientId: String? = null,
    val products: List<Product> = emptyList()
) : TrackingEvent("productClick", siteId, clientId) {
    override fun serialize(): String =
        jsonSerilizer().stringify(serializer(), this)
}
