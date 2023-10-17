package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class CadastroClienteController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private CheckBox ckbPromocao;
    
    public void onActionCadastrar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        Boolean aceitaPromocao = ckbPromocao.isSelected();

        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(aceitaPromocao);
    }
    
}
