package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.loviedo.planwes.R;

public class TensParameterActivity extends AppCompatActivity {
    Button maxFre, minFre, maxLong, minLong;
    EditText parametersFre, parametersLong;

    private int contadorFre=0;
    private int contadorLong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme); //this line i added
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_tens_parameter);

        maxFre = findViewById(R.id.btn_plus_fre);
        maxLong = findViewById(R.id.btn_plus_long);
        minFre = findViewById(R.id.btn_less_fre);
        minLong = findViewById(R.id.btn_less_long);

        parametersFre = findViewById(R.id.edt_parameters_fre);
        parametersLong = findViewById(R.id.edt_parameters_long);


        maxFre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorFre==10){
                    maxFre.setText("Max");
                }else if(contadorFre<10){
                    maxFre.setText("+");
                    minFre.setText("-");
                    contadorFre++;
                    parametersFre.setText(""+contadorFre);
                }

            }
        });

        maxLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorLong==10){
                    maxLong.setText("Max");
                }else if(contadorFre<10){
                    maxLong.setText("+");
                    minLong.setText("-");
                    contadorLong++;
                    parametersLong.setText(""+contadorLong);
                }

            }
        });

        minFre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorFre==0){
                    minFre.setText("Min");
                }else if(contadorFre>0){
                    minFre.setText("-");
                    maxFre.setText("+");
                    contadorFre--;
                    parametersFre.setText(""+contadorFre);
                }

            }
        });

        minLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorLong==0){
                    minLong.setText("Min");
                }else if(contadorLong>0){
                    minLong.setText("-");
                    maxLong.setText("+");
                    contadorLong--;
                    parametersLong.setText(""+contadorLong);
                }

            }
        });





    }

}//End class
