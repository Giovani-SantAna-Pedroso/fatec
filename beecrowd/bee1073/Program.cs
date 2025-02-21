// See https://aka.ms/new-console-template for more information
int n = int.Parse(Console.ReadLine());

for (int i = 2; i <= n; i += 2) Console.WriteLine($"{i}^2 = {i * i}");
