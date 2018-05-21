import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {Observable} from "rxjs";


@Component({
  selector: 'app-averages',
  templateUrl: './averages.component.html',
  styleUrls: ['./averages.component.css']
})
export class AveragesComponent implements OnInit {

  numbersCount : number;
  generatedNumbers : number[];
  average : number;

  constructor(private http : HttpClient) { }

  onClickRandom() : void {
    this.getRandom().subscribe(a => this.generatedNumbers = a);
  }

  getRandom(): Observable<number[]> {
    let params = new HttpParams();
    params = params.set("numbersCount", this.numbersCount.toString());
    return this.http.get<number[]>("http://localhost:8082/getRandom", {params : params});
  }

  onClickAverage() : void {
    this.getAverage().subscribe(a => this.average = a);
  }

  getAverage(): Observable<number> {
    let params = new HttpParams();
    params = params.set("numbers", this.generatedNumbers.toString());
    return this.http.get<number>("http://localhost:8082/getAverage", {params : params});
  }

  ngOnInit() {
  }

}
