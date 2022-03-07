import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PieceDetacheService {

  constructor(private http: HttpClient) { }

  getPiecesDetache(): any {
    return this.http.get(environment.TPAPI + 'pieceDetache');
  }

  createPiecesDetache(libelle, prix): any {
    return this.http.post(environment.TPAPI + 'pieceDetache', 
      {
        "pd_libelle": libelle,
        "pd_prix": prix
      }
    );
  }
}
