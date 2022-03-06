import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PieceDetacheService } from '../shared/services/pieceDetache.service';

@Component({
  selector: 'app-piece-detache-form',
  templateUrl: './piece-detache-form.component.html',
  styleUrls: ['./piece-detache-form.component.scss']
})
export class PieceDetacheFormComponent implements OnInit {
  pdLibelleCtrl: FormControl;
  pdPrixCtrl: FormControl;

  pieceDetacheForm: FormGroup;

  constructor(
    private pieceDetacheService: PieceDetacheService,
    private router: Router,
    private route: ActivatedRoute,
    private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.pdLibelleCtrl = this.fb.control('', Validators.required);
    this.pdPrixCtrl = this.fb.control('', Validators.required);
    this.pieceDetacheForm = this.fb.group({
      pd_libelle: this.pdLibelleCtrl,
      pd_prix: this.pdPrixCtrl
    });
  }

  register(): void {
    this.pieceDetacheService.postPiecesDetache(
      this.pdLibelleCtrl.value,
      this.pdPrixCtrl.value
    ).subscribe( _ => {
      this.router.navigate(['../'], { relativeTo: this.route });
    });
  }
}
