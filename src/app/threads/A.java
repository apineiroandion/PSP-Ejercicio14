package app.threads;

import app.App;

public class A extends Thread {
    public void run() {
        for(int i = 0; i < App.textoChars.size(); i++) {
            if(App.textoChars.get(i) == 'a') {
                App.aCounter++;
            }
        }
        System.out.println("todas las a han sido contadas: " + App.aCounter);
    }
}
