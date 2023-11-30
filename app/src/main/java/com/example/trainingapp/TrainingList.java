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
                    String[] trainingInfo = {"Mobility Workout", "Pushups, Jumping Jacks", "1"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton2 = view.findViewById(R.id.trainingButton2);
        trainingButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Chest and Back", "Lateral Pull Down, French Press", "2"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton3 = view.findViewById(R.id.trainingButton3);
        trainingButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Squat Workout", "Regular Squat, Bulgarian Squat",  "3"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        Button trainingButton4 = view.findViewById(R.id.trainingButton4);
        trainingButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyListener != null) {
                    String[] trainingInfo = {"Deadlift Workout", "Regular Deadlift, Sumo Deadlift",  "4"};
                    MyListener.onFragmentInteraction(trainingInfo);
                }
            }
        });

        return view;
    }

}