package com.unab.stipps_1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class CursoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "area_conocimiento", length = 100, nullable = false)
	private String area_conocimiento;
	
	@Column(name = "descripcion", length = 40, nullable = false)
	private String descripcion;
	
	@Column(name = "profesor", length = 100, nullable = false)
	private String profesor;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_profesor", nullable = false)
	private PersonaEntity idProfesor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea_conocimiento() {
		return area_conocimiento;
	}

	public void setArea_conocimiento(String area_conocimiento) {
		this.area_conocimiento = area_conocimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	

}
