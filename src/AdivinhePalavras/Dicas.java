package AdivinhePalavras;
import java.util.HashMap;
import java.util.Map;

public class Dicas {
    private static final Map<String, String> PALAVRAS_DICAS = new HashMap<>();

    static {
        PALAVRAS_DICAS.put("CACHORRO", "É um animal de estimação comum.");
        PALAVRAS_DICAS.put("AVIÃO", "É um meio de transporte aéreo.");
        PALAVRAS_DICAS.put("COMPUTADOR", "Usado para processamento de dados.");
        PALAVRAS_DICAS.put("UVA", "Uma fruta.");
        PALAVRAS_DICAS.put("MORANGO", "Uma fruta.");
        PALAVRAS_DICAS.put("ABACATE", "Uma fruta.");
        PALAVRAS_DICAS.put("LUCAS", "Um nome.");
        PALAVRAS_DICAS.put("TELEVISÃO", "Usado como entretenimento.");
        PALAVRAS_DICAS.put("PROGRAMADOR", "Quem fez isso?.");
        PALAVRAS_DICAS.put("FUTEBOL", "Um esporte famoso.");
        PALAVRAS_DICAS.put("PLANETA", "Onde vivemos?.");
        PALAVRAS_DICAS.put("JARDIM", "Tem muitas flores e passáros.");
        PALAVRAS_DICAS.put("INSTRUMENTO", "Usado para produzir sons.");
        PALAVRAS_DICAS.put("CIÊNCIA", "É o campo de estudo e pesquisa que busca entender o mundo natural e o universo.");
        PALAVRAS_DICAS.put("JANELA", "Tem em sua casa.");
        PALAVRAS_DICAS.put("FERRO", "é um minério.");
        PALAVRAS_DICAS.put("MEDITAÇÃO", "Usado para se acalmar.");
        PALAVRAS_DICAS.put("CINEMA", "Para ver filmes.");
        PALAVRAS_DICAS.put("FÓSSEIS", "São ossos.");
        PALAVRAS_DICAS.put("FESTIVAL", "Uma festa.");
        PALAVRAS_DICAS.put("MOTO", "Usado como trasporte.");
        PALAVRAS_DICAS.put("CARRO", "Usado como trasporte.");
        PALAVRAS_DICAS.put("MICROFONE", "Usado para transmitir sons.");
        PALAVRAS_DICAS.put("CHINELO", "Usa nos pés.");
        PALAVRAS_DICAS.put("JOANINHA", "Um inseto.");
        PALAVRAS_DICAS.put("JOGO", "Entretenimento");
    }

    public static String obterDica(String palavra) {
        return PALAVRAS_DICAS.getOrDefault(palavra, "Dica não disponível.");
    }
}
