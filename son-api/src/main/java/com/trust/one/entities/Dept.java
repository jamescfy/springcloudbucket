package com.trust.one.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept implements Serializable{
    
	private String dno;

    private String dname;

    private String ddSource;

}