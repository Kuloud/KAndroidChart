package com.xxmassdeveloper.mpchartexample.custom;

import com.kuloud.android.chart.data.Entry;
import com.kuloud.android.chart.formatter.ValueFormatter;
import com.kuloud.android.chart.utils.ViewPortHandler;

import java.text.DecimalFormat;

public class MyValueFormatter implements ValueFormatter {

    private DecimalFormat mFormat;
    
    public MyValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return mFormat.format(value) + " $";
    }
}
