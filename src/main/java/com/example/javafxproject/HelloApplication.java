package com.example.javafxproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);

        Label lblMensagem = new Label("...");
        Button btnVerMensagem = new Button("Ver mensagem");

        btnVerMensagem.setOnAction((e) -> {
            lblMensagem.setText("Olá mundo!!!");
        });

        vBox.getChildren().setAll(lblMensagem, btnVerMensagem);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("Aplicação");
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}