package app.threads;

import app.App;

public class O extends Thread {
    public void run() {
        for(int i = 0; i < App.textoChars.size(); i++) {
            if(App.textoChars.get(i) == 'o') {
                App.oCounter++;
            }
        }
        System.out.println("todas las o han sido contadas: " + App.oCounter);
    }
}
