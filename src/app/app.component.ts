import { Component } from '@angular/core';
import { Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { TabsPage } from '../pages/tabs/tabs';
import { DatabaseProvider } from '../providers/database/database';
import { FilmesPage } from '../pages/filmes/filmes';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  rootPage: any = TabsPage;

  constructor(platform: Platform, statusBar: StatusBar, splashScreen: SplashScreen, dbProvider: DatabaseProvider) {
    platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      statusBar.styleDefault();
      dbProvider.createDatabase().then(() => {
        //para abrir a home page somente depois de criar a base
        this.abrirFilmesPage(splashScreen);

      }).catch((e) => {
        //log caso algo falhe
        console.log(e);
        this.abrirFilmesPage(splashScreen);
      });
    });
  }
  
  
  
  private abrirFilmesPage(splashScreen: SplashScreen) {
    splashScreen.hide();
    //configura a root page depois de criar o bancos
    this.rootPage = FilmesPage;
  }




}

