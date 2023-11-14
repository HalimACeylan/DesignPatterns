package CommandPattern;

import CommandPattern.Commands.Command;
import CommandPattern.Commands.*;
import CommandPattern.Device.Light;
import CommandPattern.Device.Stereo;

public class RemoteControllerTest {

    public static void main(String[] args) {
        Light light = new Light();
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        Command command = new LightOnCommand(light);
        Command command1 = new StereoOnWithCd(stereo);
        remoteControl.setCommand(0,command,new LightOffCommand(light));
        remoteControl.setCommand(1,command1,new StereoOnWithCd(stereo));
        remoteControl.buttonClicked(0,true);
        remoteControl.buttonClicked(1,true);
        remoteControl.buttonClicked(0,false);
        remoteControl.undoButtonClicked();
    }
}
