import { Component, OnInit } from '@angular/core';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Reclamation } from '../reclamation';
import { ReclamationService } from '../reclamation-service';


@Component({
  selector: 'app-reclamation',
  templateUrl: './reclamation.component.html',
  styleUrls: ['./reclamation.component.css']
})
export class ReclamationComponent implements OnInit {
 // users: user[];
  listReclamations:any;
  form: boolean = false;
  reclamation!: Reclamation;
  closeResult!: string;
  constructor(private reclamationService: ReclamationService, private modalService:NgbModal) { }

  ngOnInit(): void {
    this.getAllReclamations();

    this.reclamation = {
    idReclamation:null,
    note:null,
    description:null,
    user:null as any,

    }
  }
 

    
  
  getAllReclamations() {
    this.reclamationService.getAllReclamations().subscribe(res => {
      this.listReclamations = res
      console.log(res)
    })
    }
    addReclamation (r: any) {
    this.reclamationService.addReclamation(r).subscribe(() => {
    this.getAllReclamations();
    this.form = false;
    });
    }
   
    editReclamation (reclamation: Reclamation) {
     this.reclamationService.editReclamation(reclamation).subscribe();
    }
    deleteReclamation (IdReclamation: any) {
      this.reclamationService.deleteReclamation(IdReclamation).subscribe(()=> this.getAllReclamations());
    }
    open(content: any) {
      this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
        this.closeResult = `Closed with: ${result}`;
      }, (reason) => {
        this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
      });
    }
    private getDismissReason(reason: any): string {
      if (reason === ModalDismissReasons.ESC) {
        return 'by pressing ESC';
      } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
        return 'by clicking on a backdrop';
      } else {
        return  `with: ${reason}`;
      }
    }
    closeForm(){
  
    }
    cancel(){
      this.form = false;
    }
    // listUsers() {
    //   this.reclamationService.getUsers().subscribe(
    //     data => {
    //       console.log('users' + JSON.stringify(data));
    //       this.users = data;
    
    //     }
    //   );
      }
    


