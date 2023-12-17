package com.vk.neo4jdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Node("Policy")
public class Policy {
    @Id
    private String policyId;

    @Property("description")
    private String description;

    private String productId;

}
