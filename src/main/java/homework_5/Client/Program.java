package homework_5.Client;

import homework_5.MVP.Presenter;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new ConsoleView());
        presenter.readme();
        presenter.start();
    }
}
