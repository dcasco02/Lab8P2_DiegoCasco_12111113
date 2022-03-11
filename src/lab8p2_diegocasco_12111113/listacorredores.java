/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco_12111113;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class listacorredores {
    private ArrayList <Corredor> listacorredores=new ArrayList();
    private File Corredores = null;

    public listacorredores (String path){
        Corredores=new File(path);
    }
    
    public ArrayList<Corredor> getListacorredores() {
        return listacorredores;
    }

    public void setListacorredores(ArrayList<Corredor> listacorredores) {
        this.listacorredores = listacorredores;
    }

    public File getCorredores() {
        return Corredores;
    }

    public void setCorredores(File Corredores) {
        this.Corredores = Corredores;
    }
    public void setCorredores(Corredor c){
        listacorredores.add(c);
    }

    @Override
    public String toString() {
        return "listacorredores=" + listacorredores;
    }
    public void cargarArchivo() {
        try {            
            listacorredores = new ArrayList();
            Corredor temp;
            if (Corredores.exists()) {
                FileInputStream entrada
                    = new FileInputStream(Corredores);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Corredor) objeto.readObject()) != null) {
                        listacorredores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(Corredores);
            bw = new ObjectOutputStream(fw);
            for (Corredor t : listacorredores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
