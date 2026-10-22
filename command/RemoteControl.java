package command;

public class RemoteControl {
    private static final int SLOT_COUNT = 3;

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_COUNT];
        offCommands = new Command[SLOT_COUNT];
        Command noCommand = new NoCommand();

        for (int i = 0; i < SLOT_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            result.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("    ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append('\n');
        }
        return result.toString();
    }
}
