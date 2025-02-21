// See https://aka.ms/new-console-template for more information
string name = Console.ReadLine();
double salary = double.Parse(Console.ReadLine());
double sales = double.Parse(Console.ReadLine());

Console.WriteLine($"TOTAL = R$ {salary + (sales * 0.15):F2}");
