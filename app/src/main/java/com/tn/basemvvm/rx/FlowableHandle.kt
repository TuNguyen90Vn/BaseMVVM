package com.tn.basemvvm.rx

import io.reactivex.rxjava3.core.Flowable

interface FlowableHandle<T> {

    fun request(): Flowable<T>

    fun response(response: T)

    fun error(throwable: Throwable)
}