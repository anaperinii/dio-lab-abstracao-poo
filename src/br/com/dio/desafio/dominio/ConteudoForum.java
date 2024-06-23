package br.com.dio.desafio.dominio;

public class ConteudoForum {
    private String titulo;
    private String descricao;

    public ConteudoForum(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "ConteudoForum (" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ')';
    }
}
