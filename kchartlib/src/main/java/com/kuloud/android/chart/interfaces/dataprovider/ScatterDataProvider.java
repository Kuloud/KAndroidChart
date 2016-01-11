package com.kuloud.android.chart.interfaces.dataprovider;

import com.kuloud.android.chart.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
