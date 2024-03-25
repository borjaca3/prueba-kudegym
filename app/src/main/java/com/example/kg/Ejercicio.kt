package com.example.kg

class Ejercicio {
    private var id: Int = 0;
    private var nombre: String ="";
    private var series: Int = 0;
    private var repeticiones: Int = 0;
    private var grupoMuscular: String = "";
    private var rm: Float = 0.0f;

    fun getId(): Int {
        return id;
    }
    fun setId(valor){
        id = valor;
    }

    fun getNombre(): String {
        return nombre;
    }
    fun setNombre(valor){
        nombre = valor;
    }
}