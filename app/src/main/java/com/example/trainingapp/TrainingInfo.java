package com.example.trainingapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

            String trainingPhotoID = args.getString("Training Photo");
            ImageView trainingPhotoIV = view.findViewById(R.id.trainingImage);

            switch (trainingPhotoID) {
                case "1":
                    trainingPhotoIV.setImageResource(R.drawable.ticon1);
                    break;
                case "2":
                    trainingPhotoIV.setImageResource(R.drawable.ticon2);
                    break;
                case "3":
                    trainingPhotoIV.setImageResource(R.drawable.ticon3);
                    break;
                case "4":
                    trainingPhotoIV.setImageResource(R.drawable.ticon4);
                    break;

            }
        }

        return view;
    }
}