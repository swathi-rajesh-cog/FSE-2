package com.estockmarket.company.service;

import com.estockmarket.company.entity.Company;
import com.estockmarket.company.repository.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        log.info("Inside save company service");

        return companyRepository.insert(company);
    }
    public Company updateCompany(Company company) {
        log.info("Inside update company service");

        return companyRepository.save(company);
    }

    public Company findCompanyById(Long companyId) {
        log.info("Inside find company service");

        return companyRepository.findByCompanyId(companyId);
    }

    public Company deleteCompanyById(Long companyId) {
        log.info("Inside delete company service");

        return companyRepository.deleteByCompanyId(companyId);
    }
}

