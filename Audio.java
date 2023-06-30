
import java.applet.AudioClip;

public class Audio {
    public void PonerAudio() {
        AudioClip Musica;
        Musica = java.applet.Applet.newAudioClip(getClass().getResource("Music/Sweden.wav"));
        Musica.loop();
    }
}