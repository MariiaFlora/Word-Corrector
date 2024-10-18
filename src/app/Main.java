package app;

public class Main {

    public static void main(String[] args) {
        String output = new Corrector().handleData(new DataProvider().getData());
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
