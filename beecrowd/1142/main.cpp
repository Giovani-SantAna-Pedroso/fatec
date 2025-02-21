#include <iostream>
int main() {
  int line;
  std::cin >> line;

  for (int i = 0; i < line; i++) {

    std::cout << 1 + i * 4 << " " << 2 + i * 4 << " " << 3 + i * 4 << " PUM\n";
  };

  return 0;
}
