package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import net.loviedo.planwes.R;

public class BipolarParameterActivity extends AppCompatActivity {
    private Button btnAccept, btnCancel;
    //private TextInputLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bipolar_parameter);
    }

}//End class
