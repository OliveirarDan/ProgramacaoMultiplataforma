/*
 *@Author: Danilo Rodrigues Oliveira
 *@RA: 81612248
*/ 

import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { DestinoGPage } from './destino-g';

@NgModule({
  declarations: [
    DestinoGPage,
  ],
  imports: [
    IonicPageModule.forChild(DestinoGPage),
  ],
})
export class DestinoGPageModule {}
