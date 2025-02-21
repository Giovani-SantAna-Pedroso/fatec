const lines = ["Dia 5", "08 : 12 : 23", "Dia 9", "06 : 13 : 23"];

const day1 = {
  day: parseInt(lines[0].split(" ")[1]),
  hour: parseInt(lines[1].split(":")[0]),
  minute: parseInt(lines[1].split(":")[1]),
  second: parseInt(lines[1].split(":")[2]),
};

const day2 = {
  day: parseInt(lines[2].split(" ")[1]),
  hour: parseInt(lines[3].split(":")[0]),
  minute: parseInt(lines[3].split(":")[1]),
  second: parseInt(lines[3].split(":")[2]),
};

const secondsInDay = 24 * 60 * 60;
const secondsInHour = 60 * 60;
const secondsInMinute = 60;

const secondsInDay1 =
  day1.day * secondsInDay +
  day1.hour * secondsInHour +
  day1.minute * secondsInMinute +
  day1.second;

const secondsInDay2 =
  day2.day * secondsInDay +
  day2.hour * secondsInHour +
  day2.minute * secondsInMinute +
  day2.second;

const diference = secondsInDay2 - secondsInDay1;

const daysInDiference = parseInt(diference / secondsInDay);
const hoursInDiference = parseInt(
  (diference - daysInDiference * secondsInDay) / secondsInHour,
);
const minutesInDiference = parseInt(
  (diference -
    daysInDiference * secondsInDay -
    hoursInDiference * secondsInHour) /
    secondsInMinute,
);

const secondsInDiference = parseInt(
  diference -
    daysInDiference * secondsInDay -
    hoursInDiference * secondsInHour -
    minutesInDiference * secondsInMinute,
);

console.log(daysInDiference, "dia(s)");
console.log(hoursInDiference, "hora(s)");
console.log(minutesInDiference, "minuto(s)");
console.log(secondsInDiference, "segundo(s)");
