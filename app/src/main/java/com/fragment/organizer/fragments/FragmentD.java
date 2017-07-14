package com.fragment.organizer.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.fragment.organizer.AppSingleton;
import com.fragment.organizer.R;
import com.fragment.organizer.databinding.FragmentDBinding;
import com.fragment.organizer.supports.FragmentBackHelper;

/**
 * Created by Techno Blogger on 14/7/17.
 */

/**
 * Instead of extending Fragment, I'm extending FragmentBackHelper, so that while going back we can
 * perform some operation on the onBackPress().
 */

public class FragmentD extends FragmentBackHelper {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDBinding fragmentDBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_d, container, false);
        AppSingleton.getInstance().getActivityInstance().setToolbarTitle(getResources().getString(R.string.fragment_d));

        return fragmentDBinding.getRoot();
    }

    @Override
    public boolean onBackPressed() {
        AppSingleton.getInstance().getActivityInstance().setToolbarTitle(getResources().getString(R.string.fragment_home));
        Toast.makeText(AppSingleton.getInstance().getActivityInstance(), "onBackPressed() is Called", Toast.LENGTH_LONG).show();

        return super.onBackPressed();
    }
}
