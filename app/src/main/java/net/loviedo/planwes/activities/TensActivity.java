package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import net.loviedo.planwes.R;

public class TensActivity extends AppCompatActivity {
    private Spinner spiChannels;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tens);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        // Inflate
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Inflate spiChannels
        spiChannels = findViewById(R.id.spi_channels);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.channels_array,
                        android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiChannels.setAdapter(adapter);
    }

    public void tensParameter(View v) {
        Intent i = new Intent(this, TensParameterActivity.class);
        startActivity(i);
    }

    public void tensModulation(View v) {
        Intent intent = new Intent(this, TensModulationActivity.class);
        startActivity(intent);
    }

}//End class
