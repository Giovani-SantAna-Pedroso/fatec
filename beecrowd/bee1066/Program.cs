// See https://aka.ms/new-console-template for more information

int amoutEvens = 0;
int amoutOdds = 0;
int amoutPositives = 0;
int amoutNegatives = 0;

for (int i = 0; i < 5; i++)
{
  int number = int.Parse(Console.ReadLine());

  if (number % 2 == 0) amoutEvens++;
  else amoutOdds++;

  if (number > 0) amoutPositives++;
  else if (number < 0) amoutNegatives++;

}

Console.WriteLine($"{amoutEvens} valor(es) par(es)");
Console.WriteLine($"{amoutOdds} valor(es) impar(es)");
Console.WriteLine($"{amoutPositives} valor(es) positivo(s)");
Console.WriteLine($"{amoutNegatives} valor(es) negativo(s)");
