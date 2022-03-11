package com.IC.ProjetICBackEnd;


import java.util.List;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;
import com.IC.ProjetICBackEnd.restServices.rowMapper.PieceDetacheRowMapper;

@SpringBootTest
class ApiTest {
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//    PieceDetache pieceDetache;
//
//	@Test
//	public void testRecupererPieceDetaches() throws JSONException {
//		
//		String sql = "SELECT * FROM piece_detache ORDER BY pd_prix";
//		List<PieceDetache> pieceDetache = jdbcTemplate.query(sql, new PieceDetacheRowMapper());
//		
//	}
}