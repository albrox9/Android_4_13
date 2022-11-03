package org.abrox.android_4_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarListeners();

        RadioGroup g = new RadioGroup(this);
        g.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener(){

                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {

                    }
                }
        );
    }

    private void configurarListeners() {

        RadioGroup rg = findViewById(R.id.rG);
        rg.setOnCheckedChangeListener((rGR, idBoton)-> actionCambioRG(idBoton)); //Le pasamos la variable radioGroup y el id

                /*new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int idRB) {
                        actionCambioRG(idRB);
                    }
                }
                Esto es una interfaz funcional que solo tiene un método y podemos susttuirla por una expresión lambda*/



    }

    private void actionCambioRG(int idRB) {

        String mensaje = "PRUEBA";

    switch (idRB){

        case R.id.rd1: mensaje ="Es UNO";  break;
        case R.id.rd2:  mensaje ="Es DOS"; break;
        case R.id.rd3:  mensaje ="Es TRES"; break;
        case R.id.rd4:  mensaje ="Es CUATRO"; break;

        //Esta no es la mejor forma de hacerlo. Debería
    }

        TextView tv = findViewById(R.id.tVSalida);
        tv.setText(mensaje);

    }
}