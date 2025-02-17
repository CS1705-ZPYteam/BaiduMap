package baidumapsdk.demo.geometry;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import baidumapsdk.demo.R;
import baidumapsdk.demo.util.DemoInfo;
import baidumapsdk.demo.util.DemoListAdapter;

public class GeometryList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulist);
        ListView demoList = (ListView) findViewById(R.id.mapList);
        // 添加ListItem，设置事件响应
        demoList.setAdapter(new DemoListAdapter(GeometryList.this, DEMOS));
        demoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View v, int index, long arg3) {
                onListItemClick(index);
            }
        });
    }

    void onListItemClick(int index) {
        Intent intent;
        intent = new Intent(GeometryList.this, DEMOS[index].demoClass);
        this.startActivity(intent);
    }

    private static final DemoInfo[] DEMOS = {
            new DemoInfo(R.string.demo_title_marker, R.string.demo_desc_marker, Marker.class),
            new DemoInfo(R.string.demo_title_marker_animation, R.string.demo_desc_marker_animation, MarkerAnimation.class),
            new DemoInfo(R.string.demo_title_cluster, R.string.demo_desc_cluster, MarkerCluster.class),
            new DemoInfo(R.string.demo_title_polyline, R.string.demo_desc_polyline, Polyline.class),
            new DemoInfo(R.string.demo_title_polygon, R.string.demo_desc_polygon, Polygon.class),
            new DemoInfo(R.string.demo_title_circle, R.string.demo_desc_circle, Circle.class),
            new DemoInfo(R.string.demo_title_arc, R.string.demo_desc_arc, Arc.class),
            new DemoInfo(R.string.demo_title_groundoverlay, R.string.demo_desc_groundoverlay, GroundOverlay.class),
            new DemoInfo(R.string.demo_title_tile, R.string.demo_desc_tile, TileOverlay.class),
            new DemoInfo(R.string.demo_title_heat, R.string.demo_desc_heat, HeatMap.class),
            new DemoInfo(R.string.demo_title_opengl, R.string.demo_desc_opengl, Opengl.class),
            new DemoInfo(R.string.demo_title_track_show, R.string.demo_desc_track_show, TrackShow.class)
    };
}

