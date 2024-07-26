package com.curso.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DetalleOrden {
	private Integer id;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;
}


