package net.loviedo.planwes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.loviedo.planwes.R;

public class BipolarParameterActivity extends AppCompatActivity {

    Button maxPort, minPort, maxTra, minTra;
    EditText parametersPort, parametersTra;

    private int contadorPort=2500;
    private int contadorTra=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.DialogCustomTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bipolar_parameter);

        maxPort = findViewById(R.id.btn_plus_fre_port);
        maxTra = findViewById(R.id.btn_plus_fre_tra);
        minPort = findViewById(R.id.btn_less_fre_port);
        minTra = findViewById(R.id.btn_less_fre_tra);

        parametersPort = findViewById(R.id.edt_parameters_port);
        parametersTra = findViewById(R.id.edt_parameters_tra);


        maxPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorPort==2510){
                    maxPort.setText("Max");
                }else if(contadorPort<2510){
                    maxPort.setText("+");
                    minPort.setText("-");
                    contadorPort++;
                    parametersPort.setText(""+contadorPort);
                }


            }
        });

        minPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorPort==2500){
                    minPort.setText("Min");
                }else if(contadorPort>2500){
                    minPort.setText("-");
                    maxPort.setText("+");
                    contadorPort--;
                    parametersPort.setText(""+contadorPort);
                }

            }
        });

        maxTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorTra==10){
                    maxTra.setText("Max");
                }else if(contadorTra<10){
                    maxTra.setText("+");
                    minTra.setText("-");
                    contadorTra++;
                    parametersTra.setText(""+contadorTra);
                }

            }
        });

        minTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contadorTra==0){
                    minTra.setText("Min");
                }else if(contadorTra>0){
                    minTra.setText("-");
                    maxTra.setText("+");
                    contadorTra--;
                    parametersTra.setText(""+contadorTra);
                }

            }
        });









    }

}//End class
