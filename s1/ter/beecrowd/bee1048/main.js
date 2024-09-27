const lines = ["400.00"];
// const lines =['800.01']
// const lines =['2000.00']

const salary = parseFloat(lines[0]);
let rate = 1.15;

if (salary <= 400.0) rate = 0.15;
else if (salary <= 800.0) rate = 0.12;
else if (salary <= 1200.0) rate = 0.1;
else if (salary <= 2000.0) rate = 0.07;
else rate = 0.04;

console.log("Novo salario:", (salary * (1 + rate)).toFixed(2));
console.log("Reajuste ganho:", (salary * rate).toFixed(2));
console.log("Em percentual:", (rate * 100).toFixed(0), "%");
