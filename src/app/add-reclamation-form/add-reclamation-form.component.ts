//import { Component, OnInit } from '@angular/core';
import { Reclamation } from 'src/app/Reclamation';
import { ReclamationService } from 'src/app/reclamation-service';
//import { ReclamationEmitter, Input,  Output } from '@angular/core';
import { Component, Input, OnInit, Output } from '@angular/core';
@Component({
  selector: 'add-reclamation-form',
  templateUrl: './add-reclamation-form.component.html',
  //styleUrls: ['./add-reclamtion-form.component.css']
})
export class AddReclamationFormComponent implements OnInit {
  Reclamation : Reclamation = new Reclamation();
  selected : string = '';
  selectedtype : string = '';
  ReclamationService : ReclamationService ;
  constructor(private service: ReclamationService) { }
  ngOnInit(): void {
  }
  create(){
    console.log(this.Reclamation);
    this.service.addReclamation(this.Reclamation).subscribe(data=>ReclamationService);
  }
  /*create(){ 
    console.log("heloooooooooooooooooooo");
   // this.submit.emit(this.Reclamation);
    this.ReclamationService.addReclamation(this.Reclamation).subscribe();
    this.modal.close('Save click');


  }*/

}