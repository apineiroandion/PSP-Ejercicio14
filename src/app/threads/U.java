package app.threads;

public class U extends Thread {
    public void run() {
        for(int i = 0; i < app.App.textoChars.size(); i++) {
            if(app.App.textoChars.get(i) == 'u') {
                app.App.vocalesTotal++;
            }
        }
    }
}
