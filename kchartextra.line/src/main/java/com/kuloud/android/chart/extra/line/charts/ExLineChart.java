package com.kuloud.android.chart.extra.line.charts;

import android.content.Context;
import android.util.AttributeSet;

import com.kuloud.android.chart.charts.LineChart;
import com.kuloud.android.chart.extra.line.renderer.ExLineChartRenderer;

/**
 * Created by kuloud on 1/19/16.
 */
public class ExLineChart extends LineChart {
    protected ExLineChartRenderer mExRenderer = null;

    public ExLineChart(Context context) {
        super(context);
    }

    public ExLineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExLineChart(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void init() {
        super.init();

        mExRenderer = new ExLineChartRenderer(this, mAnimator, mViewPortHandler);
    }

    @Override
    protected void onDetachedFromWindow() {
        // releases the bitmap in the renderer to avoid oom error
        if (mExRenderer != null && mExRenderer instanceof ExLineChartRenderer) {
            ((ExLineChartRenderer) mExRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }
}
