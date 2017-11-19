package com.ayvengoza.locatr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ayven on 19.11.2017.
 */

public class LocaltrFragment extends Fragment {
    public static LocaltrFragment newInstance(){
        Bundle args = new Bundle();
        LocaltrFragment fragment = new LocaltrFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_locatr, container, false);
        return view;
    }
}
