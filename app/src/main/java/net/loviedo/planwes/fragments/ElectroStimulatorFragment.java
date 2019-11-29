package net.loviedo.planwes.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.loviedo.planwes.R;
import net.loviedo.planwes.activities.BipolarActivity;
import net.loviedo.planwes.activities.NMESActivity;
import net.loviedo.planwes.activities.TensActivity;

public class ElectroStimulatorFragment extends Fragment {
    private View view;
    private Button btnTens, btnBipolar, btnNmes;

    public ElectroStimulatorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_electro_stimulator, container, false);
        btnTens = view.findViewById(R.id.btn_tens);
        btnTens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), TensActivity.class);
                startActivity(i);
            }
        });
        btnBipolar = view.findViewById(R.id.btn_bipolar);
        btnBipolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), BipolarActivity.class);
                startActivity(i);
            }
        });
        btnNmes = view.findViewById(R.id.btn_nmes);
        btnNmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), NMESActivity.class);
                startActivity(i);
            }
        });
        return view;
    }

}//End class
