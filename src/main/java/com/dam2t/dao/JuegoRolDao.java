package com.dam2t.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dam2t.model.JuegoRol;

/**
 * Represents a Rol Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface JuegoRolDao extends JpaRepository<JuegoRol, Integer> {
	/**
	 * Update the level of a Rol Game by its id.
	 * 
	 * @param nivel a String representing the new level.
	 * @param id    an Integer representing the id of the Rol Game.
	 */
	@Transactional
	@Modifying
	@Query(value = "update juego_rol set nivel=:nivel where id=:id", nativeQuery = true)
	void updateJuegoRol(@Param("nivel") int nivel, @Param("id") int id);
}