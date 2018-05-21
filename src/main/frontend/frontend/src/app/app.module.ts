import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; // <-- NgModel lives here

import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AveragesComponent } from './averages/averages.component';

@NgModule({
  declarations: [
    AppComponent,
    AveragesComponent
  ],
  imports: [
    BrowserModule
    ,FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
