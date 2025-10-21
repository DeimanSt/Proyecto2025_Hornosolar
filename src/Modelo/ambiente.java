package Modelo;

import java.util.Date;


public class ambiente {

    // Variables de instancia (atributos)
    private String intensidad_solar;
    private int temperatura_ambiente;
    private int angulo;
    private String direccion_sol, fecha_registro;

    // Constructor
    public ambiente(String intensidad_solar, int temperatura_ambiente, int angulo, String direccion_sol, String fecha_registro) {
        this.intensidad_solar = intensidad_solar;
        this.temperatura_ambiente = temperatura_ambiente;
        this.angulo = angulo;
        this.direccion_sol = direccion_sol;
        this.fecha_registro = fecha_registro;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getTemperatura_ambiente() {
        return temperatura_ambiente;
    }

    public void setTemperatura_ambiente(int temperatura_ambiente) {
        this.temperatura_ambiente = temperatura_ambiente;
    }

    public String getIntensidad_solar() {
        return intensidad_solar;
    }

    public void setIntensidad_solar(String intensidad_solar) {
        this.intensidad_solar = intensidad_solar;
    }

    public String getDireccion_sol() {
        return direccion_sol;
    }

    public void setDireccion_sol(String direccion_sol) {
        this.direccion_sol = direccion_sol;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }



    
}
