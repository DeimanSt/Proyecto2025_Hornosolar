package Modelo;

public class mantenimiento {
   private int IDH;
   private String detalles_reparacion, materiales_reemplazados, fecha_creacion;

    public mantenimiento(int IDH, String detalles_reparacion, String materiales_reemplazados, String fecha_creacion) {
        this.IDH = IDH;
        this.detalles_reparacion = detalles_reparacion;
        this.materiales_reemplazados = materiales_reemplazados;
        this.fecha_creacion = fecha_creacion;
    }

    public int getIDH() {
        return IDH;
    }

    public void setIDH(int IDH) {
        this.IDH = IDH;
    }

    public String getDetalles_reparacion() {
        return detalles_reparacion;
    }

    public void setDetalles_reparacion(String detalles_reparacion) {
        this.detalles_reparacion = detalles_reparacion;
    }

    public String getMateriales_reemplazados() {
        return materiales_reemplazados;
    }

    public void setMateriales_reemplazados(String materiales_reemplazados) {
        this.materiales_reemplazados = materiales_reemplazados;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

   
}
