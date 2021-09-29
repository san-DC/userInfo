import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


const baseurl = "http://localhost:8080/api/user";
const displayinfourl = "http://localhost:8080/api/user/displayUserInfo"


@Injectable({
  providedIn: 'root'
})
export class UserService {
 
  constructor(private httpClientService: HttpClient) { }

  get(id) {
    return this.httpClientService.get(`${displayinfourl}/${id}`);
  }

}
