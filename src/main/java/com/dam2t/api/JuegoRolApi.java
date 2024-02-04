package com.dam2t.api;

import java.util.ArrayList;
import java.util.Optional;

import com.dam2t.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dam2t.model.JuegoRol;

/**
 * Rol Game API class that collect the information from the API.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("rol")
public class JuegoRolApi {
	@Autowired
	private Services service;

	/**
	 * Calls a Service function to save a JuegoRol Object.
	 * 
	 * @param juegoRol representing a JuegoRol object from the body of the API.
	 * @return a JuegoRol object.
	 */
	@PostMapping("/save")
	public JuegoRol saveJuegoRol(@RequestBody JuegoRol juegoRol) {
		return service.saveJuegoRol(juegoRol);
	}

	/**
	 * Calls a Service function to show a JuegoRol object by its Id.
	 * 
	 * @param id representing an Integer from the path variable of the API.
	 * @return a JuegoRol object or a null.
	 */
	@GetMapping("/{id}")
	public Optional<JuegoRol> getJuegoRolById(@PathVariable("id") Integer id) {
		return service.getJuegoRolById(id);
	}

	/**
	 * Calls a Service function to update the level of a JuegoRol object.
	 * 
	 * @param id    representing an Integer from the path variable of the API.
	 * @param nivel representing an Integer from the request parameter of the API.
	 * @return a JuegoRol object or a null.
	 */
	@PutMapping("/update/{id}")
	public Optional<JuegoRol> updateJuegoDeRolById(@PathVariable("id") Integer id, @RequestParam Integer nivel) {
		return service.updateJuegoDeRolById(id, nivel);
	}

	/**
	 * Calls a Service function to show all the JuegoRol objects.
	 * 
	 * @return an ArrayList of JuegoRol objects.
	 */
	@GetMapping("")
	public ArrayList<JuegoRol> getAllJuegoRol() {
		return service.getAllJuegoRol();
	}
}