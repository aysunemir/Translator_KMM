package com.plcoding.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

actual class CommonFlow<T> actual constructor(
    private val flow: Flow<T>
) : Flow<T> by flow