#include <iostream>
int main() {
  int a{0};
  int n{0};

  while (a <= 0)
    std::cin >> a;
  while (n <= 0)
    std::cin >> n;
  std::cout << (n * (2 * a + (n - 1))) / 2 << '\n';
}
