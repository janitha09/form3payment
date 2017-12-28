/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author janitha_j
 */
@RunWith(SpringRunner.class)
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class MongoDBTests {

    @Autowired
    PaymentRepository paymentRepository;

    @Before
    public void deleteAllBeforeTests() throws Exception {
        paymentRepository.deleteAll();
    }

    @Test
    public void addPayment() {
        Payment payment = new Payment();
//        payment.id = "1"
        payment.setId("1");
        payment.setCurrency("USD");
        paymentRepository.save(payment);
        List<Payment> pl = paymentRepository.findById("1");
        assertThat(pl, hasSize(1));
    }

    @Test
    public void addRemovePayment() {
        Payment payment = new Payment();
//        payment.id = "1"
        payment.setId("1");
        payment.setCurrency("USD");
        paymentRepository.save(payment);
        List<Payment> pl = paymentRepository.findById("1");
        assertThat(pl, hasSize(1));
        paymentRepository.delete("1");
        pl = paymentRepository.findById("1");
        assertThat(pl, hasSize(0));
    }

    @Test
    public void addUpdatePayment() {
        Payment payment = new Payment();
//        payment.id = "1"
        payment.setId("1");
        payment.setCurrency("USD");
        paymentRepository.save(payment);
        List<Payment> pl = paymentRepository.findById("1");
        assertThat(pl.get(0).getId(), is("1"));
        assertThat(pl.get(0).getCurrency(), is("USD"));
        payment.setCurrency("GBP");
        paymentRepository.save(payment);
        pl = paymentRepository.findById("1");
        assertThat(pl, hasSize(1));
        assertThat(pl.get(0).getCurrency(), is("GBP"));
    }

}
