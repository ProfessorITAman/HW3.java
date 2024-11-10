public class HW3 {
        public static void main(String[] args) {
            double[] numbers = {1.2, 2.5, -3.4, 4.6, -2.1, 3.3, -5.0, 6.8, 1.9, -7.3, 2.6, 8.0, -6.4, 9.1, 3.2};
            boolean foundNegative = false;
            double sum = 0.0;
            int count = 0;
            for (double number : numbers) {
                if (foundNegative) {
                    if (number > 0) {
                        sum += number;
                        count++;
                    }
                } else if (number < 0) {
                    foundNegative = true;
                }
            }
            double average = (count > 0) ? (sum / count) : 0;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        }
    }