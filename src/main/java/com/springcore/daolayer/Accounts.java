package com.springcore.daolayer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Accounts {
    int id;
    String accountNumber;
    String accountName;
    String accountType;
}
