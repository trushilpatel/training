test("Simple Summation test", () => {

  expect(5 + 5).toBe(10)
})

test("Async Await summation test", async () => {
  let sum = new Promise(function (resolve, reject) {
    setTimeout(()=>{
      resolve("hello")
    },0)
  })
  expect(await sum).toBe('hello')
})