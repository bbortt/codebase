import { Component, OnInit } from '@angular/core';
import {LoginModel} from "../../model/rest/login/login.model";
import {LoginService} from "../../services/rest/login/login.service";
import {GameSocketService} from '../../services/socket/game/game-socket.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginModel: LoginModel = <LoginModel>{};

  constructor(private loginService: LoginService) { }

  ngOnInit(): void {
  }


  guestLogin() {
    this.loginService.guestLogin().subscribe((response) =>{
      console.log(response);
    });
  }

  login() {
    this.loginService.login(this.loginModel).subscribe((response) =>{
      console.log(response);
    });
  }

  register() {
    this.loginService.register(this.loginModel).subscribe((response) =>{
      console.log(response);
    });
  }
}
