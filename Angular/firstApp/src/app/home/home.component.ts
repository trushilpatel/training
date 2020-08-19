import { Component, OnInit } from "@angular/core";
import { FormsModule } from "@angular/forms";

@Component({
  selector: "app-home",
  templateUrl: "home.component.html",
  styleUrls: ["home.component.css"],
})
export class HomeComponent implements OnInit {
  name: String;
  disabled: boolean = true;

  constructor() {}


  ngOnInit() {
    console.log("Home component NgOnInit");
    this.disabled = true;
    setTimeout(()=>{
      this.disabled = false;
    },2000)
  }

  setName(event) {
    console.log(<HTMLElementEventMap>event.target.value);
  }
}
