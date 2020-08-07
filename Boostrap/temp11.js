async function calc(){
  let total = 0;
  for (let i=0;i<1000; i++){
    total+=i
  }
  console.log(total)
  return total
}

console.log("Fucnction is called")
calc().then(()=>{
  console.log("hello")
})
const c = await calc()
console.log("Funciton ended")