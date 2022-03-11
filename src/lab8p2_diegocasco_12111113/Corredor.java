/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco_12111113;
import java.awt.Color;
/**
 *
 * @author dcasc
 */
public class Corredor {
    private String nombreCorredor;
    private String Identificador;
    private String tipoauto;
    private Color Color;
    private int distanciarecorrida;
    
    public Corredor() {
    }

    public Corredor(String nombreCorredor, String Identificador, String tipoauto, Color Color, int distanciarecorrida) {
        this.nombreCorredor = nombreCorredor;
        this.Identificador = Identificador;
        this.tipoauto = tipoauto;
        this.Color = Color;
        this.distanciarecorrida = 0;
    }

    
    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }


    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getTipoauto() {
        return tipoauto;
    }

    public void setTipoauto(String tipoauto) {
        this.tipoauto = tipoauto;
    }


    public int getDistanciarecorrida() {
        return distanciarecorrida;
    }

    public void setDistanciarecorrida(int distanciarecorrida) {
        this.distanciarecorrida = distanciarecorrida;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombreCorredor=" + nombreCorredor + ", Identificador=" + Identificador + ", tipoauto=" + tipoauto + ", Color=" + Color + ", distanciarecorrida=" + distanciarecorrida + '}';
    }
    
}
