package com.domain.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


public class SecondFragment extends Fragment {

    private Button toThirdFragment;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_second, container, false);

        toThirdFragment = view.findViewById(R.id.fragment_2_button_to_fragment_3);

        toThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragmentDirections.Action_secondFragment_to_thirdFragment action = SecondFragmentDirections.action_secondFragment_to_thirdFragment();
                Navigation.findNavController(v).navigate(action);
            }
        });

//        toThirdFragment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment, null));

        return view;
    }
}
