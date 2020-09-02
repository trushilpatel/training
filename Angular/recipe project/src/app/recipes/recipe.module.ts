import { NgModule } from "@angular/core";

import { RecipesComponent } from "./recipes.component";
import { RecipeEditComponent } from "./recipe-edit/recipe-edit.component";
import { RecipeDetailComponent } from "./recipe-detail/recipe-detail.component";
import { RecipeStartComponent } from "./recipe-start/recipe-start.component";
import { RecipeRoutes } from "./recipe-routers.component";
import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { AuthInterceptorService } from "../auth/auth-interceptor.service";
import { RecipeListComponent } from "./recipe-list/recipe-list.component";
import { RouterModule } from "@angular/router";
import { CommonModule } from "@angular/common";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { RecipeItemComponent } from "./recipe-list/recipe-item/recipe-item.component";
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [
    RecipesComponent,
    RecipeEditComponent,
    RecipeDetailComponent,
    RecipeStartComponent,
    RecipeListComponent,
    RecipeItemComponent,
  ],
  imports: [
    RouterModule,
    RecipeRoutes,
    SharedModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptorService,
      multi: true,
    },
  ],

  exports: [
    RecipesComponent,
    RecipeListComponent,
    RecipeEditComponent,
    RecipeDetailComponent,
    RecipeStartComponent,
    RecipeItemComponent,
  ],
})
export class RecipeModule {}
