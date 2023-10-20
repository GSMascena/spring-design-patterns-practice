package gsm.springdesignpatterns.service;

import gsm.springdesignpatterns.model.Client;

public interface ClientService {
    Iterable<Client> findAll();
    Client findById(Long id);
    void put(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
