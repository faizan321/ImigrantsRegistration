package com.hisdu.meas.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\t\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/data/source/remote/APIResponse;", "Type", "", "onError", "", "t", "", "onSuccess", "result", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface APIResponse<Type extends java.lang.Object> {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable
    Type result);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull
    java.lang.Throwable t);
}