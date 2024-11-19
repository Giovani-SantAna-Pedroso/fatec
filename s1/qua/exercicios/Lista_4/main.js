const ans = [];
for (let i = 290; i <= 5878; i++) {
  if (Number.isInteger(Math.sqrt(i))) ans.push(i);
}

console.log(ans);
console.log(ans.length);
