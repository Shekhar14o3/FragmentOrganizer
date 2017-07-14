package com.fragment.organizer.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fragment.organizer.AppSingleton;
import com.fragment.organizer.R;
import com.fragment.organizer.databinding.ActivityMainBinding;
import com.fragment.organizer.fragments.FragmentHome;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Initialize this in MainActivity
        AppSingleton.getInstance().init(this);

        // Call your FragmentHome
        AppSingleton.getInstance().getFlowOrganization().add(new FragmentHome());


    }

    // Setting the toolbar title, and hiding the drawer and network icon
    public void setToolbarTitle(String strTitle) {
        activityMainBinding.toolBarTitle.setText(strTitle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Here, we have to call the onDestroy() of our AppSingleton.
        AppSingleton.getInstance().onDestroy();
    }
}
