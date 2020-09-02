import { Component, OnInit, OnDestroy } from "@angular/core";
import { Observable } from "rxjs";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit, OnDestroy {
  private customObservableSubscription;
  constructor() {}

  ngOnInit() {
    const customObservable = Observable.create((observer) => {
      let count = 0;
      setInterval(() => {
        observer.next(count);
        count++;
      }, 1000);
    });

    this.customObservableSubscription = customObservable.subscribe( count => {console.log(count)}, );
  }
  ngOnDestroy(): void {
    console.log("ngOnDestroy")
    this.customObservableSubscription.unsubscribe()
  }
}
