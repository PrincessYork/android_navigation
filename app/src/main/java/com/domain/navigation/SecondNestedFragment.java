package com.domain.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


public class SecondNestedFragment extends Fragment {

    private Button backToRoot;

    public SecondNestedFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_second_nested, container, false);

        backToRoot = view.findViewById(R.id.nested_back_to_root);
        backToRoot.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_global_firstFragment));

        return view;
    }
}
