package app;

import app.readers.Reader;
import app.threads.*;

import java.util.ArrayList;

public class App {
    public static final String RUTA = "/home/dam/Desktop/Ejercicio14/texto.txt";
    public static ArrayList<Character> textoChars = new ArrayList<>();
    public static Integer vocalesTotal = 0;

    public static void main(String[] args) {
        Reader reader = new Reader();
        textoChars = reader.read(reader.getBis(reader.getFis(RUTA)));

        A a = new A();
        E e = new E();
        I i = new I();
        O o = new O();
        U u = new U();

        a.start();
        e.start();
        i.start();
        o.start();
        u.start();

        try {
            a.join();
            e.join();
            i.join();
            o.join();
            u.join();
            System.out.println("Vocales totales: " + vocalesTotal);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
