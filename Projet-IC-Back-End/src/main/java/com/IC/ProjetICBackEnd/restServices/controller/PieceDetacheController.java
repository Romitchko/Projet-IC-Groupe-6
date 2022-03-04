package com.IC.ProjetICBackEnd.restServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;
import com.IC.ProjetICBackEnd.restServices.rowMapper.PieceDetacheRowMapper;

@RestController
public class PieceDetacheController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/pieceDetache")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<PieceDetache> getPiecesDetache() {
		String sql = "SELECT * FROM piece_detache ORDER BY pd_prix";
		List<PieceDetache> pieces = jdbcTemplate.query(sql, new PieceDetacheRowMapper());
		return pieces;
	}
}
