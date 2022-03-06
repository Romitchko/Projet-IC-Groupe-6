import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PieceDetacheFormComponent } from './piece-detache-form/piece-detache-form.component';
import { PieceDtacheComponent } from './piece-dtache/piece-dtache.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  { path: '', component: WelcomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'pieceDetache', component: PieceDtacheComponent },
  { path: 'pieceDetache/add', component: PieceDetacheFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
