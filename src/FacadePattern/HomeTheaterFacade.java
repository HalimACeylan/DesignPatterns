package FacadePattern;
import FacadePattern.Device.*;
public class HomeTheaterFacade {
    Tv tv ;
    Light light;
    Stereo stereo;


    public HomeTheaterFacade(Tv tv, Light light, Stereo stereo) {
        this.tv = tv;
        this.light = light;
        this.stereo = stereo;
    }

    void watchMovie(){
        tv.on();
        light.off();
        stereo.on();
        stereo.setVolume(50);
    }
    void endMovie(){
        tv.off();
        light.on();
        stereo.setVolume(10);
    }
}
