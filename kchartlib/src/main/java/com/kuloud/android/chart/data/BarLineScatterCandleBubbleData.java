
package com.kuloud.android.chart.data;

import java.util.List;

import com.kuloud.android.chart.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;

/**
 * Baseclass for all Line, Bar, Scatter, Candle and Bubble data.
 * 
 * @author Philipp Jahoda
 */
public abstract class BarLineScatterCandleBubbleData<T extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>
        extends ChartData<T> {
    
    public BarLineScatterCandleBubbleData() {
        super();
    }
    
    public BarLineScatterCandleBubbleData(List<String> xVals) {
        super(xVals);
    }
    
    public BarLineScatterCandleBubbleData(String[] xVals) {
        super(xVals);
    }

    public BarLineScatterCandleBubbleData(List<String> xVals, List<T> sets) {
        super(xVals, sets);
    }

    public BarLineScatterCandleBubbleData(String[] xVals, List<T> sets) {
        super(xVals, sets);
    }
}
