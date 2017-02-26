import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
declare var $: any;

@Component({
  templateUrl: 'login.component.html'

})

export class LoginComponent {

  constructor() { }
  
  form = new FormGroup({
    userName: new FormControl('', Validators.minLength(1)),
    password: new FormControl('', Validators.minLength(1))
  });

  get userName(): any { return this.form.get('userName'); }
  
  get password(): any { return this.form.get('password'); }


  register(event) {
    location.href = '#/pages/register';
  }

  doLogin() {
    console.log(this.form.value);
  }

  forgotPassword(event) {
    // TODO
    console.log('Forgot Password', event);
  }

}
