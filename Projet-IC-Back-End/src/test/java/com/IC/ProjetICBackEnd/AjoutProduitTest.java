package com.IC.ProjetICBackEnd;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.web.bind.annotation.RestController;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;

public class AjoutProduitTest {

	@RestController
	class PieceDetacheController {
		
		@Mock
		private PieceDetache pieceDetache;
		
		@Test
	        PieceDetache addNewPiecesDetache() throws IOException {
			PieceDetache pieceDetache = new PieceDetache();
			pieceDetache.setPd_id(01);
			pieceDetache.setPd_prix(20);
			pieceDetache.setPd_libelle("boulons");
	        return pieceDetache;
	            
	    }
	}
}
