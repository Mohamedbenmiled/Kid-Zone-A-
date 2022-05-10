import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RendezVousComponentComponent } from './rendez-vous-component.component';

describe('RendezVousComponentComponent', () => {
  let component: RendezVousComponentComponent;
  let fixture: ComponentFixture<RendezVousComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RendezVousComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RendezVousComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
