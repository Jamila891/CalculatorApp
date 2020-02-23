
import javafx.application.Application;
import javafx.stage.Stage;

public class ExecuteCalculator extends Application {
	
	private CalculatorView view;
	private CalculatorController controller;
	private CalculatorModel model;

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	model = new CalculatorModel();
	controller = new CalculatorController(model, view);
	view = new CalculatorView(primaryStage, model, controller);
	view.start();
	}
}
