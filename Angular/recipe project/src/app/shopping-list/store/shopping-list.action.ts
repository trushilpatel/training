import { Action } from "@ngrx/store";
import { Ingredient } from "../../shared/ingredient.model";

export const ADD_INGREDIENT = "[Shopping-List] ADD_INGREDIENT";
export const ADD_INGREDIENTS = "[Shopping-List] ADD_INGREDIENTS";
export const DELETE_INGREDIENTS = "[Shopping-List] DELETE_INGREDIENTS";
export const UPDATE_INGREDIENTS = "[Shopping-List] UPDATE_INGREDIENTS";

export class AddIngredient implements Action {
  readonly type = ADD_INGREDIENT;
  constructor(public payload: Ingredient) {}
}

export class AddIngredients implements Action {
  readonly type = ADD_INGREDIENTS;
  constructor(public payload: Ingredient[]) {}
}

export class DeleteIngredient implements Action {
  readonly type = DELETE_INGREDIENTS;
  constructor(public payload: number) {}
}

export class UpdateIngredients implements Action {
  readonly type = UPDATE_INGREDIENTS;
  constructor(public payload: { index: number; ingredient: Ingredient }) {}
}

export type ShoppingListActionTypes =
  | AddIngredient
  | AddIngredients
  | DeleteIngredient
  | UpdateIngredients;
