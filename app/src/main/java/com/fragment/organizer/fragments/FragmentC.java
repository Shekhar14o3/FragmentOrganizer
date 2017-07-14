package com.fragment.organizer.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.fragment.organizer.AppSingleton;
import com.fragment.organizer.R;
import com.fragment.organizer.databinding.FragmentBBinding;
import com.fragment.organizer.databinding.FragmentCBinding;

/**
 * Created by Techno Blogger on 14/7/17.
 */

public class FragmentC extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCBinding fragmentCBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_c, container, false);
        AppSingleton.getInstance().getActivityInstance().setToolbarTitle(getResources().getString(R.string.fragment_c));
        Bundle bundle = new Bundle();
        bundle = getArguments();
        String strValue = bundle.getString("keyA");
        Toast.makeText(AppSingleton.getInstance().getActivityInstance(), "Bundle Value is " + strValue + "", Toast.LENGTH_LONG).show();

        return fragmentCBinding.getRoot();
    }
}
