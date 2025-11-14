import java.util.List;
import java.util.ArrayList;

public class PredictionInvoker{
    // Holds all the commands to be executed
    private List<HurricaneCommand> commands;

    public PredictionInvoker() {
        // Initialize the command list
        commands = new ArrayList<>();
    }
    // Adds a command to the list
    public void addCommand(HurricaneCommand command){
        commands.add(command);
    }
    // Executes all stored commands
    public void executeCommands(){
        for(HurricaneCommand command : commands){
            command.execute();
        }
    }
}


