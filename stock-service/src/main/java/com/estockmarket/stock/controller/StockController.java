package com.estockmarket.stock.controller;

import com.estockmarket.stock.VO.RestTemplateVO;
import com.estockmarket.stock.service.StockService;
import com.estockmarket.stock.entity.Stock;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stock")
@Slf4j

public class StockController {

    @Autowired
    private StockService stockService;
    @Autowired
    private RestTemplate restTemplate;



    @PostMapping("/")
    public Stock createStock(@RequestBody Stock stock)
    {
        log.info("Inside create Stock in com.estockmarket.stock.controller");
        return stockService.createStock(stock);

    }

   @GetMapping("/{id}")
   public RestTemplateVO getStock(@PathVariable("id") Long companyId)
   {
       log.info("Inside get Stock in com.estockmarket.stock.controller");
       return stockService.getStock(companyId);
   }


}
