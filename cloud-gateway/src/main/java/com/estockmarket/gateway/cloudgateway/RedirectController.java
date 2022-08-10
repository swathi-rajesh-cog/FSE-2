package com.estockmarket.gateway.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {
    @GetMapping("/companyServiceRedirect")
    public String companyServicieRedirectMethod()
    {
        return "Company service is taking longer than expected. Please try after sometime";
    }

    @GetMapping("/stockServiceRedirect")
    public String stockServicieRedirectMethod()
    {
        return "Stock service is taking longer than expected. Please try after sometime";
    }
}

