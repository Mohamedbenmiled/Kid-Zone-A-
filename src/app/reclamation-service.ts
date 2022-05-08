import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
// import { Observable } from "rxjs";
// import { user } from "./user";
@Injectable({
    providedIn: 'root'
    })
    export class ReclamationService {
       // private userUrl: string
    readonly API_URL = 'http://localhost:8068/SpringMVC/Reclamation';
    constructor (private httpClient: HttpClient) {
       // this.userUrl = 'http://localhost:8080/SpringMVC/User/affiche';
     }
    getAllReclamations() {
    return this.httpClient.get(`${this.API_URL}/affiche`)
    }
    addReclamation (reclamation: any) {
    return this.httpClient.post(`${this.API_URL}/add-rec`, reclamation)
    }
    editReclamation (reclamation: any) {
    return this.httpClient.put(`${this.API_URL}/modify-rec`, reclamation)
    }
    deleteReclamation (idreclamation: any) {
    return this.httpClient.delete(`${this.API_URL}/remove-rec/${idreclamation}`)
    }
    // getUsers(): Observable<user[]> {
    //     return this.httpClient.get<user[]>(this.userUrl);
    //    }
}