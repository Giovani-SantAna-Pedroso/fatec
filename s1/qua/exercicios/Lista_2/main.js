const areaTri = (a, b) => {
  return (a * b) / 2;
};

const solutions = [];

for (let i = 0; i < 20; i++) {
  for (let j = 0; j < 20; j++) {
    if (areaTri(i, j) == 20) solutions.push([i, j]);
  }
}

solutions.forEach((x) => {
  c = 20 - (x[0] + x[1]);
  a = x[0];
  b = x[1];
  // console.log("a", a, "b", b, "c", c);
  a2 = Math.pow(a, 2);
  b2 = Math.pow(b, 2);
  c2 = Math.pow(c, 2);

  console.log("a2", a2, "b2", b2, "c2", c2);
  // if (Math.pow(c, 2) == Math.pow(x[0], 2) + Math.pow(x[1], 2)) {
  //   console.log("a", x[0], "b", x[1], "c", c);
  // }
});
