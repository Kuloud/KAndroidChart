package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import android.graphics.PointF;
import android.graphics.RectF;

import main.java.com.kuloud.android.charting.data.ChartData;
import main.java.com.kuloud.android.charting.formatter.ValueFormatter;

/**
 * Interface that provides everything there is to know about the dimensions,
 * bounds, and range of the chart.
 * 
 * @author Philipp Jahoda
 */
public interface ChartInterface {

    float getXChartMin();

    float getXChartMax();

    float getYChartMin();

    float getYChartMax();
    
    int getXValCount();

    int getWidth();

    int getHeight();

    PointF getCenterOfView();

    PointF getCenterOffsets();

    RectF getContentRect();
    
    ValueFormatter getDefaultValueFormatter();

    ChartData getData();
}
