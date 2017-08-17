package com.iitp.mayank.celesta2k17.activities;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.iitp.mayank.celesta2k17.R;
import com.iitp.mayank.celesta2k17.adapters.EventsRecyclerViewAdapter;

public class ScmeEvents extends AppCompatActivity implements EventsRecyclerViewAdapter.ListCardClick {

    RecyclerView recyclerView;
    EventsRecyclerViewAdapter eventsRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_njack);

        recyclerView = (RecyclerView)findViewById(R.id.rv_events);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this , 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        Resources resources = getResources();

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.colorEvents)));

        eventsRecyclerViewAdapter = new EventsRecyclerViewAdapter(getApplicationContext() ,this , resources.getStringArray(R.array.array_scme_event_headers),
                resources.getStringArray(R.array.array_scme_event_text) ,
                resources.getStringArray(R.array.array_scme_event_intent),
                resources.obtainTypedArray(R.array.array_scme_event_images));
        recyclerView.setAdapter(eventsRecyclerViewAdapter);
    }

    @Override
    public void onListClick(String intent) throws ClassNotFoundException {

    }
}
