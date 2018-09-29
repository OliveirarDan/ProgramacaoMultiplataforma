/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */


package com.example.danilo.filmesdb;

import java.io.Serializable;
import java.util.Date;

public class Filme implements Serializable{
    private int id;
    private String titulo, descricao, posterPath, diretor, foto;
    private double popularidade;
    private Date dataLacamento;

    private Genero genero;

    public Filme(int id, String titulo, String descricao, String posterPath, String diretor, double popularidade,String foto){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.posterPath = posterPath;
        this.diretor = diretor;
        this.popularidade = popularidade;
        this.foto = foto;

    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(double popularidade) {
        this.popularidade = popularidade;
    }

    public Date getDataLacamento() {
        return dataLacamento;
    }

    public void setDataLacamento(Date dataLacamento) {
        this.dataLacamento = dataLacamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", posterPath='" + posterPath + '\'' +
                ", diretor='" + diretor + '\'' +
                ", foto='" + foto + '\'' +
                ", popularidade=" + popularidade +
                ", dataLacamento=" + dataLacamento +
                ", genero=" + genero.toString() +
                '}';
    }
}
