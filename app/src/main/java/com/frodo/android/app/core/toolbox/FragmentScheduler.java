package com.frodo.android.app.core.toolbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.frodo.android.app.ui.activity.FragmentContainerActivity;

/**
 * Created by frodo on 2015/9/14. fragment Scheduler
 */
public class FragmentScheduler {

    public static void nextFragment(FragmentContainerActivity fragmentContainer,
                                    Class<? extends Fragment> fragmentClass,
                                    Bundle extra,
                                    boolean isFinishTopFragment) {
        fragmentContainer.addFragment(fragmentClass, extra, isFinishTopFragment);
    }
}
