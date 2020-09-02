import { NgModule } from "@angular/core";

import { ShoppingListComponent } from "./shopping-list.component";
import { ShoppingEditComponent } from "./shopping-edit/shopping-edit.component";
import { ShoppingRoutes } from "./shopping-routes.component";
import { SharedModule } from "../shared/shared.module";
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [ShoppingListComponent, ShoppingEditComponent],
  imports: [ShoppingRoutes, SharedModule ],
  exports: [ShoppingEditComponent, ShoppingListComponent],
})
export class ShoppingModule {}
