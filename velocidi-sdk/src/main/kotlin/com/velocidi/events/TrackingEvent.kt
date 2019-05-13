package com.velocidi.events

import com.google.gson.*
import java.lang.reflect.Type

abstract class TrackingEvent(
    val type: String
) {
    abstract val siteId: String
    abstract val clientId: String

    /**
     * Serializes the current data model to JSON
     */
    open fun toJson(): String {
        return defaultGson.toJson(this)
    }

    /**
     * Serializes the current data model to query parameters
     */
    open fun toQueryParams(): Map<String, String> {
        val evt = defaultGson.toJsonTree(this)

        fun toQueryParamsAux(elem: JsonElement, qs: MutableMap<String, String>, path: String) {
            when (elem) {
                is JsonObject ->
                    for (key in elem.keySet()) {
                        val k = if (path.isEmpty()) key else "[$key]"
                        toQueryParamsAux(elem[key], qs, path + k)
                    }
                is JsonArray ->
                    for ((index, value) in elem.asIterable().withIndex()) {
                        val k = if (path.isEmpty()) index.toString() else "[$index]"
                        toQueryParamsAux(value, qs, path + k)
                    }
                is JsonPrimitive ->
                    qs[path] = elem.asString
            }
        }

        val qs = mutableMapOf<String, String>()
        toQueryParamsAux(evt, qs, "")

        return qs
    }

    companion object {
        val defaultGson =
            GsonBuilder()
                .registerTypeHierarchyAdapter(Collection::class.java, CollectionAdapter())
                .create()
    }

    /**
     * Gson doesn't have the concept of default values.
     * This Adapter excluded our most common default values from serialization - empty collections and null
     */
    internal class CollectionAdapter : JsonSerializer<List<*>> {
        override fun serialize(
            src: List<*>?,
            typeOfSrc: Type,
            context: JsonSerializationContext
        ): JsonElement? {
            if (src == null || src.isEmpty())
                return null

            val array = JsonArray()

            for (child in src) {
                val element = context.serialize(child)
                array.add(element)
            }

            return array
        }
    }
}
