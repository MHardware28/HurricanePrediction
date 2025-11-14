public class FetchDataCommand implements HurricaneCommand {
    private WeatherDataFetcher fetcher;

    public FetchDataCommand(WeatherDataFetcher fetcher) {
        this.fetcher = fetcher;
    }

    @Override
    //Triggers the fetch data command
    public void execute() {
        fetcher.fetchData();
    }
}
