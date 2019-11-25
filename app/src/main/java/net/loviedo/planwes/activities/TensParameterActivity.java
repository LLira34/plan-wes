package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.loviedo.planwes.R;

public class TensParameterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme); //this line i added
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tens_parameter);
    }

}//End class
