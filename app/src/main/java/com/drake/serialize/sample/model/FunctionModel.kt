package com.drake.serialize.sample.model

import kotlinx.serialization.Serializable


@Serializable
data class FunctionModel(var name: String, var unit: () -> Unit)
