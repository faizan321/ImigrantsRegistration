package com.hisdu.meas.data.source.remote

interface APIResponse<Type> {

    fun onSuccess(result: Type?)
//    fun onSuccess(result: List<Type>?)
    fun onError(t: Throwable)
//     fun onSuccess(it: Array<Any>?)
}
