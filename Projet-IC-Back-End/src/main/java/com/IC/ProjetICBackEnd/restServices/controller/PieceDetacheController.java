package com.IC.ProjetICBackEnd.restServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;
import com.IC.ProjetICBackEnd.restServices.rowMapper.PieceDetacheRowMapper;

@RestController
public class PieceDetacheController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/pieceDetache")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<PieceDetache> getAll() {
		String sql = "SELECT * FROM piece_detache ORDER BY pd_prix";
		return jdbcTemplate.query(sql, new PieceDetacheRowMapper());
	}
	
	@PostMapping(path= "/pieceDetache", consumes = "application/json", produces = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody String pd_libelle, @RequestBody int pd_prix) {
		String sql = "insert into piece_detache (pd_libelle, pd_prix) values (?, ?)";
		return jdbcTemplate.update(sql, pd_libelle, pd_prix);
	}
}
