package com.vk.neo4jdemo.controller;

import com.vk.neo4jdemo.model.CompanyInstance;
import com.vk.neo4jdemo.model.Policy;
import com.vk.neo4jdemo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @Autowired
    private PolicyService policyService;

    @GetMapping
    public Flux<Policy> getPolicies(){
        return policyService.getAllPolicies();
    }

    @PostMapping("/policy")
    public Mono<Policy> createPolicy(@RequestBody Policy policy){
        return policyService.createPolicy(policy);
    }

    @GetMapping("/companyInstance/{productId}/{companyInstance}")
    public Mono<CompanyInstance> createCompanyInstance(@PathVariable String productId, @PathVariable String companyInstance ){
        return policyService.createCompanyInstance(productId, companyInstance);
    }
}
