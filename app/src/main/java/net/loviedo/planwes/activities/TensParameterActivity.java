package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.loviedo.planwes.R;

public class TensParameterActivity extends AppCompatActivity {
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_Light_Dialog); //this line i added
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tens_parameter);

        // Inflate
        btnExit = findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }

}//End class
