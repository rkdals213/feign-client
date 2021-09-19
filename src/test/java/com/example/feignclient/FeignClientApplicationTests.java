package com.example.feignclient;

import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeignClientApplicationTests {

    @Qualifier("com.example.feignclient.ExampleClient")
    @Autowired
    ExampleClient exampleClient;

    @Autowired
    RetryClient retryClient;

    @Test
    void example1() {
        Object result = exampleClient.request("200");
        System.out.println(result);
    }

    @Test
    void example2() {
        Object result = exampleClient.request2("200");
        System.out.println(result);
    }

    @Test
    void example3() {
        Object result = exampleClient.request("400");
        System.out.println(result);
    }

    @Test
    void example4() {
        Response response = exampleClient.request3("400");
        System.out.println(response);
    }

    @Test
    void example5() {
        Object response = retryClient.request("400");
        System.out.println(response);
    }
}
