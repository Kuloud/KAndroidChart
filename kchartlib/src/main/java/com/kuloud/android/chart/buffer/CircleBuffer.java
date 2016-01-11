
package com.kuloud.android.chart.buffer;

import com.kuloud.android.chart.data.Entry;
import com.kuloud.android.chart.interfaces.datasets.ILineDataSet;

public class CircleBuffer extends AbstractBuffer<ILineDataSet> {

    public CircleBuffer(int size) {
        super(size);
    }

    protected void addCircle(float x, float y) {
        buffer[index++] = x;
        buffer[index++] = y;
    }

    @Override
    public void feed(ILineDataSet data) {

        int size = (int)Math.ceil((mTo - mFrom) * phaseX + mFrom);

        for (int i = mFrom; i < size; i++) {

            Entry e = data.getEntryForIndex(i);
            addCircle(e.getXIndex(), e.getVal() * phaseY);
        }
        
        reset();
    }
}
