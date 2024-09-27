const lines = ["7", "-5", "6", "-3.4", "4.6", "12"];

let amout = 0;
let total = 0;
let tmp = 0;

for (let i = 0; i < 6; i++) {
  tmp = parseFloat(lines[i]);
  if (tmp > 0) {
    amout++;
    total += tmp;
  }
}

console.log(amout, "valores positivos");
console.log(parseFloat(total / amout).toFixed(1));
