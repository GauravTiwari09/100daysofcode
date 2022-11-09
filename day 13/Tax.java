public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income,tax;
        income = sc.nextInt();
        if (income<500000) {
            tax=0;
        }
            else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.02);
        }
            else {
            tax = (int) (income * 0.03);
        }
        System.out.println("your tax is :" + tax);

        }
            }
