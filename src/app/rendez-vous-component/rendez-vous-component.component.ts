import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Component, OnInit } from '@angular/core';
import { RendezVousService } from '../rendezVous-service.service';
import { RendezVous } from '../RendezVous';
import { Router } from '@angular/router';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';


@Component({
  selector: 'app-rendezvous',
  templateUrl: './rendez-vous-component.component.html',
//   styleUrls: ['./RendezVous.component.scss']
})
export class RendezVousComponent implements OnInit {
  listRendezVous: any;
  form: boolean = false; 
  RendezVous!: RendezVous;
  closeliesultl: string;
  SearchVal:string='';
  constructor(private RendezVousService: RendezVousService, private modalService: NgbModal) { }

  ngOnInit(): void {
   //this.RendezVousService.getRendezVouss();
   this.RendezVousService.getRendezVouss().subscribe(res =>
    {this.listRendezVous =res;
      console.log("hello")
    console.log(res);
    })


    this.RendezVous = {

        idrdv:null,
        sujet:null,
        date:null,
    }
  }
  getRendezVouss(){
   this.RendezVousService.getRendezVouss().subscribe(res =>
      {this.listRendezVous =res;
        console.log("hello")
      console.log(res);
      })
  }
  addRendezVous(e:any){
    return this.RendezVousService.addRendezVous(e).subscribe(() =>{
      this.getRendezVouss();
      this.form = false;
    });
  }
  modifyRendezVous(e:Event){
     this.RendezVousService.modifyRendezVous(e).subscribe();
  }
  deleteRendezVous(idEvent:any){
    this.RendezVousService.deleteRendezVous(idEvent).subscribe(()=>
    this.getRendezVouss()
    );
  }
//   Search() {
//     if (this.SearchVal === '') {
//       this.getRendezVouss();
//     } else {
//       this.RendezVousService.finfEventByName(this.SearchVal).subscribe((res) => {
//         this.listRendezVous = res;
//       });
//     }
//   }
//   triEvent(){
//     this.RendezVousService.triEvent().subscribe(
//       (data:RendezVous[])=> this.listRendezVous = data
//     );
//   }

//   create(event){
//     console.log(event)
//     this.RendezVousService.addRendezVous(event).subscribe(data =>{
//       this.getRendezVouss();
//       alert("Class successfully added");
//     });
//     this.modalService.dismissAll();

//   }
  open(content) {
    this.modalService.open(content, {scrollable: true,backdrop:false});
  }
  /*public openPDF(): void {
    let DATA: any = document.getElementById('htmlData');
    html2canvas(DATA).then((canvas) => {
        let fileWidth = 208;
        let fileHeight = (canvas.height * fileWidth) / canvas.width;
        const FILEURI = canvas.toDataURL('image/png');
        let PDF = new jsPDF('p', 'mm', 'a4');
        let position = 0;
        PDF.addImage(FILEURI, 'PNG', 0, position, fileWidth, fileHeight);
        PDF.save('Liste des evenements.pdf');
    });
*/


}