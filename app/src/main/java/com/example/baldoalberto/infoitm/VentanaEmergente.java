package com.example.baldoalberto.infoitm;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class VentanaEmergente extends Fragment{

    String texto;
    @SuppressLint("ValidFragment")
    public VentanaEmergente(String txt)
    {
        texto = txt;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.ventana_emergente, container, false);

        TextView txt = (TextView) v.findViewById(R.id.prueba);

        txt.setText(texto);
        return v;
    }

    public void setTexto(String txt)
    {
        texto = txt;
    }
}
