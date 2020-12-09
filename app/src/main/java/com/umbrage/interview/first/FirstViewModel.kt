package com.umbrage.interview.first

import android.util.Log
import io.reactivex.rxjava3.core.Completable

class FirstViewModel {
    fun doSomething(): Completable {
        return Completable.fromAction {
            Log.d("FirstViewModel", "did something")
        }
    }
}
