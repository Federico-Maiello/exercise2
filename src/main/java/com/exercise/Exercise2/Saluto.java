package com.exercise.Exercise2;

public class Saluto {
    String nome;
    String provincia;
    String saluto;
    public Saluto(String nome, String provincia, String saluto){
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    @Override
    public String toString() {
        return "Saluto{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saluto='" + saluto + '\'' +
                '}';
    }
}
