package Facade;

import Facade.Device.Light;
import Facade.Device.Stereo;
import Facade.Device.Tv;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Tv(),new Light(),new Stereo());
        homeTheaterFacade.watchMovie();
        System.out.println("Movie has been ended ");
        homeTheaterFacade.endMovie();
    }
}
