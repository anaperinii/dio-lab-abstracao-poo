package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ConteudoForum> conteudos = new ArrayList<>();
    
    public void postarConteudo(ConteudoForum conteudo) {
        conteudos.add(conteudo);
    }

    public List<ConteudoForum> getConteudos() {
        return conteudos;
    }

    public void exibirConteudos() {
        System.out.println("Conteúdos no Fórum:");
        for (ConteudoForum conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }
}
