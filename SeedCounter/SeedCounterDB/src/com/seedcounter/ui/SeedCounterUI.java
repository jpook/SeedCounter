package com.seedcounter.ui;

import com.seedcounter.db.entities.Seedbag;
import com.seedcounter.presenter.Presenter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SeedCounterUI extends Application {

	Presenter presenter;
	TableView tableView;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		presenter = new Presenter();
		primaryStage.setTitle("SeedCounter");
		Button btnCreate = new Button();
		btnCreate.setText("create new Seeedbag");
		btnCreate.setOnAction(event -> presenter.doSomething());
		VBox root = new VBox();
		
		instantiateTableView();
		
		root.getChildren().addAll(btnCreate, tableView);
		primaryStage.setScene(new Scene(root, 800, 500));
		primaryStage.show();
		
	}
	
	private void instantiateTableView() {
		/*
		 * create columns
		 */
		tableView = new TableView();
		TableColumn idColumn = new TableColumn("ID");
		TableColumn idtColumn = new TableColumn("Idt");
		TableColumn nameColumn = new TableColumn("Name");
		tableView.getColumns().addAll(idColumn, idtColumn, nameColumn);
		
		/*
		 * assign attributes from object to columns
		 */
		idColumn.setCellValueFactory(new PropertyValueFactory<Seedbag,Long>("id"));
		idtColumn.setCellValueFactory(new PropertyValueFactory<Seedbag,String>("idt"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<Seedbag, String>("name"));
	}

}
