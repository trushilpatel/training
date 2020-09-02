import {
  Component,
  OnInit,
  Output,
  EventEmitter,
  AfterViewChecked,
} from "@angular/core";

@Component({
  selector: "app-cockpit",
  templateUrl: "./cockpit.component.html",
  styleUrls: ["./cockpit.component.css"],
})
export class CockpitComponent implements OnInit, AfterViewChecked {
  @Output() serverCreated = new EventEmitter<{
    type: string;
    name: String;
    content: string;
  }>();
  @Output() bluePrintCreated = new EventEmitter<{
    type: string;
    name: String;
    content: string;
  }>();

  newName = "";
  newContent = "";
  data = {
    type: "server",
    name: this.newName,
    content: this.newContent,
  };

  ngAfterViewChecked() {
    console.log("View : ");
    console.log(this.data)
  }

  constructor() {}
  ngOnInit(): void {}

  onAddServer() {
    this.serverCreated.emit(this.data);
    console.log("onaddserver");
  }

  onAddBlueprint() {
    this.bluePrintCreated.emit({
      type: "blueprint",
      name: this.newName,
      content: this.newContent,
    });
  }
}
