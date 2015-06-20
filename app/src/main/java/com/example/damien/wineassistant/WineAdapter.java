package com.example.damien.wineassistant;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.damien.wineassistant.data.List;
import com.pkmmte.view.CircularImageView;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Damien on 6/20/2015.
 */
public class WineAdapter extends BaseAdapter{

    private Context ctx;
    private ViewHolder viewHolder;
    private java.util.List<List> wineList;

    public WineAdapter (Context ctx, java.util.List<List> wineList) {
        this.ctx = ctx;
        this.wineList = wineList;
    }

    public void addAll (java.util.List<List> wineList) {
        this.wineList.addAll(wineList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (!wineList.isEmpty()) {
            return wineList.size();
        } else {
            return -1;
        }
    }

    @Override
    public List getItem(int i) {
        return wineList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return getItem(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            view.getTag();
        } else {
            LayoutInflater inflater = LayoutInflater.from(ctx);
            view = inflater.inflate(R.layout.winelist_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        List item = getItem(i);
        viewHolder.wineName.setText(item.getName());
        viewHolder.wineLocation.setText(item.getAppellation().getRegion().getName());

        String urlLabel = "";
        if (!item.getLabels().isEmpty()) {
            urlLabel = item.getLabels().get(0).getUrl();
        }
        Picasso.with(ctx).load(urlLabel)
                .transform(new RoundTransform())
                .error(R.drawable.ic_drawer)
                .into(viewHolder.winePicture);

        Log.e(WineAdapter.class.getSimpleName(),
                "Entry " + i + ": "
                        + item.getName()
                        + ", " + item.getAppellation().getRegion().getName()
                        + ", "+item.getLabels().get(0).getUrl());
        return view;
    }

    static class ViewHolder {

        @InjectView(R.id.wine_name) TextView wineName;
        @InjectView(R.id.wine_location) TextView wineLocation;
        @InjectView(R.id.wine_picture) CircularImageView winePicture;

        public ViewHolder(View view) {
            ButterKnife.inject(this, view);
        }
    }
}
