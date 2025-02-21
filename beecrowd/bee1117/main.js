const lines = ["-3.5", "3.5", "11.0", "10.0"];

const validGrades = [];

for (let grade of lines) {
  const tmp = parseFloat(grade);

  if (tmp < 0 || tmp > 10) {
    console.log("nota invalida");
    continue;
  }

  validGrades.push(tmp);
  if (validGrades.length == 2) break;
}

console.log(`media = ${(validGrades[0] + validGrades[1]) / 2}`);
