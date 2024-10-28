package app.threads;
import app.App;

public class E extends Thread{
    public void run() {
        for(int i = 0; i < App.textoChars.size(); i++) {
            if(App.textoChars.get(i) == 'e') {
                App.vocalesTotal++;
            }
        }
    }
}
