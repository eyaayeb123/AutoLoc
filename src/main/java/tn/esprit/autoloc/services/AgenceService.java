package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;

@AllArgsConstructor
@Service
public class AgenceService implements IAgenceService {

    AgenceRepository agenceRepo;

    @Override
    public Agence AddAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public void DeleteAgence(Agence a) {
        agenceRepo.delete(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public List<Agence> GetAgences() {
        return agenceRepo.findAll();
    }
}
