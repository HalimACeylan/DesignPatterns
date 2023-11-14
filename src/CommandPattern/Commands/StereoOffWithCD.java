package CommandPattern.Commands;

import CommandPattern.Device.Stereo;

public class StereoOffWithCD implements Command{
    Stereo stereo;

    public StereoOffWithCD(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
