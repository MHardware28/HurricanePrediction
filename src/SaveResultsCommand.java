public class SaveResultsCommand implements HurricaneCommand {
    private ResultSaver results;

    public SaveResultsCommand(ResultSaver results) {
        this.results = results;
    }

    @Override
    // Triggers the save results command
    public void execute() {
        results.saveResults();
    }
}
