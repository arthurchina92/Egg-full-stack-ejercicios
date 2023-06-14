/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author ARTURO
 */
public class CuentaServicios {

    CuentaBancaria cuentaBancaria = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    int saldoActual;
    int retiro;

    public void menuServicios() {
        int opcion;
        boolean cuenta = false;

        do {
            System.out.println("Bienvenido al menu principal, elija una opcion");
            System.out.println("[1] Crear una cuenta bancaria");
            System.out.println("[2] Hacer un deposito");
            System.out.println("[3] Realizar un retiro");
            System.out.println("[4] Realizar una extraccion rapida");
            System.out.println("[5] Consultar su saldo");
            System.out.println("[6] Consultar sus datos");
            System.out.println("[7] Salir del programa");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    cuenta = true;
                    break;
                case 2:
                    if (cuenta == false) {
                        System.out.println("Lo sentimos usted aun no dispone de una cuenta bancaria");
                        break;
                    } else {
                        ingresarSaldo();
                        break;
                    }

                case 3:
                    retirar();
                    break;
                case 4:
                    if (cuenta == false) {
                        System.out.println("Usted no ha creado una cuenta aun, por favor cree una cuenta antes"
                                + "de comenzar");
                    } else {
                        extraccionRapida();
                        break;
                    }
                case 5:
                    if (cuenta == false) {
                        System.out.println("Usted no ha creado una cuenta aun, por favor cree una cuenta antes"
                                + "de comenzar");
                    } else {
                        consultarSaldo();
                        break;
                    }
                case 6:
                    if (cuenta == false) {
                        System.out.println("Usted no ha creado una cuenta aun, por favor cree una cuenta antes"
                                + "de comenzar");
                    } else {
                        toString();
                        break;
                    }
                case 7:
                    System.out.println("Gracias por haber utilizado nuestros servicios, hasta luego...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta otra vez por favor");
                    break;
            }
        } while (opcion != 7);

    }

    public void crearCuenta() {
        System.out.println("Bienvenido a Banco Tech, el mejor banco del mundo");
        System.out.println("Ingrese un numero que será su número de cuenta");
        int numCuenta = leer.nextInt();

        cuentaBancaria.setNumCuenta(numCuenta);
        System.out.println("Ingrese el DNI del usuario");
        long DNI = leer.nextLong();
        cuentaBancaria.setDNI(DNI);
        System.out.println("Gracias por confiar en nosotros, "
                + "su cuenta ha sido creada, "
                + "ahora puede utilizar todos los servicios de Banco Tec");

    }

    public String toString() {
        System.out.println("Los datos de su cuenta bancaria son:" + cuentaBancaria.toString());
        return cuentaBancaria.toString();
    }

    public void ingresarSaldo() {
        //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        //y se la sumara a saldo actual.
        System.out.println("Ingrese la cantidad que desea depositar ");
        int deposito = leer.nextInt();
        cuentaBancaria.setSaldoActual(saldoActual + deposito);
        saldoActual = cuentaBancaria.getSaldoActual();
        System.out.println("Excelente, su depósito se ha realizado correctamente");
        System.out.println("Su saldo es de: $ "+ saldoActual);
    }

    public void retirar() {
        /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
        System.out.println("Ingrese una cantidad a retirar");
        int retiro = leer.nextInt();
        if (saldoActual < retiro) {
            System.out.println("Usted no cuenta con fondos suficientes, su saldo es: "
                    + " $ " + saldoActual);
        } else {
            cuentaBancaria.setSaldoActual(saldoActual - retiro);
            saldoActual = cuentaBancaria.getSaldoActual();
            System.out.println("Su retiro ha sido exitoso, su saldo actual es: " + saldoActual);
        }
        

    }

    public void extraccionRapida() {
        int rapida = (int) (saldoActual * .20);
        cuentaBancaria.setSaldoActual(saldoActual - rapida);
        saldoActual = cuentaBancaria.getSaldoActual();
        System.out.println("Su retiro ha sido exitoso, su saldo actual es: " + " $ "
                + saldoActual);
    }

    public void consultarSaldo() {
        int consultaSaldo = cuentaBancaria.getSaldoActual();
        System.out.println("Tu saldo es de: $ " + consultaSaldo);
    }
}
