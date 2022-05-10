import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { RendezVous } from "./RendezVous";

@Injectable({
    providedIn: 'root'
})
export class RendezVousService {
    readonly API_URL = 'http://localhost:8068/SpringMVC/RendezVous'
    constructor(private httpClient: HttpClient){}
   // RendezVous: RendezVous = new RendezVous();
    getRendezVouss(){
        return this.httpClient.get(`${this.API_URL}/affiche`);
        
    }
    addRendezVous(RendezVous1: any){
        return this.httpClient.post<RendezVous>(`${this.API_URL}/add-rdv`, RendezVous1)
    }
    modifyRendezVous(RendezVous1: any){
        return this.httpClient.put(`${this.API_URL}/modify-rdv`, RendezVous1)
    }
    deleteRendezVous(idRendezVous: Number){
        return this.httpClient.delete(`${this.API_URL}/remove-rdv/${idRendezVous}`)
    }
    retrieveRendezVous(idRendezVous: Number){
        return this.httpClient.get(`${this.API_URL}/retrieve-rdv/${idRendezVous}`)
    }
   //  finfRendezVousByName(name: string): Observable<RendezVous[]> {
   //      return this.httpClient.get<RendezVous[]>(`${this.API_URL}/find-RendezVousByNom/${name}`)
   //  }
   //  triRendezVous(){
   //      return this.httpClient.get<RendezVous[]>(`${this.API_URL}/tri-RendezVous`);
   //  }
}
