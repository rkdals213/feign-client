package com.example.feignclient;

import com.example.feignclient.config.HeaderConfiguration;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "example", url = "http://localhost:9000/", configuration = {HeaderConfiguration.class})
public interface ExampleClient {

    @GetMapping("/test")
    Object request(@RequestParam String text);

    @GetMapping(value = "/test", headers = "header3=header value 3")
    Object request2(@RequestParam String text);

    @GetMapping(value = "/test")
    Response request3(@RequestParam String text);
}
