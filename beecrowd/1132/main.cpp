#include <iostream>
#include <memory_resource>
int main() {
  int y{0};
  int x{0};
  int tmp{0};

  int result{0};

  std::cin >> x >> y;
  // std::cin >> y;

  if (x < y) {
    tmp = y;
    y = x;
    x = tmp;
  }

  for (int i = y; i <= x; i++) {
    result += i % 13 == 0 ? 0 : i;
  }

  std::cout << result << '\n';
}
