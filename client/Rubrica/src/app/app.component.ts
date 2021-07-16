import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from './contatto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  contatto: Contatto = new Contatto();
  contatti: Contatto[] = [];
  count: number = 0;

  constructor(private http: HttpClient) { }

  public aggiungi() {
    let oss: Observable<Contatto[]>
      = this.http.post<Contatto[]>("http://localhost:8080/aggiungi", this.contatto);
    oss.subscribe(risp => {
      this.contatti = risp;
    })
  }

  public rimuovi() {
    let oss: Observable<Contatto[]>
      = this.http.post<Contatto[]>("http://localhost:8080/rimuovi", this.contatto);
    oss.subscribe(risp => {
      this.contatti = risp;
    })
  }

  public mostra() {
    let oss: Observable<Contatto[]>
      = this.http.get<Contatto[]>("http://localhost:8080/mostra");
    oss.subscribe(risp => {
      this.contatti = risp;
    })
  }

  public conta() {
    let oss: Observable<number>
      = this.http.get<number>("http://localhost:8080/conta");
    oss.subscribe(risp => {
      this.count = risp;
    })
  }

}
