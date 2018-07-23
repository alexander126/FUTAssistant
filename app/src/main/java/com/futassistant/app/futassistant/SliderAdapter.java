package com.futassistant.app.futassistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by alex on 23/07/2018.
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter (Context context) {
        this.context = context;
    }

    public int [] slideImages = {
      R.drawable.ic_launcher_background,
      R.drawable.ic_launcher_foreground
    };

    public String[] slideHeaders = {

        "Hello",
        "Hello2",
        "Hello3"

    };
    public String[] slideText = {
        "Whatever1",
        "Whatever2",
        "Whatever3"
    };

    @Override
    public int getCount() {
        return slideHeaders.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =  layoutInflater.inflate(R.layout.slider, container, false);
        TextView sliderHeader = (TextView) view.findViewById(R.id.textView1);

        sliderHeader.setText(slideHeaders[position]);

        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem (ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout) object);
    }
}
