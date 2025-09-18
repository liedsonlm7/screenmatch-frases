package br.com.alura.screenmatch_frases.controller;

import br.com.alura.screenmatch_frases.dto.PhraseDTO;
import br.com.alura.screenmatch_frases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    @Autowired
    private PhraseService service;

    @GetMapping("/series/frases")
    public PhraseDTO getRandomPhrase() {
        return service.getRandomPhrase();
    }
}
