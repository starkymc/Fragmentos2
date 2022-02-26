package com.example.fragmentos2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FR extends Fragment {
EditText txt1;
Button btn;

    public FR()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_f_r, container, false);
        txt1 = (EditText) view.findViewById(R.id.editTextTextPersonName);
        btn = (Button) view.findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String nom = txt1.getText().toString();

                Toast.makeText(getActivity(), "Bienvenido " + nom, Toast.LENGTH_SHORT).show();
            }

        });
        return view;
    }
    }