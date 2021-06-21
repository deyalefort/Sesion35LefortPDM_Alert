package com.example.sesion35lefortpdm_alert;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;

public class OnClickListenerModal2 implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        //Contexto donde se compila y ejecuta
        final Context context = view.getRootView().getContext();
        //Inflater abrir, desplegar
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //integramos xml a desplegar con evento click() java
        final View formElementsView = inflater.inflate(R.layout.input_modal2, null, false);
        //Elementos de ventana alert-modal
        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Ventana Lefort XML prod 2")
                .setPositiveButton("Cerrar Aqui!!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();

    }
}
