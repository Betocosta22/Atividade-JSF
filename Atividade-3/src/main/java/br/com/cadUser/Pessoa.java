package br.com.cadUser;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private ArrayList<String> nomesArmazenados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomesArmazenados() {
        return nomesArmazenados;
    }

    public void adicionarNome() {
        if (nomesArmazenados == null) {
            nomesArmazenados = new ArrayList<>();
        }
        nomesArmazenados.add(nome);
        nome = ""; // Limpa o campo de entrada após adicionar o nome
    }
}
