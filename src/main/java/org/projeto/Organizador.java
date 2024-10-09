package org.projeto;

public class Organizador {
    EventoCSV e = new EventoCSV();
    private Evento[] eventos = new Evento[10];
    int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public boolean cadastrar(String nome, String data, String local, int capacidade) {
        for (int i = 0; i < quantidade; i++) {
            if(eventos[i].getNome().equals(nome)){
                System.out.println("Já existe um evento com esse nome");
                return false;
            }
        }
        Evento evento = new Evento(nome, data, local, capacidade);
        if (quantidade>=10){
            System.out.println("Erro ao cadastrar evento");
            return false;
        }
        eventos[quantidade] = evento;
        quantidade++;
        e.adicionarEventoAoCSV(evento);
        return true;
    }

    public boolean excluir(String nome) {
        if (quantidade<=0){
            System.out.println("Erro ao excluir evento");
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (eventos[i].getNome().equals(nome)) {
                for (int j = i; j < quantidade - 1; j++) {
                    eventos[j] = eventos[j + 1];
                }
                quantidade--;
                eventos[quantidade] = null;
                System.out.println("Evento excluido com sucesso");
                return true;
            }
        }
        System.out.println("Evento nao encontrado");
        return false;
    }

    public boolean seInscrever(String nome){
        if (quantidade<=0){
            System.out.println("Erro ao se inscrever no evento");
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (eventos[i].getNome().equals(nome)) {
                if (eventos[i].getVagasDisponiveis() > 0) {
                    System.out.println("Inscrição realizada com sucesso");
                    eventos[i].setVagasDisponiveis(eventos[i].getVagasDisponiveis() - 1);
                    return true;
                }
                System.out.println("Evento lotado");
                return false;
            }
        }
        return false;
    }

    public String buscar(String nome) {
        if (quantidade<=0){
            System.out.println("Erro ao buscar evento");

        }
        for (int i = 0; i < quantidade; i++) {
            if(eventos[i].getNome().equals(nome)){
                return eventos[i].getNome() + " - " + eventos[i].getData() + " - " + eventos[i].getLocal() + " - " + eventos[i].getVagasDisponiveis();
            }
        }
        return "0";
    }

    public boolean listar() {
        if (quantidade<=0){
            System.out.println("Não há eventos para listar");
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (eventos[i] == null) {
                return false;
            }
            System.out.println("Nome: " + eventos[i].getNome() + " Data: " + eventos[i].getData() + " Local: " + eventos[i].getLocal() + " Vagas: " + eventos[i].getVagasDisponiveis());

        }
        return true;
    }


}
