package com.tn.basemvvm.rx

import io.reactivex.rxjava3.disposables.CompositeDisposable

abstract class RxManager {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()




}