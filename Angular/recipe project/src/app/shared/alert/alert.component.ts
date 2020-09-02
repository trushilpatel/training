import { Component, OnInit, Input, Output, EventEmitter } from "@angular/core";
import { Subject } from 'rxjs';

@Component({
  selector: "app-alert",
  templateUrl: "./alert.component.html",
  styleUrls: ["./alert.component.css"],
})
export class AlertComponent implements OnInit {
  @Input() errorMessage: string;
  @Output() public closed = new EventEmitter<boolean>();

  constructor() {
    this.closed.emit(false)
  }

  ngOnInit() {}

  close() {
    this.closed.emit(true);
  }
}
