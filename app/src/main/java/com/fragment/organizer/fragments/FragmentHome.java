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
import com.fragment.organizer.databinding.FragmentHomeBinding;

/**
 * Created by Techno Blogger on 14/7/17.
 */

public class FragmentHome extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHomeBinding fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

        AppSingleton.getInstance().getActivityInstance().setToolbarTitle(getResources().getString(R.string.fragment_home));

        fragmentHomeBinding.btnOne.setOnClickListener(this);
        fragmentHomeBinding.btnTwo.setOnClickListener(this);
        fragmentHomeBinding.btnThree.setOnClickListener(this);
        fragmentHomeBinding.btnFour.setOnClickListener(this);

        return fragmentHomeBinding.getRoot();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                // If we pass true, then onBackPress(), you will reach to this place.
                AppSingleton.getInstance().getFlowOrganization().replace(new FragmentA(), true);
                break;

            case R.id.btnTwo:
                // If we pass false, then onBackPress(), you will exit the app.
                AppSingleton.getInstance().getFlowOrganization().replace(new FragmentB(), true);
                break;
            case R.id.btnThree:
                // If we want to pass some value to the next page, we will use Bundle, and will pass like this.
                Bundle bundle = new Bundle();
                bundle.putString("keyA", "valueA");
                AppSingleton.getInstance().getFlowOrganization().replace(new FragmentC(), bundle, false);
                break;
            case R.id.btnFour:
                // If we want to save the state of the current page we will add.
                // Since we are adding, we have to provide a background to the fragment_d layout as white.
                // And we will extend the FragmentD with FragmentBackHelper.
                // Feel free to modify, and have a look at the change.
                AppSingleton.getInstance().getFlowOrganization().add(new FragmentD(), true);
                break;

            default:
                break;

        }
    }
}
