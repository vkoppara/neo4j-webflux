package com.vk.neo4jdemo.service;



import com.vk.neo4jdemo.dao.CompanyInstanceRepository;
import com.vk.neo4jdemo.dao.PolicyRepository;
import com.vk.neo4jdemo.model.CompanyInstance;
import com.vk.neo4jdemo.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private CompanyInstanceRepository companyInstanceRepository;

    public Flux<Policy> getAllPolicies(){
        return policyRepository.findAll();
    }

    public Mono<Policy> createPolicy(Policy policy){
        return policyRepository.save(policy);
    }

    public Mono<CompanyInstance> createCompanyInstance(String companyInstance,String productId){
        return policyRepository.findByProductId(productId).collectList().flatMap(policies -> {
            policies.add(new Policy("dummy","sdfsdf","productId"));
            return companyInstanceRepository.save(new CompanyInstance(companyInstance, "attr:123", policies));
        });

    }

}
