// here i is undefined so no error and no for loop execution occurs 
for( var i; i < 5; i++){
  console.log(i)
}

console.log(Number(undefined))

for( var i=0; i < 5; i++){
  console.log(i)
}
console.log("Outside ths for loop " + i)