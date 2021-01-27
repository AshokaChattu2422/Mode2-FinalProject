import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { AccountComponent } from './account/account.component';
import { AuthGaurdService } from './auth-gaurd.service';
import { CreateAccountComponent } from './create-account/create-account.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { UpdateAccountComponent } from './update-account/update-account.component';


const routes: Routes = [

  {path:'accounts', component: AccountComponent, canActivate:[AuthGaurdService]},
  {path:'create-account', component: CreateAccountComponent, canActivate:[AuthGaurdService]},
  {path:'update-account/:id', component: UpdateAccountComponent, canActivate:[AuthGaurdService]},
  {path:'account-details/:id', component: AccountDetailsComponent, canActivate:[AuthGaurdService]},
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent , canActivate:[AuthGaurdService]},
  {path:'', redirectTo:'accounts', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }