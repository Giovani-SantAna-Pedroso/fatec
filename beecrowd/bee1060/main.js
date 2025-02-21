lines = [7, -5, 6, -3.4, 4.6, 12];

let possitives = 0;
lines.forEach((element) => {
  if (parseInt(element) > 0) possitives++;
});

console.log(`${possitives} valores positivos`);
