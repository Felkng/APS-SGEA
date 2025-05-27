package service;

import model.Evento;
import model.Inscricao;
import model.Usuario;
import subtypes.Endereco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventoService {
    private ArrayList<Evento> eventos;

    public EventoService() {
        this.eventos = new ArrayList<>();
    }

    public Boolean createEvento(String nome,
                                String descricao,
                                LocalDate data,
                                Endereco local,
                                Integer capacidade,
                                LocalDateTime periodoSubmissao){
        return eventos.add(new Evento(nome, descricao, data, local, capacidade, periodoSubmissao));
    }

    public Boolean addParticipante(Evento evento, Usuario participante) throws Exception {
        var tempoSubmissao = LocalDateTime.now();
        if(tempoSubmissao.isAfter(evento.getPeriodoSubmissao())) throw new Exception("Perído de submissão expirou!");
        return evento.getInscricoes().add(new Inscricao(
               tempoSubmissao, "INSCRITO", evento, participante
        ));
    }

    public ArrayList<Evento> getAllEventos(){
        return eventos;
    }
}
