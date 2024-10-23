package com.hisdu.meas;

import java.lang.System;

/**
 * This abstract class extends AppCompatActivity class and overrides
 * lifecycle callbacks for logging various lifecycle events.
 *
 * Created by ZARA
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\u0007H\u0014J\b\u0010\r\u001a\u00020\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hisdu/meas/LifecycleLoggingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRestart", "onResume", "onStart", "onStop", "app_debug"})
public abstract class LifecycleLoggingActivity extends androidx.appcompat.app.AppCompatActivity {
    
    /**
     * Debugging tag used by the Android Logger
     */
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    public LifecycleLoggingActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Hook method called after onCreate() or after onRestart()
     * (when the activity is being restarted from stopped state).
     * Should re-acquire resources relinquished when activity was stopped(onStop())
     * or acquire those resources for the first time after onCreate().
     */
    @java.lang.Override
    protected void onStart() {
    }
    
    /**
     * Hook method called after onRestoreStateInstance(Bundle) only if
     * there is a prior saved instance state in Bundle
     * object.onResume() is called immediately after onStart().
     * onResume() is called when user resumes activity from paused state(onPause())
     * User can begin interacting with activity.
     * Place to startWithFavorite animations,acquire exclusive resources, such as the camera.
     */
    @java.lang.Override
    protected void onResume() {
    }
    
    /**
     * Hook method called when an Activity loses focus but is still visible in background.
     * May be followed by onStop() or onResume().Delegate more CPU intensive operation to
     * onStop for seamless transition to next activity.
     * Save persistent sate (onSaveInstanceState) in case app is killed.
     * Often used to release exclusive resources.
     */
    @java.lang.Override
    protected void onPause() {
    }
    
    /**
     * Called when activity is no longer visible.Release resources
     * that may cause memory leak.Save instance state (onSaveInstanceState())
     * in case activity is killed.
     */
    @java.lang.Override
    protected void onStop() {
    }
    
    /**
     * Hook method called when user restarts a stopped activity.Is
     * followed by call to onStart() and onResume().
     */
    @java.lang.Override
    protected void onRestart() {
    }
    
    /**
     * Hook method that gives a final chance to release resources and
     * stop spawned threads.onDestroy() may not always be called-when
     * system kills hosting process.
     */
    @java.lang.Override
    protected void onDestroy() {
    }
}