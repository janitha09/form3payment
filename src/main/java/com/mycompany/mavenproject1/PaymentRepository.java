/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author janitha_j
 */
@RepositoryRestResource(collectionResourceRel = "payment", path = "payment")
public interface PaymentRepository extends MongoRepository<Payment, String>{

    public List<Payment> findById(String string);
    
}
