package com.example.magomed.motivateo.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.magomed.motivateo.R;
import com.example.magomed.motivateo.fragments.BaseFragment;

/**
 * Created by magomed on 09.11.17.
 */

public class ArbitrarilyRepeatTaskFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_arbitrarily_task, container, false);
    }
}
