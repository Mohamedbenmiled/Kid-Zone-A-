import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Component, OnInit } from '@angular/core';
import { ReclamationService } from '../reclamation-service';
import { Reclamation } from '../reclamation';
import { Router } from '@angular/router';
import jsPDF from 'jspdf';
import html2canvas from 'html2canvas';


@Component({
  selector: 'app-reclamation',
  templateUrl: './reclamation.component.html',
//   styleUrls: ['./reclamation.component.scss']
})
export class ReclamationComponent implements OnInit {
  listReclamation: any;
  form: boolean = false; 
  reclamation!: Reclamation;
  closeliesultl: string;
  SearchVal:string='';
  constructor(private ReclamationService: ReclamationService, private modalService: NgbModal) { }

  ngOnInit(): void {
   //this.ReclamationService.getReclamations();
   this.ReclamationService.getReclamations().subscribe(res =>
    {this.listReclamation =res;
      console.log("hello")
    console.log(res);
    })


    this.reclamation = {

        idReclamation:null,
        note:null,
        description:null,
        user:null,
    }
  }
  getReclamations(){
   this.ReclamationService.getReclamations().subscribe(res =>
      {this.listReclamation =res;
        console.log("hello")
      console.log(res);
      })
  }
  addReclamation(e:any){
    return this.ReclamationService.addReclamation(e).subscribe(() =>{
      this.getReclamations();
      this.form = false;
    });
  }
  modifyReclamation(e:Event){
     this.ReclamationService.modifyReclamation(e).subscribe();
  }
  deleteReclamation(idEvent:any){
    this.ReclamationService.deleteReclamation(idEvent).subscribe(()=>
    this.getReclamations()
    );
  }
//   Search() {
//     if (this.SearchVal === '') {
//       this.getReclamations();
//     } else {
//       this.ReclamationService.finfEventByName(this.SearchVal).subscribe((res) => {
//         this.listReclamation = res;
//       });
//     }
//   }
//   triEvent(){
//     this.ReclamationService.triEvent().subscribe(
//       (data:Reclamation[])=> this.listReclamation = data
//     );
//   }

//   create(event){
//     console.log(event)
//     this.ReclamationService.addReclamation(event).subscribe(data =>{
//       this.getReclamations();
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