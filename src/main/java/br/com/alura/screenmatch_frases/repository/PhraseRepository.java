package br.com.alura.screenmatch_frases.repository;

import br.com.alura.screenmatch_frases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
}
