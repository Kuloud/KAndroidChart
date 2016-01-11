package com.kuloud.android.chart.demo;

import com.kuloud.android.chart.demo.barchart.HorizontalBarChartActivity;
import com.kuloud.android.chart.demo.linechart.LineChartActivity1;
import com.kuloud.android.chart.demo.linechart.LineChartActivity2;
import com.kuloud.android.chart.demo.linechart.LineChartActivityColored;
import com.kuloud.android.chart.demo.linechart.MultiLineChartActivity;
import com.kuloud.android.chart.demo.piechart.PieChartActivity;
import com.kuloud.android.chart.demo.radarchart.RadarChartActivitry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class FeatureContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ContentItem> ITEMS = new ArrayList<ContentItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ContentItem> ITEM_MAP = new HashMap<String, ContentItem>();

    static {
        addItem(new ContentItem("Line Chart", "A simple demonstration of the linechart.", LineChartActivity1.class));
        addItem(new ContentItem("Line Chart (Dual YAxis)",
                "Demonstration of the linechart with dual y-axis.", LineChartActivity2.class));
        addItem(new ContentItem("Bar Chart", "A simple demonstration of the bar chart.", LineChartActivity1.class));
        addItem(new ContentItem("Horizontal Bar Chart",
                "A simple demonstration of the horizontal bar chart.", HorizontalBarChartActivity.class));
        addItem(new ContentItem("Combined Chart",
                "Demonstrates how to create a combined chart (bar and line in this case).", LineChartActivity1.class));
        addItem(new ContentItem("Pie Chart", "A simple demonstration of the pie chart.", PieChartActivity.class));
        addItem(new ContentItem("Scatter Chart", "A simple demonstration of the scatter chart.", LineChartActivity1.class));
        addItem(new ContentItem("Bubble Chart", "A simple demonstration of the bubble chart.", LineChartActivity1.class));
        addItem(new ContentItem("Stacked Bar Chart",
                "A simple demonstration of a bar chart with stacked bars.", LineChartActivity1.class));
        addItem(new ContentItem("Stacked Bar Chart Negative",
                "A simple demonstration of stacked bars with negative and positive values.", LineChartActivity1.class));
        addItem(new ContentItem("Another Bar Chart",
                "Implementation of a BarChart that only shows values at the bottom.", LineChartActivity1.class));
        addItem(new ContentItem("Multiple Lines Chart",
                "A line chart with multiple DataSet objects. One color per DataSet.", MultiLineChartActivity.class));
        addItem(new ContentItem("Multiple Bars Chart",
                "A bar chart with multiple DataSet objects. One multiple colors per DataSet.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Charts in ViewPager Fragments",
                "Demonstration of charts inside ViewPager Fragments. In this example the focus was on the design and look and feel of the chart.", LineChartActivity1.class));
        addItem(new ContentItem(
                "BarChart inside ListView",
                "Demonstrates the usage of a BarChart inside a ListView item.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Multiple charts inside ListView",
                "Demonstrates the usage of different chart types inside a ListView.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Inverted Line Chart",
                "Demonstrates the feature of inverting the y-axis.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Candle Stick Chart",
                "Demonstrates usage of the CandleStickChart.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Cubic Line Chart",
                "Demonstrates cubic lines in a LineChart.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Radar Chart",
                "Demonstrates the use of a spider-web like (net) chart.", RadarChartActivitry.class));
        addItem(new ContentItem(
                "Colored Line Chart",
                "Shows a LineChart with different background and line color.", LineChartActivityColored.class));
        addItem(new ContentItem(
                "Realtime Chart",
                "This chart is fed with new data in realtime. It also restrains the view on the x-axis.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Dynamical data adding",
                "This Activity demonstrates dynamical adding of Entries and DataSets (real time graph).", LineChartActivity1.class));
        addItem(new ContentItem(
                "Performance Line Chart",
                "Renders up to 30.000 objects smoothly.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Sinus Bar Chart",
                "A Bar Chart plotting the sinus function with 8.000 values.", LineChartActivity1.class));
        addItem(new ContentItem(
                "Chart in ScrollView",
                "This demonstrates how to use a chart inside a ScrollView.", LineChartActivity1.class));

        addItems();
    }

    private static void addItem(ContentItem item) {
        ITEMS.add(item);
    }

    private static void addItems() {
        for (int i = 0; i < ITEMS.size(); i++) {
            String id = String.valueOf(i + 1);
            ContentItem item = ITEMS.get(i);
            item.id = id;
            ITEM_MAP.put(id, item);
        }
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class ContentItem {
        public String id;
        public String content;
        public String details;
        public Class<? extends BaseActivity> cls;

        public ContentItem(String content, String details, Class<? extends BaseActivity> cls) {
            this.content = content;
            this.details = details;
            this.cls = cls;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
