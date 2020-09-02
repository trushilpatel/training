import { Component, OnInit } from "@angular/core";
import { Recipe } from '../recipe.model';

@Component({
  selector: "app-recipe-list",
  templateUrl: "./recipe-list.component.html",
  styleUrls: ["./recipe-list.component.css"],
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [ new Recipe(
    "Pani Puri",
    "wohooo...",
    "https://i2.wp.com/www.vegrecipesofindia.com/wp-content/uploads/2010/08/pani-puri-recipe-1-480x270.jpg"
  )
];
  constructor() {}

  ngOnInit(): void {}
}
