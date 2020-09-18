package com.tn.basemvvm.rx

import io.reactivex.rxjava3.core.Flowable

interface FlowableListHandle<T> {

    fun request(): List<Flowable<Object>>

    fun response(response: T)

    fun error(throwable: Throwable)

}