public class Main {
  // 1
  public static double convert(int gallons) {
    double liters = gallons * 3.78541;  // 1 галлон = 3.78541 литра
    return Math.round(liters * 1000.0) / 1000.0;  // Округление до 3 знаков после запятой
  }

  //2
  public static int fitCalc(int minutes, int intensity) {
    return minutes * intensity;
  }
  
  //3
  public static int containers(int boxes, int bags, int barrels) {
    // Коробки содержат по 20 товаров, мешки — 50, бочки — 100
    return (boxes * 20) + (bags * 50) + (barrels * 100);
  }

  //4
  public static String triangleType(int X, int Y, int Z) {
    // Проверяем, можно ли построить треугольник (условие треугольного неравенства)
    if (X + Y <= Z || X + Z <= Y || Y + Z <= X) {
        return "not a triangle";
    }
    
    // Проверяем, является ли треугольник равносторонним
    if (X == Y && Y == Z) {
        return "equilateral";
    }
    
    // Проверяем, является ли треугольник равнобедренным
    if (X == Y || Y == Z || X == Z) {
        return "isosceles";
    }
    
    // Если все стороны разные
    return "different-sided";
  }

  //5
  public static int ternaryEvaluation(int a, int b) {
    // Тернарный оператор: если a больше b, возвращаем a, иначе b
    return a > b ? a : b;
  }

  //6
  public static int howManyItems(int n, double w, double h) {
    // Общая площадь ткани (в квадратных метрах)
    double totalFabric = n * 2;
    // Площадь одного пододеяльника
    double itemArea = w * h;
    // Количество пододеяльников (целое число)
    return (int) (totalFabric / itemArea);
  }

  //7
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
  }

  //8
  public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    // Рекурсивно вызываем функцию с остатков от деления
    return gcd(b, a % b);
  }

  //9
  public static int ticketSaler(int ticketsSold, int finalTicketPrice) {
    double commissionRate = 0.38888889; // 1500/(75600/70)
    // Итоговая цена одного билета с учетом комиссии
    double ticketPrice = finalTicketPrice / (1 + commissionRate);
    // Общая выручка, округленная до целого числа
    return (int) (ticketsSold * ticketPrice) + 1;
  }

  //10
  public static int tables(int students, int currentTables) {
    // Количество столов, которое нужно для размещения всех студентов
    int requiredTables = (int) Math.ceil(students / 2.0);
    // Количество недостающих парт
    int missingTables = requiredTables - currentTables;
    // Если недостающих парт меньше или равно нулю, то нужно 0 дополнительных парт
    return Math.max(missingTables, 0);
  }

  public static void main(String[] args) {
    
  }
}
