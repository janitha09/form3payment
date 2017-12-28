/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.net.URL;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author janitha_j
 */
@RunWith(SpringRunner.class)
//@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceCallTests {

    private URL base;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    @Autowired
    PaymentRepository paymentRepository;

    @Before
    public void deleteAllBeforeTests() throws Exception {
        paymentRepository.deleteAll();
    }

    @Test
    public void checkRepository() throws Exception {
        this.base = new URL("http://localhost:" + port + "/payment");
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assertThat(response.getStatusCode().toString(), equalTo("200"));
    }

    @Test
    public void postPayment() throws Exception {
        this.base = new URL("http://localhost:" + port + "/payment");
        Payment payment = new Payment();
        payment.setId("1");
        payment.setCurrency("USD");
        Payment.Attributes attributes = new Payment.Attributes();
        attributes.setAmount("100.00");
        payment.setAttributes(attributes);
        HttpEntity<Payment> request = new HttpEntity<>(payment);
        ResponseEntity<Payment> response;
        response = template.postForEntity(base.toString(), request, Payment.class);
        assertThat(response.getStatusCode().toString(), equalTo("201"));
        assertThat(response.getBody().getAttributes().getAmount(), is("100.00"));
    }

}
