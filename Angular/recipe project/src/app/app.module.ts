import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from "./app.component";
import { HeaderComponent } from "./header/header.component";
import { ShoppingListComponent } from "./shopping-list/shopping-list.component";
import { ShoppingEditComponent } from "./shopping-list/shopping-edit/shopping-edit.component";
import { ShoppingListService } from "./shopping-list/shopping-list.service";
import { AppRoutingModule } from "./app-routing.module";
import { RecipeService } from "./recipes/recipe.service";
import { AuthComponent } from "./auth/auth.component";
import { AlertComponent } from "./shared/alert/alert.component";
import { RecipeModule } from "./recipes/recipe.module";
import { SharedModule } from './shared/shared.module';
import { ShoppingRoutes } from './shopping-list/shopping-routes.component';
import { ShoppingModule } from './shopping-list/shopping.module';
import { StoreModule } from '@ngrx/store';
import { shoppingListReducer } from './shopping-list/store/shopping-list.reducer';
import * as fromApp from './store/app.reducer';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AuthComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    RecipeModule,
    SharedModule,
    ShoppingModule,
    StoreModule.forRoot(fromApp.appReducer)

  ],
  providers: [ShoppingListService, RecipeService],
  bootstrap: [AppComponent],
  entryComponents: [AlertComponent],
})
export class AppModule {}
