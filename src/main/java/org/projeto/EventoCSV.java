package org.projeto;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.Integer.parseInt;

public class EventoCSV {
    private String nomeArquivo = "./Eventos.csv";

    public void adicionarEventoAoCSV(Evento e){
        try{
            boolean arquivoExiste = new File(nomeArquivo).exists();

            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, arquivoExiste);
            if (!arquivoExiste) {
                escritor.write("Nome;Data;Local;Vagas\n");
            }

            escritor.write(e.getNome() + ";" + e.getData() + ";" + e.getLocal() + ";" + e.getVagasDisponiveis() + "\n");

            // escrever todos os dados imediatamente
            escritor.flush();

            escritor.close();
        } catch (IOException IOE){
            IOE.printStackTrace();
        }

    }
    public int importarCSV(Evento[] eventos, int quantidade){
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                String[] partes = linha.split(";");

                String nome = partes[0];
                String data = partes[1];
                String local = partes[2];
                int vagas = parseInt(partes[3]);

                Evento evento = new Evento(nome, data, local, vagas);

                if (quantidade >= 10) {
                    System.out.println("Erro ao cadastrar evento");
                    break;
                }

                // Adiciona o novo evento ao array
                eventos[quantidade] = evento;
                quantidade++;

            }
            leitor.close();
        return quantidade;

        } catch (IOException IOE) {
            IOE.printStackTrace();
            return 0;
        }
    }
}
