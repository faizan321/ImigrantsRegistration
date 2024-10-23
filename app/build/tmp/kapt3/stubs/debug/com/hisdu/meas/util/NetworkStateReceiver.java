package com.hisdu.meas.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/hisdu/meas/util/NetworkStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "connected", "", "Ljava/lang/Boolean;", "listeners", "", "Lcom/hisdu/meas/util/NetworkStateReceiver$OnNetworkStateReceiverListener;", "addListener", "", "listener", "notifyState", "notifyStateToAll", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "removeListener", "OnNetworkStateReceiverListener", "app_debug"})
public final class NetworkStateReceiver extends android.content.BroadcastReceiver {
    private final java.lang.String TAG = null;
    private java.util.Set<com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener> listeners;
    private java.lang.Boolean connected;
    
    public NetworkStateReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final void notifyStateToAll() {
    }
    
    private final void notifyState(com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener listener) {
    }
    
    public final void addListener(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener listener) {
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull
    com.hisdu.meas.util.NetworkStateReceiver.OnNetworkStateReceiverListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0005\u00c0\u0006\u0001"}, d2 = {"Lcom/hisdu/meas/util/NetworkStateReceiver$OnNetworkStateReceiverListener;", "", "networkAvailable", "", "networkUnavailable", "app_debug"})
    public static abstract interface OnNetworkStateReceiverListener {
        
        public abstract void networkAvailable();
        
        public abstract void networkUnavailable();
    }
}