package com.techtalentsouth.Pets.Controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;




public interface PetsRepository extends CrudRepository<PetsUser, Long>{

	
	//public List<PetsUser> findAll();
	

}