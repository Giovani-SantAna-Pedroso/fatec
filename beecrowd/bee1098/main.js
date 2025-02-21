let i = 0;
let j = 1;
let tmp = 0;

while (i <= 2) {
  for (let x = 0; x < 3; x++) console.log(`I=${i} J=${j + x}`);

  tmp += 1;
  i = parseFloat((0.2 * tmp).toFixed(1));
  i = i == parseInt(i) ? parseInt(i) : i;
  j = parseFloat((1 + i).toFixed(1));
  j = j == parseInt(j) ? parseInt(j) : j;
}
