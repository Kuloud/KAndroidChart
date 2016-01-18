package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import main.java.com.kuloud.android.charting.components.YAxis;
import main.java.com.kuloud.android.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
