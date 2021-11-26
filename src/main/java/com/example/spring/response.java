package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class response {
    String code;
    String msg;
    Object data;
}

