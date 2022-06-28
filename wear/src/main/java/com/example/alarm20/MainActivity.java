package com.example.alarm20;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.example.alarm20.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private Switch switch1;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        switch1 = binding.switch1;
    }
}