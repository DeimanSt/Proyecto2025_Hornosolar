package Modelo;

import java.util.*;

public class mantenimiento {
   protected int idh;
   protected String detalles_reparacion, materiales_reemplazados;
   protected Date fecha_creacion;

    public mantenimiento(int idh, String detalles_reparacion, String materiales_reemplazados, Date fecha_creacion) {
        this.idh = idh;
        this.detalles_reparacion = detalles_reparacion;
        this.materiales_reemplazados = materiales_reemplazados;
        this.fecha_creacion = fecha_creacion;
    }

    public int getIdh() {
        return idh;
    }

    public void setIdh(int idh) {
        this.idh = idh;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
   
}
