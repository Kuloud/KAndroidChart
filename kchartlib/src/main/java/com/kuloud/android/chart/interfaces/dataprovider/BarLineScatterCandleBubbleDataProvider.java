package com.kuloud.android.chart.interfaces.dataprovider;

import com.kuloud.android.chart.components.YAxis.AxisDependency;
import com.kuloud.android.chart.data.BarLineScatterCandleBubbleData;
import com.kuloud.android.chart.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    int getMaxVisibleCount();
    boolean isInverted(AxisDependency axis);
    
    int getLowestVisibleXIndex();
    int getHighestVisibleXIndex();

    BarLineScatterCandleBubbleData getData();
}
