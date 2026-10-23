package com.seduc2.crudfy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artista {
    @Id
    private int id;
    private String nome;
    private String biografia;
    private Genero estiloMusical;

    public Artista(){}
    public Artista(int id, String nome, String biografia, Genero estiloMusical) {
        this.id = id;
        this.nome = nome;
        this.biografia = biografia;
        this.estiloMusical = estiloMusical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Genero getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(Genero estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
