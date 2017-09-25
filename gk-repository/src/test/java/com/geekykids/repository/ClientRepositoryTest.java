package com.geekykids.repository;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.geekykids.model.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages={"com.geekykids"})
@EntityScan("com.geekykids.model")
@ComponentScan
@Configuration()
@EnableJpaRepositories("com.geekykids.repository") 
@Ignore
public class ClientRepositoryTest {
	
	@Resource
    private ClientRepository userRepo;

	@Test
	public void add(){
		Client client = new Client("Nicholas Camilleri", "nicholas.camilleri@gmail.com");
		userRepo.save(client);
	}

	@Test
	public void findAll(){
		userRepo.findAll();
	}
}
