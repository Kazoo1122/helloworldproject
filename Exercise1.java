import java.util.*;

class Max3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三つの整数の最大値を求めます。");
        System.out.print("aの値：");
        int a = stdIn.nextInt();
        System.out.print("bの値：");
        int b = stdIn.nextInt();
        System.out.print("cの値：");
        int c = stdIn.nextInt();

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("最大値は" + max + "です。");
        stdIn.close();
    }
}

class Max3m {

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
        System.out.println("max3(3,2,1) = " + max3(3, 2, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 1, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 2, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 1, 3));
        System.out.println("max3(3,2,1) = " + max3(3, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 3, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 2, 3));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 1));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
        System.out.println("max3(3,2,1) = " + max3(1, 3, 2));
        System.out.println("max3(3,2,1) = " + max3(2, 3, 3));
        System.out.println("max3(3,2,1) = " + max3(1, 2, 3));
    }
}

class Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("aの値：");
        int a = stdIn.nextInt();
        System.out.print("bの値：");
        int b = stdIn.nextInt();
        System.out.print("cの値：");
        int c = stdIn.nextInt();
        System.out.print("dの値：");
        int d = stdIn.nextInt();

        System.out.println("最大値は" + max4(a, b, c, d));
        stdIn.close();
    }
}

class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("aの値:");
        int a = stdIn.nextInt();
        System.out.print("bの値:");
        int b = stdIn.nextInt();
        System.out.print("cの値:");
        int c = stdIn.nextInt();

        System.out.println("最小値は" + min3(a, b, c));

        stdIn.close();
    }
}

class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("aの値:");
        int a = stdIn.nextInt();
        System.out.print("bの値:");
        int b = stdIn.nextInt();
        System.out.print("cの値:");
        int c = stdIn.nextInt();
        System.out.print("dの値:");
        int d = stdIn.nextInt();

        System.out.println("最小値は" + min4(a, b, c, d));

        stdIn.close();
    }

}

class Median {

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("aの値:");
        int a = stdIn.nextInt();
        System.out.print("bの値:");
        int b = stdIn.nextInt();
        System.out.print("cの値:");
        int c = stdIn.nextInt();

        System.out.println("中央値は" + med3(a, b, c));
        stdIn.close();
    }

}

class Med3 {

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
        System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
        System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
        System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
        System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
        System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
        System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3));
        System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
        System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1));
        System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
        System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
        System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
        System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
    }
}

class JudgeSign {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力せよ：");
        int n = stdIn.nextInt();

        if (n > 0) {
            System.out.println("それは正です。");
        } else if (n < 0) {
            System.out.println("それは負です。");
        } else {
            System.out.println("それは0です。");
        }
        stdIn.close();
    }
}

class SumWhile {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1から" + n + "までの和は" + sum);
        System.out.println(i + "は" + n + "に1加えた数です");
        stdIn.close();
    }
}

class SumFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1から" + n + "までの和は" + sum + "です");
        stdIn.close();
    }
}

class forList {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + " + i);
            }
            sum += i;
        }
        System.out.println(" = " + sum);

        stdIn.close();
    }
}

class SumForEx {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = 0; // 和

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " + ");
            sum += i; // sumにiを加える
        }
        System.out.println("= " + sum);
        stdIn.close();
    }
}

class Gauss {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値：");
        int n = stdIn.nextInt();
        int sum = (1 + n) * n / 2;
        System.out.println("1 から " + n + " までの和は " + sum);
        stdIn.close();
    }
}

class SumGauss {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 和

        System.out.println("1から" + n + "までの和は" + sum + "です。");
        stdIn.close();
    }
}

class SumOf {

    static int sumof(int a, int b) {
        int sum = 0;
        if (a < b) {
            while (a < b) {
                sum += a;
                a++;
            }
            sum += a;
        } else if (a > b) {
            while (a > b) {
                sum += b;
                b++;
            }
            sum += b;
        } else {
            sum = a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("aの値；");
        int a = stdIn.nextInt();
        System.out.print("bの値；");
        int b = stdIn.nextInt();

        System.out.println("aとbの間の全整数の和は" + sumof(a, b));

        stdIn.close();
    }
}