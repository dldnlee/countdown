package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.countdown.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int click_count = 0;
    private int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.countdownImage.setVisibility(View.GONE);

        binding.midButton.setOnClickListener(v -> countdown());
    }

    private void countdown() {
        click_count++;
        count--;


        binding.num.setText(count + "번 남았습니다");


        if (click_count == 10) {
            binding.countdownImage.setVisibility(View.VISIBLE);
            binding.midButton.setVisibility(View.GONE);
            binding.num.setVisibility(View.GONE);
        }
    }
}