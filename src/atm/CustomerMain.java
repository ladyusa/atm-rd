package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","2345");

        Bank bank = new Bank("My Bank", new WebServiceDatasource());
        bank.addCustomer(peter);
        bank.addCustomer(nancy);
        System.out.println(bank);

        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"1234");
        atm.deposit(1000);
        System.out.println(  peter  );

        atm.transfer(2, 200);
        System.out.println(  peter  );
        System.out.println(  nancy  );
    }
}
