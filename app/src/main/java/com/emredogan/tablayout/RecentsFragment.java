package com.emredogan.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emredogan on 12/03/2018.
 */

public class RecentsFragment extends android.support.v4.app.Fragment {

    View view;

    public RecentsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.recent_layout,container,false);

        return view;

    }
}
