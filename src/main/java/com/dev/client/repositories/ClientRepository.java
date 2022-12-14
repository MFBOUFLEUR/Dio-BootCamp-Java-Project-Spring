package com.dev.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
