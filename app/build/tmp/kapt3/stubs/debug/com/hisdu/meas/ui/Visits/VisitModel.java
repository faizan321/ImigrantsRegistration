package com.hisdu.meas.ui.Visits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJD\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\nH\u00d6\u0001J\t\u0010\'\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/hisdu/meas/ui/Visits/VisitModel;", "", "error", "", "list", "", "Lcom/hisdu/meas/ui/Visits/Visits;", "message", "", "statusCode", "", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/hisdu/meas/ui/Visits/VisitModel;", "equals", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class VisitModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean error;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.hisdu.meas.ui.Visits.Visits> list;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer statusCode;
    
    @org.jetbrains.annotations.NotNull
    public final com.hisdu.meas.ui.Visits.VisitModel copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.hisdu.meas.ui.Visits.Visits> list, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Message")
    java.lang.String message, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "StatusCode")
    java.lang.Integer statusCode) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public VisitModel() {
        super();
    }
    
    public VisitModel(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Error")
    java.lang.Boolean error, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "List")
    java.util.List<com.hisdu.meas.ui.Visits.Visits> list, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "Message")
    java.lang.String message, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "StatusCode")
    java.lang.Integer statusCode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Visits.Visits> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Visits.Visits> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Visits.Visits> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getStatusCode() {
        return null;
    }
    
    public final void setStatusCode(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
}