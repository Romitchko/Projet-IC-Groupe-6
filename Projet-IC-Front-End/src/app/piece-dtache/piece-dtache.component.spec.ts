import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PieceDtacheComponent } from './piece-dtache.component';

describe('PieceDtacheComponent', () => {
  let component: PieceDtacheComponent;
  let fixture: ComponentFixture<PieceDtacheComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PieceDtacheComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PieceDtacheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
