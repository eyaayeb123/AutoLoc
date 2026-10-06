package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence AddAgence(Agence a);
    void DeleteAgence(Agence a);
    Agence updateAgence(Agence a);
    List<Agence> GetAgences();
}
