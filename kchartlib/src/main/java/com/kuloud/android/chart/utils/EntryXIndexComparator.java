package com.kuloud.android.chart.utils;

import java.util.Comparator;

import com.kuloud.android.chart.data.Entry;

/**
 * Comparator for comparing Entry-objects by their x-index.
 * Created by philipp on 17/06/15.
 */
public class EntryXIndexComparator implements Comparator<Entry> {
    @Override
    public int compare(Entry entry1, Entry entry2) {
        return entry1.getXIndex() - entry2.getXIndex();
    }
}