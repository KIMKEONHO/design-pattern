package command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command stereoOnWithCd = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, garageDoorOpen, new NoCommand());
        remoteControl.setCommand(2, stereoOnWithCd, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        Command[] partyOn = {livingRoomLightOn, stereoOnWithCd};
        Command[] partyOff = {livingRoomLightOff, stereoOff};
        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        System.out.println("\n--- Macro ON ---");
        partyOnMacro.execute();
        System.out.println("\n--- Macro OFF ---");
        partyOffMacro.execute();
        System.out.println("\n--- Macro UNDO ---");
        partyOffMacro.undo();
    }
}
