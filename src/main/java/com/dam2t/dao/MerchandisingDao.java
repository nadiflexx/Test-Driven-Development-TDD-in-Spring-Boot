package com.dam2t.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dam2t.model.Merchandising;
import org.springframework.stereotype.Repository;

/**
 * Represents a Merchandising interface to manipulate database data (CRUD) with
 * SQL functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface MerchandisingDao extends JpaRepository<Merchandising, Integer> {
	/**
	 * Selects Merchandising that are of the same type.
	 * 
	 * @param tipo String representing the type to search.
	 * @return an ArrayList of all Merchandising that are of the same type.
	 */
	@Query(value = "SELECT * FROM merchandising WHERE tipo=:tipo", nativeQuery = true)
	ArrayList<Merchandising> findMerchandisingByTipo(@Param("tipo") String tipo);
}