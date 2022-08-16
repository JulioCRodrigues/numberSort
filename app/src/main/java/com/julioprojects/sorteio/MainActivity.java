package com.julioprojects.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.julioprojects.sorteio.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvNumberSort.setText("-");

        sortearNumero();
        limpar();

    }

    private void limpar() {
        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvNumberSort.setText("-");
            }
        });
    }

    private void sortearNumero() {
        binding.buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int intervalo = random.nextInt(10);
                binding.tvNumberSort.setText(String.valueOf(intervalo));
            }
        });
    }
}