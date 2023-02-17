/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author alex diaz
 */
public class Archivo {

    public void escritura(String s) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter("Historial.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(s);
            bw.write("\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public String leer() {
        String datos = "", salida = "";
        try {
            FileReader archivo = new FileReader("Historial.txt");
            BufferedReader flujo = new BufferedReader(archivo);
            while ((salida = flujo.readLine()) != null) {
                datos += salida + "\n";
            }
        } catch (Exception e) {
            System.out.println("no se puede leer por error:" + e.getMessage());
        }
        return datos;
    }

    public void borrartodo() {
        try {

            BufferedWriter flujo = new BufferedWriter(new FileWriter("Historial.txt"));//);//enlace para poder escrivir en el archivo

            flujo.write("");
            flujo.close();

        } catch (Exception e) {//captura error en caso de no haber archivo
            System.out.println("no se puede escribir por error:" + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
