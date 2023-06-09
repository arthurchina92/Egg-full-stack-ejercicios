/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ARTURO
 */
public class CuentaBancaria {
    private int numCuenta;
    private long DNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCuenta, long DNI, int saldoActual) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
