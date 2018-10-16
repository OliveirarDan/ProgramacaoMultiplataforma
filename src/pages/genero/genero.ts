import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Genero } from '../../model/genero';
import { DestinoGPage } from '../destino-g/destino-g';

/**
 * Generated class for the GeneroPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-genero',
  templateUrl: 'genero.html',
})
export class GeneroPage {
  public generos:Genero[];

  constructor(public navCtrl: NavController) {
  var g1 = {nome: 'Terror', descricao:'Filmes que dão medo'}
  var g2 = {nome: 'Ação', descricao:'Filmes que animam'}
  var g3 = {nome: 'Comédia', descricao:'Filmes que divertem'}
  var g4 = {nome: 'Drama', descricao:'Filmes que comovem'}
  var g5 = {nome: 'Ficção Científica', descricao:'Filmes que dispertam a imaginação'}  
  this.generos = [g1, g2, g3, g4, g5];
}

  ionViewDidLoad() {
    console.log('ionViewDidLoad GeneroPage');
  }

  irParaDestino(genero:Genero):void{
    this.navCtrl.push(DestinoGPage, {generoSelecionado: genero});
    }

  

}
