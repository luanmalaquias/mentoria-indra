import { Injectable } from '@angular/core';
import { Gasto } from '../model/gasto';
import { HttpClient } from '@angular/common/http';
import { delay, first, take, tap } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class GastosService {

    private readonly API = 'http://localhost:8080/api/gastos';
    //private readonly API = '/assets/gastos.json';

    constructor(private httpCliente: HttpClient) { }

    list() {
        return this.httpCliente.get<Gasto[]>(this.API)
        .pipe(
            first(),
            delay(5000),
            tap(gastos => console.log(gastos))
        );
    }
}
