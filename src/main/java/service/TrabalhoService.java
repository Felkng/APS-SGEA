package service;

import model.Avaliacao;
import model.Certificado;
import model.Trabalho;
import model.Usuario;

import java.net.URI;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class TrabalhoService {
    private ArrayList<Trabalho> trabalhos;

    public TrabalhoService() {
        this.trabalhos = new ArrayList<>();
    }

    public Boolean createTrabalho(URI arquivo,
                                  String titulo,
                                  String tipo,
                                  ArrayList<Usuario> autores){
        return trabalhos.add(new Trabalho(titulo, tipo, tipo, arquivo, autores));
    }

    public Optional<Trabalho> getTrabalhoById(UUID id){
        return trabalhos.stream().filter(t -> t.getIdTrabalho().equals(id)).findFirst();
    }


//    public Optional<Trabalho> updateTrabalhoById(UUID id,
//                                                 URI arquivo,
//                                                 String titulo,
//                                                 String tipo,
//                                                 ArrayList<Usuario> autores){
//        var trabalhoOptional = trabalhos.stream().filter(t -> t.getIdTrabalho().equals(id)).findFirst();
//        if(trabalhoOptional.isEmpty()) return Optional.empty();
//        var trabalho = trabalhoOptional.get();
//            trabalho.setArquivo(arquivo);
//            trabalho.setAutores(autores);
//            trabalho.setTipo(tipo);
//            trabalho.setTitulo(titulo);
//        return Optional.of(trabalho);
//    }
//
}
