import { NgModule, ErrorHandler } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';


import { HomePage } from '../pages/home/home';
import { TabsPage } from '../pages/tabs/tabs';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { FilmesPageModule } from '../pages/filmes/filmes.module';
import { GeneroPageModule } from '../pages/genero/genero.module';
import { PopularidadePageModule } from '../pages/popularidade/popularidade.module';
import { LancamentoPageModule } from '../pages/lancamento/lancamento.module';
import { DestinoPageModule } from '../pages/destino/destino.module';
import { DestinoGPageModule } from '../pages/destino-g/destino-g.module';

import { MovieProvider } from '../providers/movie/movie';
import {HttpModule} from "@angular/http";
import {SQLite}	from '@ionic-native/sqlite';
import { DatabaseProvider } from '../providers/database/database';
import { FilmeProvider } from '../providers/filme/filme';
import { AdicionaFilmePage } from '../pages/adiciona-filme/adiciona-filme';
import { ExibeFilmesPage } from '../pages/exibe-filmes/exibe-filmes';
import { AtualizaFilmePage } from '../pages/atualiza-filme/atualiza-filme';



@NgModule({
  declarations: [
    MyApp,
    HomePage,
    TabsPage,
    AdicionaFilmePage,
    ExibeFilmesPage,
    AtualizaFilmePage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    FilmesPageModule,
    GeneroPageModule,
    PopularidadePageModule,
    LancamentoPageModule,
    DestinoPageModule, 
    DestinoGPageModule,
    HttpModule   
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    TabsPage,
    AdicionaFilmePage,
    ExibeFilmesPage,
    AtualizaFilmePage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    MovieProvider,
    SQLite,
    DatabaseProvider,
    FilmeProvider,
    FilmeProvider
  ]
})
export class AppModule {}
