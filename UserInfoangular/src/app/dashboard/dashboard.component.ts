import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {


  userdata: any = [];
  temparray: any =[];
  constructor(
    private userservice:UserService
    ) { }

  ngOnInit() {

    this.getInfo();
  }
  getInfo() {
    
    this.userservice.get(1).subscribe(
      res=>{
      debugger
      this.userdata = res;        
      this.temparray.push(this.userdata);
      },
      error=>{

      }
    );

  }


  

  
}
