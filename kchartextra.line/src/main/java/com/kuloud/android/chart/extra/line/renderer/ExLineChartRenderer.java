package com.kuloud.android.chart.extra.line.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

import com.kuloud.android.chart.animation.ChartAnimator;
import com.kuloud.android.chart.extra.line.data.ExLineDataSet;
import com.kuloud.android.chart.interfaces.dataprovider.LineDataProvider;
import com.kuloud.android.chart.interfaces.datasets.ILineDataSet;
import com.kuloud.android.chart.renderer.LineChartRenderer;
import com.kuloud.android.chart.utils.Transformer;
import com.kuloud.android.chart.utils.ViewPortHandler;

public class ExLineChartRenderer extends LineChartRenderer {
    protected Paint mFillPaintInner;

    public ExLineChartRenderer(LineDataProvider chart, ChartAnimator animator, ViewPortHandler viewPortHandler) {
        super(chart, animator, viewPortHandler);

        mFillPaintInner = new Paint(Paint.ANTI_ALIAS_FLAG);
        mFillPaintInner.setStyle(Paint.Style.FILL);
        mFillPaintInner.setColor(Color.WHITE);
    }

    @Override
    protected void drawCubicFill(Canvas c, ILineDataSet dataSet, Path spline, Transformer trans, int from, int to) {
        if (dataSet instanceof ExLineDataSet) {
            if (to - from <= 1)
                return;

            float fillMin = dataSet.getFillFormatter()
                    .getFillLinePosition(dataSet, mChart);

            spline.lineTo(to - 1, fillMin);
            spline.lineTo(from, fillMin);
            spline.close();

            trans.pathValueToPixel(spline);

            Shader shader = ((ExLineDataSet) dataSet).getFillShader();
            if (shader == null) {
                super.drawCubicFill(c, dataSet, spline, trans, from, to);
            } else {
                drawFilledPath(c, spline, shader);
            }

        } else {
            super.drawCubicFill(c, dataSet, spline, trans, from, to);
        }

    }

    @Override
    protected void drawLinearFill(Canvas c, ILineDataSet dataSet, int minx,
                                  int maxx,
                                  Transformer trans) {
        if (dataSet instanceof ExLineDataSet) {
            Path filled = generateFilledPath(
                    dataSet, minx, maxx);

            trans.pathValueToPixel(filled);

            Shader shader = ((ExLineDataSet) dataSet).getFillShader();
            if (shader == null) {
                super.drawLinearFill(c, dataSet, minx, maxx, trans);
            } else {
                drawFilledPath(c, filled, ((ExLineDataSet) dataSet).getFillShader());
            }

        } else {
            super.drawLinearFill(c, dataSet, minx, maxx, trans);
        }


    }

    protected void drawFilledPath(Canvas c, Path filledPath, Shader shader) {
        if (shader != null) {
            c.save();
            c.clipPath(filledPath);
            mFillPaintInner.setShader(shader);
            c.drawPath(filledPath, mFillPaintInner);
            c.restore();
        }
    }
}
