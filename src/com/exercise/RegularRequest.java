package com.exercise;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegularRequest extends ServiceRequest{
    private String weekly;  //주기
}
