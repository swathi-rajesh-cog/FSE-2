package com.estockmarket.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Company")
public class Company {
    @Id
    private long companyId;
    private String companyName;
    private String companyLocation;


}
