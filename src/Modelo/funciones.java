
package Modelo;

public class funciones {
    private int IDH, temperaturaInterna;
    private String tiempoCoccion, tipoAlimento,estadoHorno, fechaOperacion, horaOperacion;

  
    public funciones(int IDH, int temperaturaInterna, String tiempoCoccion, String tipoAlimento, String estadoHorno, String fechaOperacion, String horaOperacion) {
        this.IDH = IDH;
        this.temperaturaInterna = temperaturaInterna;
        this.tiempoCoccion = tiempoCoccion;
        this.tipoAlimento = tipoAlimento;
        this.estadoHorno = estadoHorno;
        this.fechaOperacion = fechaOperacion;
        this.horaOperacion = horaOperacion;
    }

    public int getIDH() {
        return IDH;
    }

    public void setIDH(int IDH) {
        this.IDH = IDH;
    }
    
    public int getTemperaturaInterna() {
        return temperaturaInterna;
    }

    public void setTemperaturaInterna(int temperaturaInterna) {
        this.temperaturaInterna = temperaturaInterna;
    }

    public String getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(String tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getEstadoHorno() {
        return estadoHorno;
    }

    public void setEstadoHorno(String estadoHorno) {
        this.estadoHorno = estadoHorno;
    }

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getHoraOperacion() {
        return horaOperacion;
    }

    public void setHoraOperacion(String horaOperacion) {
        this.horaOperacion = horaOperacion;
    }

   
}
