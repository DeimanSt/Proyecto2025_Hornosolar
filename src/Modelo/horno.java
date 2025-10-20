package Modelo;

public class horno {
    private int reflectores;
    private String tipo, materiales, sistema_aislamiento, fecha;
    private double dimensiones;

    public horno(int reflectores, String tipo, String materiales, String sistema_aislamiento, String fecha, double dimensiones) {
        this.reflectores = reflectores;
        this.tipo = tipo;
        this.materiales = materiales;
        this.sistema_aislamiento = sistema_aislamiento;
        this.fecha = fecha;
        this.dimensiones = dimensiones;
    }
    
    public int getReflectores() {
        return reflectores;
    }

    public void setReflectores(int reflectores) {
        this.reflectores = reflectores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getSistema_aislamiento() {
        return sistema_aislamiento;
    }

    public void setSistema_aislamiento(String sistema_aislamiento) {
        this.sistema_aislamiento = sistema_aislamiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
