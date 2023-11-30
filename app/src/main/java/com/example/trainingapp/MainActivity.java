package com.example.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TrainingList.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

        TrainingList ListFragment = new TrainingList();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, ListFragment)
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(String[] trainingInfo) {
        TrainingInfo InfoFragment = new TrainingInfo();

        Bundle args = new Bundle();
        args.putString("Training Title", trainingInfo[0]);
        args.putString("Training Desc", trainingInfo[1]);
        InfoFragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, InfoFragment)
                .addToBackStack(null)
                .commit();
    }
}