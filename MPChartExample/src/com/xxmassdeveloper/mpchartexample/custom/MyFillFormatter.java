package com.xxmassdeveloper.mpchartexample.custom;

import com.kuloud.android.chart.formatter.FillFormatter;
import com.kuloud.android.chart.interfaces.datasets.ILineDataSet;
import com.kuloud.android.chart.interfaces.dataprovider.LineDataProvider;

/**
 * Created by Philipp Jahoda on 12/09/15.
 */
public class MyFillFormatter implements FillFormatter {

    private float mFillPos = 0f;

    public MyFillFormatter(float fillpos) {
        this.mFillPos = fillpos;
    }

    @Override
    public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
        // your logic could be here
        return mFillPos;
    }
}
