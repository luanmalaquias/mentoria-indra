import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GastosRoutingModule } from './gastos-routing.module';
import { GastosComponent } from './gastos/gastos.component';
import { AppMateralModule } from '../shared/app-materal/app-materal.module';
import { SharedModule } from '../shared/shared.module';



@NgModule({
  declarations: [
    GastosComponent
  ],
  imports: [
    CommonModule,
    GastosRoutingModule,
    AppMateralModule,
    SharedModule,
  ]
})
export class GastosModule { }
