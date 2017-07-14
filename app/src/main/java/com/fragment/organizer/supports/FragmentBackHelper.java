package com.fragment.organizer.supports;

import android.support.v4.app.Fragment;

import com.fragment.organizer.interfaces.IOnBackPressed;

/**
 * Created by Techno Blogger on 14/7/17.
 */

/**
 * This class will extends Fragment, and will implement IOnBackPressed.
 * So, that if we want to handle the onBackPressed, we will extend this class instead of
 * normal Fragment.
 */

public class FragmentBackHelper extends Fragment implements IOnBackPressed {

    @Override
    public boolean onBackPressed() {
        return true;
    }
}
