package cl.awakelab.dinamicfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.dinamicfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}