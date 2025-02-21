const lines = ["3", "6.5 4.3 6.2", "5.1 4.2 8.1", "8.0 9.0 10.0"];

let reads = parseInt(lines["0"]);

for (let i = 1; i <= reads; i++) {
  const tmp = lines[i].split(" ").map((x) => parseFloat(x));
  const avr = (tmp[0] * 2 + tmp[1] * 3 + tmp[2] * 5) / 10;
  console.log(avr.toFixed(1));
}
