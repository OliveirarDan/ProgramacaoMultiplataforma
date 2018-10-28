import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SQLite, SQLiteObject } from '@ionic-native/sqlite';




@Injectable()
export class DatabaseProvider {

  constructor(private db : SQLite) {
  }

  openDatabase (){
    return this.db.create ({
    name:"clientes.db",
    location: "default"
    });
    }

    createDatabase() {
      return this.openDatabase().
        then((db: SQLiteObject) => {
          this.createTabelaFilmes(db);
        });
    }
  
    createTabelaFilmes(db: SQLiteObject) {
      let sql: string = "CREATE	TABLE	IF	NOT	EXISTS	filmes	(id	INTEGER	PRIMARY	KEY	AUTOINCREMENT,	" +
        "	titulo	VARCHAR	(200),	genero	VARCHAR(200))";
      db.executeSql(sql);//{poderia	conter	parâmetros,	por	isso	o	{}}
    }



    
}
