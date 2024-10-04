// const lines = ["1", "1 2 3 2 1"];
const lines = ["3", "4 1 1 2 1"];
const tea = lines[0];
const guests = lines[1].split(" ");

let correctGuests = 0;

guests.forEach((guest) => {
  if (guest == tea) correctGuests++;
});

console.log(correctGuests);
