package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import main.java.com.kuloud.android.charting.components.YAxis.AxisDependency;
import main.java.com.kuloud.android.charting.data.BarLineScatterCandleBubbleData;
import main.java.com.kuloud.android.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    int getMaxVisibleCount();
    boolean isInverted(AxisDependency axis);
    
    int getLowestVisibleXIndex();
    int getHighestVisibleXIndex();

    BarLineScatterCandleBubbleData getData();
}
