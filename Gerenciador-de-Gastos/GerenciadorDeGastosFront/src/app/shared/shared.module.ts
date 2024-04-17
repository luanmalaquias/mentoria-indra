import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { AppMateralModule } from './app-materal/app-materal.module';



@NgModule({
  declarations: [
    ErrorDialogComponent
  ],
  imports: [
    AppMateralModule,
    CommonModule
  ],
  exports: [ErrorDialogComponent]
})
export class SharedModule { }
