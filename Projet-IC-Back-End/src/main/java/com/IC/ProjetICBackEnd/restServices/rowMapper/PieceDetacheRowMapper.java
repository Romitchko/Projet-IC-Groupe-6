package com.IC.ProjetICBackEnd.restServices.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;

@Repository
public class PieceDetacheRowMapper implements RowMapper<PieceDetache> {

	@Override
	public PieceDetache mapRow(ResultSet rs, int rowNum) throws SQLException {
		PieceDetache pieceDetache = new PieceDetache();
		pieceDetache.setPd_id(rs.getInt("pd_id"));
		pieceDetache.setPd_libelle(rs.getString("pd_libelle"));
		pieceDetache.setPd_prix(rs.getInt("pd_prix"));
		return pieceDetache;
	}

}
