import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  uUsernameCtrl: FormControl;
  uPasswordCtrl: FormControl;

  loginForm: FormGroup;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.uUsernameCtrl = this.fb.control('', Validators.required);
    this.uPasswordCtrl = this.fb.control('', Validators.required);
    this.loginForm = this.fb.group({
      u_username: this.uUsernameCtrl,
      u_password: this.uPasswordCtrl
    });
  }

  register(): void {
    
  }
}
