package Modelo;


public class ambiente {
    private int angulo, temperatura_ambiente;
    private String intensidad_solar, direccion_sol, fecha_registro;

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
