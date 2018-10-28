
/*
 *@Author: Danilo Rodrigues Oliveira
 *@RA: 81612248
*/ 

import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { DestinoPage } from './destino';

@NgModule({
  declarations: [
    DestinoPage,
  ],
  imports: [
    IonicPageModule.forChild(DestinoPage),
  ],
})
export class DestinoPageModule {}
