// See https://aka.ms/new-console-template for more information
string numbers = Console.ReadLine();
string[] numbersArr = numbers.Split(' ');

double a = double.Parse(numbersArr[0]);
double b = double.Parse(numbersArr[1]);
double c = double.Parse(numbersArr[2]);

double delta = (b * b) - (4 * a * c);

if (delta < 0 || a == 0) Console.WriteLine("Impossivel calcular");
else
{
  double x1 = ((-1 * b) + Math.Sqrt(delta)) / (2 * a);
  double x2 = ((-1 * b) - Math.Sqrt(delta)) / (2 * a);

  Console.WriteLine($"R1 = {x1:F5}");
  Console.WriteLine($"R2 = {x2:F5}");
}
