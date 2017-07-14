package com.fragment.organizer;

import android.app.Application;

import com.fragment.flow.organizer.fragment.FlowOrganizer;
import com.fragment.organizer.activities.MainActivity;

/**
 * Created by Techno Blogger on 14/7/17.
 */


public class AppSingleton extends Application {

    private static AppSingleton appSingleton;
    private MainActivity _mainActivity;
    private FlowOrganizer _flowOrganizer;

    public AppSingleton() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        appSingleton = this;
    }

    public static AppSingleton getInstance() {
        if (appSingleton == null)
            appSingleton = new AppSingleton();
        return appSingleton;
    }

    public void init(MainActivity _mainActivity) {
        this._mainActivity = _mainActivity;
    }

    public FlowOrganizer getFlowOrganization() {
        if (_flowOrganizer == null)
            _flowOrganizer = new FlowOrganizer(_mainActivity, R.id.frame_parent);
        return _flowOrganizer;
    }

    public MainActivity getActivityInstance() {
        return _mainActivity;
    }

    public void onResume() {
        if (_flowOrganizer != null)
            _flowOrganizer.onResume();
    }

    public void onPause() {
        if (_flowOrganizer != null)
            _flowOrganizer.onPause();
    }

    public void onDestroy() {
        appSingleton = null;
        _mainActivity = null;
        _flowOrganizer = null;
    }
}
