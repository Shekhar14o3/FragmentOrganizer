package com.fragment.organizer.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragment.organizer.AppSingleton;
import com.fragment.organizer.R;
import com.fragment.organizer.databinding.FragmentABinding;
import com.fragment.organizer.databinding.FragmentHomeBinding;

/**
 * Created by Techno Blogger on 14/7/17.
 */

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentABinding fragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false);
        AppSingleton.getInstance().getActivityInstance().setToolbarTitle(getResources().getString(R.string.fragment_a));

        return fragmentABinding.getRoot();
    }
}
