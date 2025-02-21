// See https://aka.ms/new-console-template for more information
int amout = int.Parse(Console.ReadLine());
int tmp = 0;
int inRange = 0;
int outRange = 0;

for (int i = 0; i < amout; i++)
{
  tmp = int.Parse(Console.ReadLine());
  if (tmp >= 10 && tmp <= 20)
  {
    inRange++;
  }
  else outRange++;
}

Console.WriteLine($"{inRange} in");
Console.WriteLine($"{outRange} out");
