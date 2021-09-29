import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username = ''
  password = ''
  invalidLogin = false

  constructor(private router: Router, 
   userservice:UserService) { }

  ngOnInit() {
  }

  // checkLogin() {
  //   (this.loginservice.authenticate(this.username, this.password).subscribe(
  //     data => {
  //       this.router.navigate(['dashboard'])
  //       this.invalidLogin = false
  //     },
  //     error => {
  //       this.invalidLogin = true

  //     }
  //   )
  //   );

  // }

checkLogin(){
    if(this.username == 'user' && this.password == 'password')
    {
      this.router.navigate(['dashboard']);
    }
    else{
      return;
    }
 }


}
