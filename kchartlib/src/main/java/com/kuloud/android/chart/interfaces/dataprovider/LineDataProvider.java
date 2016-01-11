package com.kuloud.android.chart.interfaces.dataprovider;

import com.kuloud.android.chart.components.YAxis;
import com.kuloud.android.chart.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
