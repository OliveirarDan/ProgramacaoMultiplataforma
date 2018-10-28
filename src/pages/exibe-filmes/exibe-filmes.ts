import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { Filme } from '../../model/filme';
import { FilmeProvider } from '../../providers/filme/filme';
import { DatabaseProvider } from '../../providers/database/database';
import { SQLiteObject } from '@ionic-native/sqlite';
import { AtualizaFilmePage } from '../atualiza-filme/atualiza-filme';

/**
 * Generated class for the ExibeFilmesPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-exibe-filmes',
  templateUrl: 'exibe-filmes.html',
})
export class ExibeFilmesPage {

  public filmes: Filme[];
  constructor(public navCtrl: NavController, public navParams: NavParams, private toastCtrl: ToastController, public filmeProvider: FilmeProvider, public dbProvider: DatabaseProvider) {
    
  }

  ionViewDidLoad() {
    this.filmeProvider.listar().
    then((filmes: Filme []) =>{
    this.filmes = filmes;
    });
    }

  public apagar(filme: Filme) {
    return this.dbProvider.openDatabase().
      then((db: SQLiteObject) => {
        let sql = "DELETE FROM cliente WHERE id = ?";
        //será colocado no lugar do ?
        let param = [filme.id];
        return db.executeSql(sql, param);
      });
  }

  apagaFilme(filme: Filme) {
    this.filmeProvider.apagar(filme);
    this.exibirToast("Filme apagado com sucesso");
    //para atualizar alista que está sendo exibida
    this.filmeProvider.listar().
      then((filmes: Filme[]) => {
        this.filmes = filmes;
      });
  }


  exibirToast(dados) {
    let t = this.toastCtrl.create({
      message: dados,
      duration: 3000,
      position: "top"
    });
    t.present();
  }

  atualizaCliente (filme: Filme){
    this.navCtrl.push(AtualizaFilmePage, filme);
    }
}
