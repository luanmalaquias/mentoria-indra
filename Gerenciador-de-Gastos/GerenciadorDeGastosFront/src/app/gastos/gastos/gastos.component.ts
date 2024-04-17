import { Component } from '@angular/core';
import { Gasto } from '../model/gasto';
import { GastosService } from '../services/gastos.service';
import { HttpClient } from '@angular/common/http';
import { Observable, catchError, of } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';


@Component({
  selector: 'app-gastos',
  templateUrl: './gastos.component.html',
  styleUrls: ['./gastos.component.scss']
})
export class GastosComponent {

    gastos$: Observable<Gasto[]>;
    displayedColumns = ['descricao', 'valor', 'data'];

    constructor(
        private gastosService: GastosService,
        public dialog: MatDialog
    ){
        this.gastos$ = this.gastosService.list()
        .pipe(
            catchError(error => {
                this.onError('Erro ao carregar dados');
                return of([]);
            }) 
        );
    }

    onError(errorMsg: string) {
        this.dialog.open(ErrorDialogComponent, {
          data: errorMsg
        });
      }

    ngOnInit(): void{}

}
