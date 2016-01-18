package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import main.java.com.kuloud.android.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
