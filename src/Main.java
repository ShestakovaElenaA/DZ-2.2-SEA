public class Main {
    public static void main(String[] args) {
double balance = 100;
double depositAmount = 1100;
double bonusPercentage = (depositAmount >= 1000) ? (depositAmount * 0.01) : 0;
double totalAmount = balance + depositAmount + bonusPercentage;
System.out.println( "Итоговая сумма на счету клиента " + totalAmount );
    }
}