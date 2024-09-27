// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");

int n = 1234;

string binary = Convert.ToString(n, 2);

int totalOnes = 0;
foreach (char i in binary)
{
  if (i == '1') totalOnes++;
}
return totalOnes;
