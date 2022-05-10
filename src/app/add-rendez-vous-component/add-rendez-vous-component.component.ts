//import { Component, OnInit } from '@angular/core';
import { RendezVous } from 'src/app/RendezVous';
//import { RendezVousEmitter, Input,  Output } from '@angular/core';
import { Component, Input, OnInit, Output } from '@angular/core';
import { RendezVousService } from '../rendezVous-service.service';
@Component({
  selector: 'add-RendezVous-form',
  templateUrl: './add-rendez-vous-component.component.html',
  //styleUrls: ['./add-reclamtion-form.component.css']
})
export class AddRendezVousFormComponent implements OnInit {
  RendezVous : RendezVous = new RendezVous();
  selected : string = '';
  selectedtype : string = '';
  RendezVousService : RendezVousService ;
  constructor(private service: RendezVousService) { }
  ngOnInit(): void {
  }
  create(){
    console.log(this.RendezVous);
    this.service.addRendezVous(this.RendezVous).subscribe(data=>RendezVousService);
  }
  
  /*create(){ 
    console.log("heloooooooooooooooooooo");
   // this.submit.emit(this.RendezVous);
    this.RendezVousService.addRendezVous(this.RendezVous).subscribe();
    this.modal.close('Save click');


  }*/

}