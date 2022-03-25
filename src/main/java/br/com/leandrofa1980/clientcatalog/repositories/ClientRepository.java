package br.com.leandrofa1980.clientcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leandrofa1980.clientcatalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
