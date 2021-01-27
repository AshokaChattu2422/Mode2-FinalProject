import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http'
import { Account } from './account';
@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private baseURL="http://localhost:8884/bankapp/account";
  constructor(private httpClient: HttpClient) { }

  getAccountsList(): Observable<Account[]>{
    return this.httpClient.get<Account[]>(`${this.baseURL}`);
  }

  createAccount(account: Account): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, account);
  }

  updateAccount(accountId: number, account: Account): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${accountId}`, account);
  }

  getAccountById(accountId: number): Observable<Account>{
    return this.httpClient.get<Account>(`${this.baseURL}/${accountId}`);
  }
  deleteAccount(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
  
}