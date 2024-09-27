String[] userInput = Console.ReadLine().Split(' ');
int first = int.Parse(userInput[0]);
int secondN = int.Parse(userInput[1]);

if (first < secondN) Console.WriteLine($"O JOGO DUROU {secondN - first} HORA(S)");
if (first >= secondN) Console.WriteLine($"O JOGO DUROU {24 - first + secondN} HORA(S)");


