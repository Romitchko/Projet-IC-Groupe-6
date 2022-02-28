package com.IC.ProjetICBackEnd.restServices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;
import com.IC.ProjetICBackEnd.restServices.repository.PieceDetacheRepository;

@RestController
public class PieceDetacheController {

	@GetMapping("/pieceDetache")
	public List<PieceDetache> getPiecesDetache() {
		// List<PieceDetache> PiecesDetache = PieceDetacheRepository.findAll();
		return null;
	}
}
