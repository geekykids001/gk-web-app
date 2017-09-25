package com.geekykids.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geekykids.model.Client;
import com.geekykids.repository.ClientRepository;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="/client")
public class ClientController extends AbstractController{

	@Autowired
	@Qualifier("clientRepository")
    private ClientRepository clientRepository;
	
    @GetMapping(path="/add")
    public @ResponseBody String create(@RequestParam Client client) {
    	clientRepository.save(client);
        return "Saved successfully.";
    }
    
    @GetMapping(path="/all2")
    public @ResponseBody Iterable<Client> getAll2() {
    	return clientRepository.findAll();
    }

    @GetMapping(path="/all")
    public @ResponseBody List<Client> getAll() {
    	List<Client> clients = new ArrayList<Client>();
    	Client c = new Client();
    	c.setName("test");
    	clients.add(c);
        return clients;
    }
}