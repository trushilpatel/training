import { Component, AfterViewChecked } from "@angular/core";
import { Content } from "@angular/compiler/src/render3/r3_ast";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent implements AfterViewChecked {
  serverElements = [
    {
      type: "server",
      name: 1,
      content: "first",
    },
  ];

  onAdd(event) {
    this.serverElements.push(event)
  }

  ngAfterViewChecked(){
    console.log("FROM APP")
    console.log(this.serverElements)
  }

}
