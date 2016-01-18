package main.java.com.kuloud.android.charting.interfaces.datasets;

import main.java.com.kuloud.android.charting.charts.ScatterChart;
import main.java.com.kuloud.android.charting.data.Entry;

/**
 * Created by philipp on 21/10/15.
 */
public interface IScatterDataSet extends ILineScatterCandleRadarDataSet<Entry> {

    /**
     * Returns the currently set scatter shape size
     *
     * @return
     */
    float getScatterShapeSize();

    /**
     * Returns all the different scattershapes the chart uses
     *
     * @return
     */
    ScatterChart.ScatterShape getScatterShape();
}
