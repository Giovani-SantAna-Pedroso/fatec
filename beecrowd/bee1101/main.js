const lines = ["5 2", "6 3", "8 4", "4 8", "5 0"];

let first = 0;
let second = 0;
let ans = "";
let sum = 0;

for (let i = 0; ; i++) {
  [first, second] = lines[i].split(" ").map((x) => parseInt(x));
  if (first > second) {
    first = first + second;
    second = first - second;
    first = first - second;
  }

  let ans = "";
  let sum = 0;

  for (let j = first; j <= second; j++) {
    ans += j + " ";
    sum += j;
  }

  if (first <= 0 || second <= 0) break;

  console.log(`${ans}Sum=${sum}`);
}
