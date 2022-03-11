package com.IC.ProjetICBackEnd;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.IC.ProjetICBackEnd.restServices.model.PieceDetache;

public class pieceDetacheTest {

	    public PieceDetache crateTestSuite(){
	      return new PieceDetache();
	     }

	    @Test
	    public void testGetId() {
	     Integer pd_id= 0;
	     PieceDetache pieceDetache =null;
	     pieceDetache = crateTestSuite();
	     pd_id = pieceDetache.getPd_id();

	    }
	    
	    @Test
	    public void testGetLibelle() {
	     String pd_libelle= "";
	     PieceDetache pieceDetache =null;
	     pieceDetache = crateTestSuite();
	     pd_libelle = pieceDetache.getPd_libelle();

	    } 
	    
	    @Test
	    public void testGetPrix() {
	     Integer pd_prix= 0;
	     PieceDetache pieceDetache =null;
	     pieceDetache = crateTestSuite();
	     pd_prix = pieceDetache.getPd_prix();

	    }
	    
	    @Test
        PieceDetache testaddNewPiecesDetache() throws IOException {
		PieceDetache pieceDetache = new PieceDetache();
		pieceDetache.setPd_id(01);
		pieceDetache.setPd_prix(20);
		pieceDetache.setPd_libelle("boulons");
        return pieceDetache;
            
    }
	}
