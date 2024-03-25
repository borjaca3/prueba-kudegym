package com.example.kg

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button;

class Deporte {

    override fun onCreate(savedInstanceState: Bundle?){
        //super.onCreate(savedInstanceState)

        //setContentView(R.layout.//Archivo xml asociado);
        declararObjetos()
        funciones()
    }

    fun declararObjetos(){
        var boton = findViewById(R.id.idbutton)
    }

    fun funciones(){

    }

    fun introducirRutina(Ejercicio,){
        Ejercicio.setNombre(Ejercicio.nombre);
        Ejercicio.setSeries(Ejercicio.series);
        Ejercicio.setRepeticiones(Ejercicio.repeticiones);


    }
}