package com.unab.stipps_1.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 30, nullable = false)
	private String nombre;
	
	@Column(name = "apellido", length = 30, nullable = false)
	private String apellido;
	
	@Column(name = "correo", length = 30, nullable = false)
	private String correo;
	
	@Column(name = "telefono", length = 18, nullable = false)
	private String telefono;
	
	@Column(name = "ubicacion", length = 18, nullable = false)
	private String ubicacion;
}
