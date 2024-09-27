// See https://aka.ms/new-console-template for more information
string val1Str = Console.ReadLine();
double val1 = double.Parse(val1Str);

string val2Str = Console.ReadLine();
double val2 = double.Parse(val2Str);

double averge = ((val1 * 3.5) + (val2 * 7.5)) / 11;

Console.WriteLine($"MEDIA = {averge:F5}");
