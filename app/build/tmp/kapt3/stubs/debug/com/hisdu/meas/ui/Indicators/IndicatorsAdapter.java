package com.hisdu.meas.ui.Indicators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J(\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/app/Activity;", "listener", "Lcom/hisdu/meas/ui/Indicators/IndicatorListener;", "(Landroid/app/Activity;Lcom/hisdu/meas/ui/Indicators/IndicatorListener;)V", "<set-?>", "", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "indicatorlist", "getIndicatorlist", "()Ljava/util/List;", "setIndicatorlist", "(Ljava/util/List;)V", "indicatorlist$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItem", "position", "", "getItemCount", "getItemId", "", "getItemViewType", "notifyItem", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setColor", "view", "Landroid/widget/TextView;", "fulltext", "", "subtext", "color", "CommentViewHolder", "DateTimeViewHolder", "DropDownViewHolder", "EditTextViewHolder", "EmptyViewHolder", "HeadingViewHolder", "ImagePickerViewHolder", "LabelViewHolder", "MultiSelectionViewHolder", "app_debug"})
public final class IndicatorsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.hisdu.meas.ui.Indicators.IndicatorListener listener = null;
    @org.jetbrains.annotations.Nullable
    private final kotlin.properties.ReadWriteProperty indicatorlist$delegate = null;
    private final android.app.Activity context = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
    
    public IndicatorsAdapter(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    com.hisdu.meas.ui.Indicators.IndicatorListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.hisdu.meas.ui.Indicators.Indicator> getIndicatorlist() {
        return null;
    }
    
    public final void setIndicatorlist(@org.jetbrains.annotations.Nullable
    java.util.List<com.hisdu.meas.ui.Indicators.Indicator> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final com.hisdu.meas.ui.Indicators.Indicator getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    public final void notifyItem(int position) {
    }
    
    private final void setColor(android.widget.TextView view, java.lang.String fulltext, java.lang.String subtext, int color) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/LabelRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/LabelRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class LabelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.LabelRecylerItemBinding binding = null;
        
        public LabelViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.LabelRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$EditTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/EdittextRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/EdittextRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class EditTextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.EdittextRecylerItemBinding binding = null;
        
        public EditTextViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.EdittextRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$DropDownViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/DropdownRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/DropdownRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class DropDownViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.DropdownRecylerItemBinding binding = null;
        
        public DropDownViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.DropdownRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$HeadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/HeadingRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/HeadingRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class HeadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.HeadingRecylerItemBinding binding = null;
        
        public HeadingViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.HeadingRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$DateTimeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/DatePickerRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/DatePickerRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class DateTimeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.DatePickerRecylerItemBinding binding = null;
        
        public DateTimeViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.DatePickerRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$MultiSelectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/MultiselectionRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/MultiselectionRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class MultiSelectionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.MultiselectionRecylerItemBinding binding = null;
        
        public MultiSelectionViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.MultiselectionRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$ImagePickerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/ImageRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/ImageRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class ImagePickerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.ImageRecylerItemBinding binding = null;
        
        public ImagePickerViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.ImageRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$CommentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/CommentRecylerItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/CommentRecylerItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class CommentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.CommentRecylerItemBinding binding = null;
        
        public CommentViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.CommentRecylerItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hisdu/meas/databinding/EmptyItemBinding;", "(Lcom/hisdu/meas/ui/Indicators/IndicatorsAdapter;Lcom/hisdu/meas/databinding/EmptyItemBinding;)V", "onBind", "", "indicator", "Lcom/hisdu/meas/ui/Indicators/Indicator;", "app_debug"})
    public final class EmptyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hisdu.meas.databinding.EmptyItemBinding binding = null;
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.databinding.EmptyItemBinding binding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.hisdu.meas.ui.Indicators.Indicator indicator) {
        }
    }
}