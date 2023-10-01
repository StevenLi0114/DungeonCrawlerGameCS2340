package com.example.cs2340a_team11.View;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.cs2340a_team11.R;
import com.example.cs2340a_team11.ViewModel.EndScreenViewModel;
import com.example.cs2340a_team11.ViewModel.InitialConfigViewModel;

public class EndingActivity extends AppCompatActivity {
    private EndScreenViewModel endScreenViewModel;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ending_screen);
        endScreenViewModel = new ViewModelProvider(this).get(EndScreenViewModel.class);

        // DO PLEASE: display end results by fetching info from view-model
    }
}