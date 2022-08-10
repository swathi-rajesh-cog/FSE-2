package com.estockmarket.company.controller;

import com.estockmarket.company.entity.Company;
import com.estockmarket.company.service.CompanyService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@Slf4j
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @PostMapping("/")
    public Company saveCompany(@RequestBody Company company) {
        log.info("Inside save company controller");
        return companyService.saveCompany(company);
    }
    @PutMapping("/{id}")
    public Company updateCompany(@RequestBody Company company) {
        log.info("Inside update company controller");
        return companyService.updateCompany(company);
    }

    @GetMapping("/{id}")
    public Company findCompanyById(@PathVariable("id") Long companyId) {
        log.info("Inside find company by id controller");
        return companyService.findCompanyById(companyId);

    }

    @DeleteMapping("/{id}")
    public Company deleteCompanyById(@PathVariable("id") Long companyId) {
        log.info("Inside delete company by id controller");
        return companyService.deleteCompanyById(companyId);
    }
}
