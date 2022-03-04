import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PieceDetacheFormComponent } from './piece-detache-form.component';

describe('PieceDetacheFormComponent', () => {
  let component: PieceDetacheFormComponent;
  let fixture: ComponentFixture<PieceDetacheFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PieceDetacheFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PieceDetacheFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
