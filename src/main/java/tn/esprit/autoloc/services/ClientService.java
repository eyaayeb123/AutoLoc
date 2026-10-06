package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    ClientRepository clientRepo;

    @Override
    public Client AddClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public void DeleteClient(Client c) {
        clientRepo.delete(c);
    }

    @Override
    public Client updateAgence(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public List<Client> GetClients() {
        return clientRepo.findAll();
    }
}
