package com.kuloud.android.chart.interfaces.dataprovider;

import com.kuloud.android.chart.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
