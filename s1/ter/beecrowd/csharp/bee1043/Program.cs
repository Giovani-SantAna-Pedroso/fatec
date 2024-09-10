// See https://aka.ms/new-console-template for more information
var nums = Console.ReadLine().Split(' ').Select(x => float.Parse(x)).ToArray();
float a = nums[0];
float b = nums[1];
float c = nums[2];

if (((a + b) > c) && ((c + b) > a) && ((a + c) > b))
{
  Console.WriteLine($"Perimetro = {(a + b + c):F1}");
}
else
{
  Console.WriteLine($"Area = {(a + b) * c / 2:F1}");
}
