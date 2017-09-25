package com.geekykids.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geekykids.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>  
{
}
