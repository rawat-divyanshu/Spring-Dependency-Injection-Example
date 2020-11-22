package com.rawatdivyanshu.SpringDependencyInjectionExample.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World !! Primary Bean";
    }
}
