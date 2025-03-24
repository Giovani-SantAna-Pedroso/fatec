#include <iostream>
int main() {
  int x;
  int y;

  std::cin >> x >> y;

  for (int i = 1; i <= y; i += x) {
    std::cout << i;

    for (int j = i + 1; (j <= i + x - 1); j++) {
      std::cout << ' ' << j;
    }
    std::cout << '\n';
  }
}
