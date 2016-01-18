package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import main.java.com.kuloud.android.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
