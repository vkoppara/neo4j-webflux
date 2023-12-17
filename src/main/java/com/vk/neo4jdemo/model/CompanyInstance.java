package com.vk.neo4jdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Node("CompanyInstance")
public class CompanyInstance {
    @Id
    private String companyInstanceId;
    private String attributes;

    @Relationship(type="LINKED_POLICIES", direction= Relationship.Direction.INCOMING)
    private List<Policy> linkedPolicies;

    /*public CompanyInstance(String c1, String s, List<Policy> policies) {
        this.companyInstanceId = c1;
        this.attributes=s;
        this.linkedPolicies=policies;
    }*/
}
