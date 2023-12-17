package com.vk.neo4jdemo.dao;

import com.vk.neo4jdemo.model.Policy;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PolicyRepository extends ReactiveNeo4jRepository<Policy, String > {

    Flux<Policy> findByProductId(String productId);

}
