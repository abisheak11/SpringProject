package com.springcore.annotation.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component
@Getter
@Setter
public class Product {
    public String productName;
    public int productId;

    public Product(){
        this.productName="Phone";
        this.productId=1223;
    }

}
