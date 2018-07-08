package com.domain.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


public class FirstFragment extends Fragment {

    private Button toSecondFragment;
    private Button toThirdFragment;

    public FirstFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_first, container, false);

        toSecondFragment = view.findViewById(R.id.fragment_1_button_to_fragment_2);
        toThirdFragment = view.findViewById(R.id.fragment_1_button_to_fragment_3);

        toThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragmentDirections.Action_firstFragment_to_thirdFragment action = FirstFragmentDirections.action_firstFragment_to_thirdFragment();
                Navigation.findNavController(v).navigate(action);
            }
        });

        toSecondFragment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment, null));
//        toThirdFragment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_thirdFragment, null));

        return view;
    }
}
