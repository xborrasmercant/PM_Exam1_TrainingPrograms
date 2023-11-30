package com.example.trainingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TrainingInfo extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training_info, container, false);

        Bundle args = getArguments();
        if (args != null) {
            String trainingTitle = args.getString("Training Title");
            TextView trainingTitleTV = view.findViewById(R.id.trainingTitle);
            trainingTitleTV.setText(trainingTitle);

            String trainingDesc = args.getString("Training Desc");
            TextView trainingDescTV = view.findViewById(R.id.trainingItem);
            trainingDescTV.setText(trainingDesc);
        }

        return view;
    }
}