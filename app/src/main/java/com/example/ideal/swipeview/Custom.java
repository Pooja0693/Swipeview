package com.example.ideal.swipeview;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ideal on 2/6/2017.
 */

public class Custom extends PagerAdapter {
    int[] image={R.drawable.b1,R.drawable.b2,R.drawable.b3, R.drawable.b4};
    private Context ctx;
    private LayoutInflater L1;
    public Custom(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(LinearLayout)o);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        L1=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v= L1.inflate(R.layout.display,container,false);
        ImageView I1=(ImageView) v.findViewById(R.id.I1);
        TextView T1=(TextView) v.findViewById(R.id.T1);
        I1.setImageResource(image[position]);
        T1.setText("image:"+ position);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }
}
