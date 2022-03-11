/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco_12111113;

/**
 *
 * @author dcasc
 */
public class Corredor {
    private String nombreCorredor;
    private int Identificador;
    private String tipoauto;
    private String Color;
    private int distanciarecorrida;
    
    public Corredor() {
    }

    public Corredor(String nombreCorredor, int Identificador, String tipoauto, String Color, int distanciarecorrida) {
        this.nombreCorredor = nombreCorredor;
        this.Identificador = Identificador;
        this.tipoauto = tipoauto;
        this.Color = Color;
        this.distanciarecorrida = 0;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getTipoauto() {
        return tipoauto;
    }

    public void setTipoauto(String tipoauto) {
        this.tipoauto = tipoauto;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getDistanciarecorrida() {
        return distanciarecorrida;
    }

    public void setDistanciarecorrida(int distanciarecorrida) {
        this.distanciarecorrida = distanciarecorrida;
    }

    @Override
    public String toString() {
        return  nombreCorredor;
    }
}
