const lines = ["0", "1", "3", "4", "5", "6", "7", "8", "123", "1123"];
const numb = { num: 0, index: 0 };
const max = lines.length;

for (let i = 0; i <= max; i++) {
  if (parseInt(lines[i]) > numb.num) {
    numb.num = lines[i];
    numb.index = i + 1;
  }
}

console.log(numb.num);
console.log(numb.index);
