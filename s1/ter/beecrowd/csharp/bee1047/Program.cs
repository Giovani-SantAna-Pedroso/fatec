String[] userInput = Console.ReadLine().Split(' ');
int first = int.Parse(userInput[0]);
int secondN = int.Parse(userInput[1]);
int thirdN = int.Parse(userInput[2]);
int fourthN = int.Parse(userInput[3]);

int time1 = first * 60 + (secondN);
int time2 = thirdN * 60 + (fourthN);

if (time1 < time2) Console.WriteLine($"O JOGO DUROU {(time2 - time1) / 60} HORA(S) E {(time2 - time1) % 60} MINUTO(S)");
else if (time1 > time2) Console.WriteLine($"O JOGO DUROU {(1440 - time1 + time2) / 60} HORA(S) E {60 + ((time2 - time1) % 60)} MINUTO(S)");
else Console.WriteLine("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");

