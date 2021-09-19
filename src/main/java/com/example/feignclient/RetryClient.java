package com.example.feignclient;

import com.example.feignclient.config.FeignConfiguration;
import com.example.feignclient.config.FeignRetryConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "retry", url = "http://localhost:9000/", configuration = {FeignConfiguration.class, FeignRetryConfiguration.class})
public interface RetryClient extends ExampleClient {

}
