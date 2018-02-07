package examen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {
    static ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();
    static String archivo = "asd.csv";

    public static void agregar(Cuenta cuenta) {
        listaCuenta.add(cuenta);
    }
    
    public static Cuenta buscarCuentaAhorro() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaAhorro cuentaAH = new CuentaAhorro(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
    public  Cuenta buscarCuentaHipoteca() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaHipoteca cuentaAH = new CuentaHipoteca(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
    public  void presentar(){
        String linea = "";
        for (Cuenta cuenta : listaCuenta) {
            linea = linea +cuenta.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null, linea);
    }

   
}
