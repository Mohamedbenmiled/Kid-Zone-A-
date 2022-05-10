import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Reclamation } from "./Reclamation";

@Injectable({
    providedIn: 'root'
})
export class ReclamationService {
    readonly API_URL = 'http://localhost:8068/SpringMVC/Reclamation'
    constructor(private httpClient: HttpClient){}
   // Reclamation: Reclamation = new Reclamation();
    getReclamations(){
        return this.httpClient.get(`${this.API_URL}/affiche`);
        
    }
    addReclamation(Reclamation1: any){
        return this.httpClient.post<Reclamation>(`${this.API_URL}/add-rec`, Reclamation1)
    }
    modifyReclamation(Reclamation1: any){
        return this.httpClient.put(`${this.API_URL}/modify-rec`, Reclamation1)
    }
    deleteReclamation(idReclamation: Number){
        return this.httpClient.delete(`${this.API_URL}/remove-rec/${idReclamation}`)
    }
    retrieveReclamation(idReclamation: Number){
        return this.httpClient.get(`${this.API_URL}/retrieve-rec/${idReclamation}`)
    }
   //  finfReclamationByName(name: string): Observable<Reclamation[]> {
   //      return this.httpClient.get<Reclamation[]>(`${this.API_URL}/find-ReclamationByNom/${name}`)
   //  }
   //  triReclamation(){
   //      return this.httpClient.get<Reclamation[]>(`${this.API_URL}/tri-Reclamation`);
   //  }
}
