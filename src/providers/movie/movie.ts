import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

/*
  Generated class for the MovieProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MovieProvider {
  private baseApiPath = 'https://api.themoviedb.org/3';
  constructor(public http: Http) {
    console.log('Hello MovieProvider Provider');
  }

  getLatestMovies() {
    return this.http.get(this.baseApiPath + '/movie/latest?api_key='
    + this.getApiKey());
    }

  getPopularMovies() {
    return this.http.get(this.baseApiPath + '/movie/popular?api_key='
    + this.getApiKey());
    }

    getApiKey(): string{
      return '539baf8760cbac004e9ead94bc31113a';
      }

      

}
