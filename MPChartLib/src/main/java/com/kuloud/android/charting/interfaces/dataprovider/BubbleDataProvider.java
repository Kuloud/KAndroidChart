package main.java.com.kuloud.android.charting.interfaces.dataprovider;

import main.java.com.kuloud.android.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
