/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */


package com.example.danilo.filmesdb;

public class FilmeDAO {
    private static Filme[] filmes;

    public FilmeDAO(){

    }


    public static Filme[] getFilmes(){
        if(filmes == null){
            filmes = new Filme[4];
            filmes[0] = new Filme(1,"De volta para o futuro","Filme muito legal","caminho foto","Robert Zemeckis", 10, "devoltaparaofuturo");
            filmes[1] = new Filme(2,"Poderoso chefão","Filme muito legal ","caminho foto","Francis Ford Coppola", 8.5, "poderosochefao");
            filmes[2] = new Filme(3,"MIB","Filme muito legal","caminho foto","Barry Sonnenfeld", 7.8,"mib");
            filmes[3] = new Filme(4,"Velozes e Furiosos","Brian O'Conner é um policial que se infiltra no submundo dos rachas de rua para investigar uma série de furtos. Enquanto tenta ganhar o respeito e a confiança do líder Dom Toretto, ele corre o risco de ser desmascarado ","caminho foto","Rob Cohen", 9.4,"velozesefuriosos");

        }

        return filmes;
    }



}
