package com.alexanderpodkopaev.domain.usecases

import io.reactivex.internal.operators.single.SingleDoOnSuccess

interface UseCase<T,R> {
    suspend fun execute(request: T?, onSuccess: (R) -> Unit, onFailure: (String) -> Unit)
}