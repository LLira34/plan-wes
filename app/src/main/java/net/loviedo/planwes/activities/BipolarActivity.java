package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import net.loviedo.planwes.R;

public class BipolarActivity extends AppCompatActivity {
    private Spinner spiChannels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bipolar);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bipolar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
        upArrow.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

        // Inflate spinner
        spiChannels = findViewById(R.id.spi_channels);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.channels_array,
                        android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiChannels.setAdapter(adapter);
    }

    public void bipolarParameter(View v) {
        Intent i = new Intent(this, BipolarParameterActivity.class);
        startActivity(i);
    }

    public void bipolarModulation(View v) {
        Intent i = new Intent(this, BipolarModulationActivity.class);
        startActivity(i);
    }

}//End class
