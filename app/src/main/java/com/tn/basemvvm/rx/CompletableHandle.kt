package com.tn.basemvvm.rx

import io.reactivex.rxjava3.core.Completable

interface CompletableHandle<T> {

    fun request() : Completable

    fun complete()

    fun error(throwable: Throwable)

}