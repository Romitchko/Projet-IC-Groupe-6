import { Component, OnInit } from '@angular/core';
import { PieceDetacheService } from '../shared/services/pieceDetache.service';

@Component({
  selector: 'app-piece-dtache',
  templateUrl: './piece-dtache.component.html',
  styleUrls: ['./piece-dtache.component.scss']
})
export class PieceDtacheComponent implements OnInit {

  piecesDetaches: [] = [];

  constructor(
    private pieceDetacheService: PieceDetacheService
  ) { }

  ngOnInit(): void {
    this.pieceDetacheService.getPiecesDetache().subscribe(data => {
      this.piecesDetaches = data;      
    });
  }

}
