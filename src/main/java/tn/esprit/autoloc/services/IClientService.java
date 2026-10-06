package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Client;
import java.util.List;

public interface IClientService {
    Client AddClient(Client c);
    void DeleteClient(Client c);
    Client updateAgence(Client c);
    List<Client> GetClients();
}
