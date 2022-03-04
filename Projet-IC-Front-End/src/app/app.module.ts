import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PieceDtacheComponent } from './piece-dtache/piece-dtache.component';
import { PieceDetacheFormComponent } from './piece-detache-form/piece-detache-form.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    LoginComponent,
    PieceDtacheComponent,
    PieceDetacheFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
