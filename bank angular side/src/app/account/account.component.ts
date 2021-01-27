import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import {Account} from '../account';
import { AccountService } from '../account.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {
  accounts: Account[];
  constructor(private accountService: AccountService,private  router: Router) { }

  ngOnInit() {
    this.getAccounts();
  }
  private getAccounts(){
    console.log("---------");
    this.accountService.getAccountsList().subscribe(data=>{
	this.accounts=data;
    });
  
  }
  
  updateAccount(accountId: number){
    console.log(`-----------`)
    this.router.navigate(['update-account', accountId]);
  }
  deleteAccount(id: number){
    this.accountService.deleteAccount(id).subscribe(data=>{
      this.getAccounts();
      console.log(data);
    })
  }

 
  accountDetails(id: number){
    this.router.navigate(['account-details', id]);
  }

  
}