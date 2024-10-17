package app.threads;

import app.App;

public class I extends Thread {
    public void run() {
        for(int i = 0; i < App.textoChars.size(); i++) {
            if(App.textoChars.get(i) == 'i') {
                App.iCounter++;
            }
        }
        System.out.println("todas las i han sido contadas: " + App.iCounter);
    }
}
