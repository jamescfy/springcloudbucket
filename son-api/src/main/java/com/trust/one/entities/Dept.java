package com.trust.one.entities;

import java.io.Serializable;

import javax.jws.HandlerChain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
	
    private static final long serialVersionUID =1L;
	
	private String dno;

    private String dname;

    private String dbSource;

}