package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Equipamento implements Serializable {

    private Integer tag;
    private String nome;
    private String tensao;
    private String potencia;
    private String corrente;
    private String unidade;

    public Equipamento(Integer tag, String nome, String tensao, String potencia, String corrente, String unidade) {
        this.tag = tag;
        this.nome = nome;
        this.tensao = tensao;
        this.potencia = potencia;
        this.corrente = corrente;
        this.unidade = unidade;
    }

    public Equipamento() {
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCorrente() {
        return corrente;
    }

    public void setCorrente(String corrente) {
        this.corrente = corrente;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "tag=" + tag +
                ", nome='" + nome + '\'' +
                ", tensao='" + tensao + '\'' +
                ", potencia='" + potencia + '\'' +
                ", corrente='" + corrente + '\'' +
                ", unidade='" + unidade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipamento that = (Equipamento) o;
        return Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
}

