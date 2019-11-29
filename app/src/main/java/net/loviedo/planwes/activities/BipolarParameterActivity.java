package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import net.loviedo.planwes.R;

public class BipolarParameterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bipolar_parameter);
    }

}//End class
