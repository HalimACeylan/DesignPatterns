package CommandPattern.Commands;

import CommandPattern.Device.Stereo;

public class StereoOnWithCd implements Command{
    Stereo stereo;

    public StereoOnWithCd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
