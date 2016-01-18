package com.kuloud.android.chart.extra.line.interfaces.datasets;

import android.graphics.Shader;

import com.kuloud.android.chart.data.Entry;

/**
 * Created by Kuloud on 2016/1/17.
 */
public interface IExLineRadarDataSet<T extends Entry> {
    /**
     * Returns the shader that is used for filling the line surface,
     *
     * @return
     */
    Shader getFillShader();
}
