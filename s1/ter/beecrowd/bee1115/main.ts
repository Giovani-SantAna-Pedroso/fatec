const lines = ["2 2", "3 -2", "-8 -1", "-7 1", "0 2 "];

for (let i = 0; ; i++) {
  const [fistN, secondN] = lines[i].split(" ").map((x) => parseInt(x));

  if (fistN === 0 || secondN === 0) break;

  if (fistN > 0) {
    if (secondN > 0) console.log("primeiro");
    else console.log("quarto");
  } else {
    if (secondN > 0) console.log("segundo");
    else console.log("terceiro");
  }
}
