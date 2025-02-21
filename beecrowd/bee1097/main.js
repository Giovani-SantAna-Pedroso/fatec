let i = 1;
let j = 7;
let tmp = 5;

while (i <= 9) {
  while (j >= tmp) {
    console.log(`I=${i} J=${j}`);
    j -= 1;
  }
  i += 2;
  j = tmp + 4;
  tmp = j - 2;
}
