import { NgModule } from '@angular/core';

// Routing
import { BasicFormsRoutingModule } from './basic-forms-routing.module';

import { BasicFormsComponent } from './basic-forms.component';

@NgModule({
  imports: [
    BasicFormsRoutingModule
  ],
  declarations: [
    BasicFormsComponent
  ]
})
export class BasicFormsModule { }
