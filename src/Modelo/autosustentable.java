
package Modelo;

public class autosustentable {
    private int idf,consumo_energetico, energia_almacenada;
    private String energia_solar_recibida;
    private double eficiencia_energetica;
    private String fecha_evaluacion;

    public autosustentable(int idf, int consumo_energetico, int energia_almacenada, String energia_solar_recibida, double eficiencia_energetica, String fecha_evaluacion) {
        this.idf = idf;
        this.consumo_energetico = consumo_energetico;
        this.energia_almacenada = energia_almacenada;
        this.energia_solar_recibida = energia_solar_recibida;
        this.eficiencia_energetica = eficiencia_energetica;
        this.fecha_evaluacion = fecha_evaluacion;
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public int getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(int consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getEnergia_almacenada() {
        return energia_almacenada;
    }

    public void setEnergia_almacenada(int energia_almacenada) {
        this.energia_almacenada = energia_almacenada;
    }

    public String getEnergia_solar_recibida() {
        return energia_solar_recibida;
    }

    public void setEnergia_solar_recibida(String energia_solar_recibida) {
        this.energia_solar_recibida = energia_solar_recibida;
    }

    public double getEficiencia_energetica() {
        return eficiencia_energetica;
    }

    public void setEficiencia_energetica(double eficiencia_energetica) {
        this.eficiencia_energetica = eficiencia_energetica;
    }

    public String getFecha_evaluacion() {
        return fecha_evaluacion;
    }

    public void setFecha_evaluacion(String fecha_evaluacion) {
        this.fecha_evaluacion = fecha_evaluacion;
    }

    
}
