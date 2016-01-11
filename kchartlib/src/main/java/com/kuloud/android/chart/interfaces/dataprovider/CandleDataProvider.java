package com.kuloud.android.chart.interfaces.dataprovider;

import com.kuloud.android.chart.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
