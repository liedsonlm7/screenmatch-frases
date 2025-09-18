package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.PhraseDTO;
import br.com.alura.screenmatch_frases.model.Phrase;
import br.com.alura.screenmatch_frases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    private PhraseRepository repository;

    public PhraseDTO getRandomPhrase() {
        Phrase phrase = repository.findById(4L).get();
        return new PhraseDTO(phrase.getTitulo(), phrase.getFrase(), phrase.getPersonagem(), phrase.getPoster());
    }
}
