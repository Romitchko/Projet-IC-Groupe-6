package com.IC.ProjetICBackEnd.restServices.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;
import com.IC.ProjetICBackEnd.restServices.rowMapper.PieceDetacheRowMapper;

@Repository
public class PieceDetacheRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<PieceDetache> findAll() {
		String sql = "SELECT * FROM piece_detache ORDER BY pd_prix";
		List<PieceDetache> pieces = jdbcTemplate.query(sql, new PieceDetacheRowMapper());
		return pieces;
	}
}
