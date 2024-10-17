package app.readers;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    FileOutputStream fos;
    BufferedOutputStream bos;
    FileInputStream fis;
    BufferedInputStream bis;

    public FileOutputStream getFos(String ruta) {
        try {
            return new FileOutputStream(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        return null;
    }

    public FileInputStream getFis(String ruta) {
        try {
            return new FileInputStream(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        return null;
    }

    public void closeFos() {
        try {
            fos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo");
        }
    }

    public void closeFis() {
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo");
        }
    }

    public BufferedOutputStream getBos(FileOutputStream fos) {
        return new BufferedOutputStream(fos);
    }

    public BufferedInputStream getBis(FileInputStream fis) {
        return new BufferedInputStream(fis);
    }

    public void closeBos() {
        try {
            bos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo");
        }
    }

    public void closeBis() {
        try {
            bis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo");
        }
    }

    public ArrayList<Character> read(BufferedInputStream bis){
        ArrayList<Character> lista = new ArrayList<>();
        try {
            int c;
            while ((c = bis.read()) != -1) {
                lista.add((char) c);
            }
            System.out.println("Archivo leido");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return lista;
    }
}
