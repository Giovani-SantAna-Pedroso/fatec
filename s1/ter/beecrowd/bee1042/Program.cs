using System;
using System.Linq;

string[] input = Console.ReadLine().Split(' ');
int[] nums = input.Select(x => int.Parse(x)).ToArray();
int[] cpNums = new int[nums.Length];

Array.Copy(nums, cpNums, nums.Length);

Array.Sort(nums);

foreach (int i in nums)
{
  Console.WriteLine(i);
}

Array.Sort(nums, (x, y) => y.CompareTo(x));

Console.WriteLine();

foreach (int i in cpNums)
{
  Console.WriteLine(i);
}
