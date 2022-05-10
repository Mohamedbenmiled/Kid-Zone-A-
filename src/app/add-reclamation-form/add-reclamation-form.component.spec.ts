import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddReclamationFormComponent } from './add-reclamation-form.component';

describe('AddReclamationFormComponent', () => {
  let component: AddReclamationFormComponent;
  let fixture: ComponentFixture<AddReclamationFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddReclamationFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddReclamationFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
