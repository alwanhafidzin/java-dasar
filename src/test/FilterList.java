package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);

        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
        List<Customer> customersWithMoreThan100Points = customers
                .stream()
                .filter(c -> c.getPoints() == 200)
                .collect(Collectors.toList());
       for(int i=0; i< customersWithMoreThan100Points.size(); i++){
           System.out.println(customersWithMoreThan100Points.get(i).getName() + " : "+ customersWithMoreThan100Points.get(i).getPoints());
       }
    }
}
