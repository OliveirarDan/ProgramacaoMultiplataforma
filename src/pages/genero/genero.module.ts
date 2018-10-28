/*
 *@Author: Danilo Rodrigues Oliveira
 *@RA: 81612248
*/ 

import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { GeneroPage } from './genero';

@NgModule({
  declarations: [
    GeneroPage,
  ],
  imports: [
    IonicPageModule.forChild(GeneroPage),
  ],
})
export class GeneroPageModule {}