const lines = ["4", "-5", "0", "3", "-4"];

const amont = parseInt(lines[0]);
for (let i = 1; i <= amont; i++) {
  const n = lines[i];

  let msg = "";
  if (n === 0) {
    console.log("NULL");
    continue;
  }

  n % 2 ? (msg += "ODD ") : (msg += "EVEN ");
  n > 0 ? (msg += "POSITIVE") : (msg += "NEGATIVE");

  console.log(msg);
}
