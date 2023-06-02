/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ARTURO
 */
public class Mes {
    private String [] mes = new String [12];
    private int numSecreto;

    public Mes() {
        mes[0]="enero";
        mes[1]="febrero";
        mes[2]="marzo";
        mes[3]="abril";
        mes[4]="mayo";
        mes[5]="junio";
        mes[6]="julio";
        mes[7]="agosto";
        mes[8]="septiembre";
        mes[9]="octubre";
        mes[10]="noviembre";
        mes[11]="diciembre"; 
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    @Override
    public String toString() {
        return "Mes{" + "mes=" + mes + ", numSecreto=" + numSecreto + '}';
    }
    
    
    
}
