public class App implements IApp {
    public static void main(String[] args) {
        ConsoleLogIt logger = new ConsoleLogIt();

        logger.logInfo("hello, world!");
    }
}