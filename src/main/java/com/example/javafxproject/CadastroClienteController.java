package com.example.javafxproject;

import com.example.javafxproject.cliente.Cliente;
import com.example.javafxproject.cliente.ClienteDao;

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

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = clienteDao.cadastrar(nome, email, telefone, aceitaPromocao);

        System.out.println(cliente.getId());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getAceitaPromocao());
    }
    
}
