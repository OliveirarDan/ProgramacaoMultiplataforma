/*
 *@Author: Danilo Rodrigues Oliveira
 *@RA: 81612248
*/ 


import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Filme } from '../../model/filmes';
import { DestinoPage } from '../destino/destino';
import { MovieProvider } from '../../providers/movie/movie';
import { AdicionaFilmePage } from '../adiciona-filme/adiciona-filme';
import { ExibeFilmesPage } from '../exibe-filmes/exibe-filmes';

/**
 * Generated class for the FilmesPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()


@Component({
  selector: 'page-filmes',
  templateUrl: 'filmes.html',
  providers: [
    MovieProvider
  ]
})
export class FilmesPage {

  constructor(public navCtrl: NavController, public navParams: NavParams,
    private movieProvider: MovieProvider) {

  }

  ionViewDidLoad() {
    this.movieProvider.getPopularMovies().subscribe(
      data => {
        const response = (data as any);
        const objeto_retorno = JSON.parse(response._body);
        console.log(objeto_retorno);
      }, error => {
        console.log(error);
      }
    )

  }

  cadastrarFilme() {
    this.navCtrl.push(AdicionaFilmePage);
  }

  //arquivo	home.ts
  exibirFilmes() {
    this.navCtrl.push(ExibeFilmesPage);
  }

  



}
