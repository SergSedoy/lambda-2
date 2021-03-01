package javaCore.homework1_1;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        //причина возникновения ошибки: ArithmeticException (исключение при выполнении математической операции);
        // в чем заключается ошибка: а=3 b=0 - на нуль делить нельзя;
        // способы ее решения: 1. необходимо сделать обработку исключения деления на нуль;
        //                     2. перед делением выполнить проверку, 'a' = 0 или нет, если равно нулю - вывести соответствующее сообщение.
        int d = calc.multiply.apply(3,3);
        int x = calc.pow.apply(10);
        int y = calc.abs.apply(-789);
        boolean z = calc.isPositive.test(y);

        calc.println.accept(a);
        calc.println.accept(b);

        if (c < 0) {
            System.out.println("'b' = 0, деление на нуль запрещено!!!");
        } else {
            calc.println.accept(c);
        }
        calc.println.accept(d);
        calc.println.accept(x);
        calc.println.accept(y);
        calc.print.accept(z);
    }
}
