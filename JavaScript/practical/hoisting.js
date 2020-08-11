// foo(); // 1

// function foo() {
//   console.log(1);
// }

// var foo;

// foo = function () {
//   console.log(2);
// };


var a = true;
if (a) {
  let b = 10
  function foo() { console.log("a"); }
}
else {
  foo()
  function foo() { console.log("b"); }
}
foo(); // "b"
