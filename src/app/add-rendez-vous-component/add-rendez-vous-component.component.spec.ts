import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRendezVousComponentComponent } from './add-rendez-vous-component.component';

describe('AddRendezVousComponentComponent', () => {
  let component: AddRendezVousComponentComponent;
  let fixture: ComponentFixture<AddRendezVousComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRendezVousComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddRendezVousComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
