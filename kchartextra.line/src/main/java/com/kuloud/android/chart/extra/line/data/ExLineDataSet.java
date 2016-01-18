package com.kuloud.android.chart.extra.line.data;

import android.graphics.Shader;

import com.kuloud.android.chart.data.Entry;
import com.kuloud.android.chart.data.LineDataSet;
import com.kuloud.android.chart.extra.line.interfaces.datasets.IExLineDataSet;

import java.util.List;

/**
 * Created by Kuloud on 2016/1/17.
 */
public class ExLineDataSet extends LineDataSet implements IExLineDataSet {
    /** transparency used for filling line surface */
    private Shader mFillShader = null;

    public ExLineDataSet(List<Entry> yVals, String label) {
        super(yVals, label);
    }

    @Override
    public Shader getFillShader() {
        return mFillShader;
    }

    /**
     * sets the shader value that is used for filling the line surface.
     *
     * @param shader
     */
    public void setFillShader(Shader shader) {
        mFillShader = shader;
    }
}
