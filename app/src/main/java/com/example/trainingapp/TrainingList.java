package com.example.trainingapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TrainingList extends Fragment {

    private OnFragmentInteractionListener MyListener;


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String[] trainingInfo);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            MyListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training_list, container, false);

        Button trainingButton1 = view.findViewById(R.id.trainingButton1);
        trainingButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Training 1", "Pushups, Jumping Jacks"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton2 = view.findViewById(R.id.trainingButton2);
        trainingButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Training 2", "Lateral Pull Down, French Press"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton3 = view.findViewById(R.id.trainingButton3);
        trainingButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Training 3", "Regular Squat, Bulgarian Squat"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton4 = view.findViewById(R.id.trainingButton4);
        trainingButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Training 4", "Regular Deadlift, Sumo Deadlift"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        return view;
    }

}