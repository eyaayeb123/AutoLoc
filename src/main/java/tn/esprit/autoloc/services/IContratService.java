package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat AddContrat(Contrat c);
    void DeleteContrat(Contrat c);
    Contrat UpdateContrat(Contrat c);
    List<Contrat> GetContrats();
}
