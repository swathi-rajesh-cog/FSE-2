package com.estockmarket.stock.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Stock")
public class Stock {


    @Id
    private Long companyId;
    private Long price;
    private Date addedDate = new Date(System.currentTimeMillis());


}
