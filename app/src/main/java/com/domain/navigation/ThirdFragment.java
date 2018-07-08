package com.domain.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.Navigation;


public class ThirdFragment extends Fragment {

    private Button toNestedButton;
    private TextView textView;

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        textView = view.findViewById(R.id.textView3);

        toNestedButton = view.findViewById(R.id.to_nested_button);
        toNestedButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_simpleNestedGraph));

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        String fromWhere = ThirdFragmentArgs.fromBundle(getArguments()).getFromWhere();
        textView.setText("Next in back-stack: " + fromWhere);
    }
}
