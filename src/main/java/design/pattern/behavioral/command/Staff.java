package design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工类
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command c : commandList) {
            c.execute();
        }
        commandList.clear();
    }
}
