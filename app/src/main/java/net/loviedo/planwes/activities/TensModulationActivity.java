package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.loviedo.planwes.R;

public class TensModulationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_tens_modulation);
    }

}//End class
