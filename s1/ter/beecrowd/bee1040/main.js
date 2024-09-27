const lines = ["2.0 4.0 7.5 8.0", "6.4"];
// const lines = ["2.0 6.5 4.0 9.0", "6.4"];
// const lines = ["9.0 4.0 8.5 9.0", "6.4"];

const grades = lines[0].split(" ").map((x) => parseFloat(x));

const averge =
  (grades[0] * 2 + grades[1] * 3 + grades[2] * 4 + grades[3] * 1) / 10;

console.log("Media:", averge.toFixed(1));

if (averge >= 7.0) console.log("Aluno aprovado.");
else if (averge >= 5) {
  console.log("Aluno em exame.");
  const examGrade = parseFloat(lines[1]);
  console.log("Nota do exame:", examGrade.toFixed(1));
  const finalAverge = (examGrade + averge) / 2;
  if (finalAverge > 5) console.log("Aluno aprovado.");
  else console.log("Aluno reprovado.");
  console.log("Media final:", finalAverge.toFixed(1));
} else console.log("Aluno reprovado.");
