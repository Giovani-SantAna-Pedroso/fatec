// See https://aka.ms/new-console-template for more information
int num = int.Parse(Console.ReadLine());

for (int i = num % 2 == 0 ? num + 1 : num; i <= num + 12; i += 2)
{
  Console.WriteLine(i);
}
