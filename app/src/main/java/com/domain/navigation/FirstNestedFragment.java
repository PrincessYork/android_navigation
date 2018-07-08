package com.domain.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


public class FirstNestedFragment extends Fragment {

    private Button toSecondNestedButton;

    public FirstNestedFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_nested, container, false);

        toSecondNestedButton = view.findViewById(R.id.to_second_nested_fragment_button);
        toSecondNestedButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstNestedFragment_to_secondNestedFragment));

        return view;
    }
}
