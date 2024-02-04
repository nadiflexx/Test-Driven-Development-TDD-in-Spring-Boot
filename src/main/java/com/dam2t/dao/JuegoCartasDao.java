package com.dam2t.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dam2t.model.JuegoCartas;
import org.springframework.stereotype.Repository;

/**
 * Represents a Card Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface JuegoCartasDao extends JpaRepository<JuegoCartas, Integer> {
	/**
	 * Selects Card Games that have the same season.
	 * 
	 * @param temporada Integer representing the season to search.
	 * @return an ArrayList of all the Card Games with the same season.
	 */
	@Query(value = "SELECT * FROM juego_cartas WHERE temporada=:temporada", nativeQuery = true)
	ArrayList<JuegoCartas> findJuegoCartasByTemporada(@Param("temporada") int temporada);
}