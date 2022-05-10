import { Routes } from '@angular/router';

import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { ClassManagementComponent } from 'src/app/pages/class-management/class-management.component';
import { EnfantCComponent } from 'src/app/pages/enfant-c/enfant-c.component';
import { EventComponent } from 'src/app/event/event.component';
import { addformcomponent } from 'src/app/add-form/add-form.component';
import { AddReclamationFormComponent } from 'src/app/add-reclamation-form/add-reclamation-form.component';
import { ReclamationComponent } from 'src/app/reclamation/reclamation.component';
import { RendezVousComponent } from 'src/app/rendez-vous-component/rendez-vous-component.component';
import { AddRendezVousFormComponent } from 'src/app/add-rendez-vous-component/add-rendez-vous-component.component';


export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'tables',         component: TablesComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    {path:"class", component:ClassManagementComponent},
    {path:"enfants", component:EnfantCComponent},
    { path: 'event',          component: EventComponent },
    { path: 'add-form',          component: addformcomponent },
    { path: 'reclamation', component:ReclamationComponent},
    { path: 'add-reclamation-form',          component: AddReclamationFormComponent },
    {path: 'rendezvous', component: RendezVousComponent},
    { path: 'add-rendez-vous-form',          component: AddRendezVousFormComponent}
];
