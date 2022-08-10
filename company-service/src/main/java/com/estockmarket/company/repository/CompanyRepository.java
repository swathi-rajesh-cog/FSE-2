package com.estockmarket.company.repository;

import com.estockmarket.company.entity.Company;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CompanyRepository extends MongoRepository<Company, Long> {


    public Company findByCompanyId(Long companyId);
    public Company deleteByCompanyId(Long companyId);


}
