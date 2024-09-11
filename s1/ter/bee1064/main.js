const lines = ["7", "-5", "6", "-3.4", "4.6", "12"];

let amout = 0;
let total = 0;

const n0 = parseFloat(lines[0]);
const n1 = parseFloat(lines[1]);
const n2 = parseFloat(lines[2]);
const n3 = parseFloat(lines[3]);
const n4 = parseFloat(lines[4]);
const n5 = parseFloat(lines[5]);

if (n0 > 0) {
  total++;
  amout += n0;
}
if (n1 > 0) {
  total++;
  amout += n1;
}
if (n2 > 0) {
  total++;
  amout += n2;
}
if (n3 > 0) {
  total++;
  amout += n3;
}
if (n4 > 0) {
  total++;
  amout += n4;
}
if (n5 > 0) {
  total++;
  amout += n5;
}

console.log(total, "valores positivos");
console.log(parseFloat(amout / total).toFixed(1));
