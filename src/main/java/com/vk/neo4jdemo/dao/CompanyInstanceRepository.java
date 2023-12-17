package com.vk.neo4jdemo.dao;

import com.vk.neo4jdemo.model.CompanyInstance;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface CompanyInstanceRepository extends ReactiveNeo4jRepository<CompanyInstance, String > {
}
