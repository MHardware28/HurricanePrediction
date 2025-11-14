public class PredictionCommand implements HurricaneCommand {
    private PredictionModel predicts;

    public PredictionCommand(PredictionModel predicts) {
        this.predicts = predicts;
    }

    @Override
    // Triggers the prediction model
    public void execute() {
        predicts.applyPredictionModel();
    }
}


