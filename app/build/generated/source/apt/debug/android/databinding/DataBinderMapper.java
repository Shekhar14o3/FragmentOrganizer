
package android.databinding;
import com.fragment.organizer.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 15;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.fragment.organizer.R.layout.fragment_b:
                    return com.fragment.organizer.databinding.FragmentBBinding.bind(view, bindingComponent);
                case com.fragment.organizer.R.layout.fragment_a:
                    return com.fragment.organizer.databinding.FragmentABinding.bind(view, bindingComponent);
                case com.fragment.organizer.R.layout.activity_main:
                    return com.fragment.organizer.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.fragment.organizer.R.layout.fragment_d:
                    return com.fragment.organizer.databinding.FragmentDBinding.bind(view, bindingComponent);
                case com.fragment.organizer.R.layout.fragment_home:
                    return com.fragment.organizer.databinding.FragmentHomeBinding.bind(view, bindingComponent);
                case com.fragment.organizer.R.layout.fragment_c:
                    return com.fragment.organizer.databinding.FragmentCBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -746844183: {
                if(tag.equals("layout/fragment_b_0")) {
                    return com.fragment.organizer.R.layout.fragment_b;
                }
                break;
            }
            case -746845144: {
                if(tag.equals("layout/fragment_a_0")) {
                    return com.fragment.organizer.R.layout.fragment_a;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.fragment.organizer.R.layout.activity_main;
                }
                break;
            }
            case -746842261: {
                if(tag.equals("layout/fragment_d_0")) {
                    return com.fragment.organizer.R.layout.fragment_d;
                }
                break;
            }
            case -1115993926: {
                if(tag.equals("layout/fragment_home_0")) {
                    return com.fragment.organizer.R.layout.fragment_home;
                }
                break;
            }
            case -746843222: {
                if(tag.equals("layout/fragment_c_0")) {
                    return com.fragment.organizer.R.layout.fragment_c;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}