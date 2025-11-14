abstract class HurricanePredictionTemplate {

    // Template method defining the prediction steps
    public final void predictionHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();
    }

    // Steps to be implemented by subclasses
    abstract void fetchData();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();
}
