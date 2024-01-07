package FacadePattern;

import FacadePattern.Device.Light;
import FacadePattern.Device.Stereo;
import FacadePattern.Device.Tv;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Tv(),new Light(),new Stereo());
        homeTheaterFacade.watchMovie();
        System.out.println("Movie has been ended ");
        homeTheaterFacade.endMovie();
    }
}
