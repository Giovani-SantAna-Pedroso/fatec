// See https://aka.ms/new-console-template for more information
String[] userInput = Console.ReadLine().Split(' ');

float a = float.Parse(userInput[0]);
float b = float.Parse(userInput[1]);
float c = float.Parse(userInput[2]);
float tmp = 0;

// rearenge thenumbers
if (a < b)
{
  tmp = a;
  a = b;
  b = tmp;
}
if (a < c)
{
  tmp = a;
  a = c;
  c = tmp;
}


if (a >= (b + c))
{
  Console.WriteLine("NAO FORMA TRIANGULO");
  return;
}
else if ((a * a) == ((b * b) + (c * c))) Console.WriteLine("TRIANGULO RETANGULO");
else if ((a * a) > ((b * b) + (c * c))) Console.WriteLine("TRIANGULO OBTUSANGULO");
else if ((a * a) < ((b * b) + (c * c))) Console.WriteLine("TRIANGULO ACUTANGULO");

if (a == b && b == c) Console.WriteLine("TRIANGULO EQUILATERO");
else if ((a == b && b != c) || (a == c && b != c) || (c == b && b != a)) Console.WriteLine("TRIANGULO ISOSCELES");
