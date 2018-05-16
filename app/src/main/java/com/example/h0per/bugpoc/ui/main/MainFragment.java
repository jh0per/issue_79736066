package com.example.h0per.bugpoc.ui.main;

import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.h0per.bugpoc.R;

public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getSimpleName();
    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ConstraintLayout layout = (ConstraintLayout) inflater.inflate(R.layout.main_fragment, container, false);

        Toolbar toolbar = layout.findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_androidx); //EVEN DONT WORK
        MenuItem item = toolbar.getMenu().findItem(R.id.action_search);
        Log.d(TAG,"Is ActionView null? : " + ((item.getActionView() == null) ? "yes" : "no"));


        Toolbar toolbar2 = layout.findViewById(R.id.toolbar2);
        toolbar2.inflateMenu(R.menu.menu_support);
        MenuItem item2 = toolbar2.getMenu().findItem(R.id.action_search);
        Log.d(TAG,"Is ActionView null? : " + ((item2.getActionView() == null) ? "yes" : "no, but this variant says, that i need to use \"android:\" namespace when not use appcompat [ps.look at R.menu.menu_support]"));

        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}
