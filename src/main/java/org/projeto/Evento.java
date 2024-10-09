package org.projeto;

public class Evento {
    private String local;
    private String data;
    private int MAX_DE_PARTICIPANTES;
    private int vagasDisponiveis;
    private String nome;
    private String tipoIngresso;

    Evento(){}

    Evento(String local, String data, String nome, String tipoIngresso, int MAX_DE_PARTICIPANTES) {
        this.local = local;
        this.data = data;
        this.nome = nome;
        this.tipoIngresso = tipoIngresso;
        this.MAX_DE_PARTICIPANTES = MAX_DE_PARTICIPANTES;
        this.vagasDisponiveis = MAX_DE_PARTICIPANTES;
    }
    public Evento(String nome, String data, String local, int MAX_DE_PARTICIPANTES) {
        this.local = local;
        this.data = data;
        this.nome = nome;
        this.MAX_DE_PARTICIPANTES = MAX_DE_PARTICIPANTES;
        this.vagasDisponiveis = MAX_DE_PARTICIPANTES;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public int getMAX_DE_PARTICIPANTES() {
        return this.MAX_DE_PARTICIPANTES;
    }
    public void setMAX_DE_PARTICIPANTES(int MAX_DE_PARTICIPANTES) {
        this.MAX_DE_PARTICIPANTES = MAX_DE_PARTICIPANTES;
    }
    public int getVagasDisponiveis() {
        return this.vagasDisponiveis;
    }
    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoIngresso() {
        return this.tipoIngresso;
    }
    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
    public String getLocal() {
        return this.local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

}
