import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatSelect, MatSelectModule} from '@angular/material/select';
import { ClipboardModule } from 'ngx-clipboard';

import { AdminLayoutRoutes } from './admin-layout.routing';
import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {MatDialogModule} from '@angular/material/dialog';

import { EventComponent } from 'src/app/event/event.component';
import { addformcomponent } from 'src/app/add-form/add-form.component';
import { Reclamation } from 'src/app/Reclamation';
import { ReclamationComponent } from 'src/app/reclamation/reclamation.component';
import { AddReclamationFormComponent } from 'src/app/add-reclamation-form/add-reclamation-form.component';



// import { ToastrModule } from 'ngx-toastr';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    HttpClientModule,
    NgbModule,
    ClipboardModule,
    MatDialogModule,
    FormsModule,
    MatSelectModule,

    
  ],
  declarations: [
    DashboardComponent,
    UserProfileComponent,
    TablesComponent,
    IconsComponent,
    MapsComponent,
    // AddReclamationFormComponent,
    // ReclamationComponent,
    addformcomponent
  ]
})

export class AdminLayoutModule {}
