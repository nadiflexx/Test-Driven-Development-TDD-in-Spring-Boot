package com.dam2t.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents a Table Game to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Entity
public class JuegoMesa {

	@Id
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String editorial;
	@Column
	private String descripcion;
	@Column
	private int num_jugadores;
	@Column
	private String tipo;

	/**
	 * Get's the JuegoMesa id.
	 * 
	 * @return an Integer representing a JuegoMesa id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set's a JuegoMesa id.
	 * 
	 * @param id an Integer representing the new JuegoMesa id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get's the JuegoMesa name.
	 * 
	 * @return a String representing a JuegoMesa name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set's a JuegoMesa name.
	 * 
	 * @param nombre a String representing the new JuegoMesa name.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get's the JuegoMesa editorial.
	 * 
	 * @return a String representing a JuegoMesa editorial.
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Set's a JuegoMesa editorial.
	 * 
	 * @param editorial a String representing the new JuegoMesa editorial.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Get's the JuegoMesa description.
	 * 
	 * @return a String representing a JuegoMesa description.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Set's a JuegoMesa description.
	 * 
	 * @param descripcion a String representing the new JuegoMesa description.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Get's the JuegoMesa total players.
	 * 
	 * @return an Integer representing a JuegoMesa total players.
	 */
	public int getNum_jugadores() {
		return num_jugadores;
	}

	/**
	 * Set's a JuegoMesa total players.
	 * 
	 * @param num_jugadores an Integer representing the new JuegoMesa total players.
	 */
	public void setNum_jugadores(int num_jugadores) {
		this.num_jugadores = num_jugadores;
	}

	/**
	 * Get's the JuegoMesa type.
	 * 
	 * @return a String representing a JuegoMesa type.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Set's a JuegoMesa type.
	 * 
	 * @param tipo a String representing the new JuegoMesa type.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}