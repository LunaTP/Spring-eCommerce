package com.curso.ecommerce.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Orden {
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;
}
