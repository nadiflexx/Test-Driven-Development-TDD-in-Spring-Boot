package com.dam2t.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dam2t.model.JuegoMesa;

/**
 * Represents a Table Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface JuegoMesaDao extends JpaRepository<JuegoMesa, Integer> {
	/**
	 * Update the description and type of a Table Game by its id.
	 * 
	 * @param descripcion a String representing the new description.
	 * @param tipo        a String representing the new type.
	 * @param id          an Integer representing the id of the Table Game.
	 */
	@Transactional
	@Modifying
	@Query(value = "update juego_mesa set descripcion=:description, tipo=:tipo where id=:id", nativeQuery = true)
	void updateJuegoMesa(@Param("description") String descripcion, @Param("tipo") String tipo, @Param("id") int id);
}