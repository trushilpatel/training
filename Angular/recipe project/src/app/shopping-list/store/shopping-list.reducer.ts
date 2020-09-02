import { Action } from "@ngrx/store";
import { Ingredient } from "../../shared/ingredient.model";
import * as ShoppingListAction from "./shopping-list.action";

export interface State {
  ingredients: Ingredient[];
}

const initialState: State = {
  ingredients: [new Ingredient("Apple", 5), new Ingredient("Orange", 10)],
};

export function shoppingListReducer(
  state = initialState,
  action: ShoppingListAction.ShoppingListActionTypes
) {
  switch (action.type) {
    case ShoppingListAction.ADD_INGREDIENT:
      return {
        ...state,
        ingredients: [...state.ingredients, action.payload],
      };

    case ShoppingListAction.ADD_INGREDIENTS:
      return {
        ...state,
        ingredients: [...state.ingredients, ...action.payload],
      };

    case ShoppingListAction.UPDATE_INGREDIENTS: {
      let ingredient = state.ingredients[action.payload.index];
      let updatedIngredient = { ...ingredient, ...action.payload.ingredient };
      let ingredients = [...state.ingredients];
      ingredients[action.payload.index] = updatedIngredient;

      return { ingredients };
    }

    case ShoppingListAction.DELETE_INGREDIENTS:
      let ingredients = state.ingredients;
      ingredients = ingredients.filter((ingredient, index) => {
        return index != action.payload;
      });

      return { ingredients };

    default:
      console.log("default Shopping list reducer")
      return state;
  }
}
