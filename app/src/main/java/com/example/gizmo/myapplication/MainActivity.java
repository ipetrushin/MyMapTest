package com.example.gizmo.myapplication;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.scand.svg.SVGHelper;

import java.io.IOException;

public class MainActivity extends Activity {
    float transX = 0, transY = 0;
    MyMapView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawable mapd =
        map = findViewById(R.id.map);
        //map.setImageDrawable(mapd);


    }

    public void onClick(View v) {
        transX += 10;
        map.setTranslationX(transX);
    }

}
