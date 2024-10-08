// my main challenge for this code was getting the setter method to work. I originally combined the default constructor and the 
// setter as 'TaxTableTools table = new TaxTabeTools(salary, taxTable);' but it was better to separate it to 'TaxTableTools table = new TaxTableTools();' and 
// 'table.setTable(salary,taxTable);' because i realized that the constructor is used for initializing objects with its default stae, while setter methods allows
// more flexibility in updating or modifying that state later on and I have had them written together making the code create errors.

import java.util.Scanner;

public class IncomeTaxMain {

    // Method to prompt for and input an integer
    public static int getInteger(Scanner input, String prompt) {
        int inputValue;

        System.out.println(prompt + ": ");
        inputValue = input.nextInt();

        return inputValue;
    } //

    // ***********************************************************************

    public static void main(String [] args) {
        final String PROMPT_SALARY = "\nEnter annual salary (-1 to exit)";
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;

        int [] salary = { 0, 30000, 60000, Integer.MAX_VALUE }; // custom salary ranges
        double [] taxTable = { 0.0, 0.25, 0.35, 0.45 }; // custom tax rates

        // default constructor
        TaxTableTools table = new TaxTableTools();

        // calls setter method tp update table with custom slary ranges and tax rates
        table.setTables(salary, taxTable); // set custom tables


        // Get the first annual salary to process
        annualSalary = getInteger(scnr, PROMPT_SALARY);

        while (annualSalary >= 0) {
            taxRate = table.getValue(annualSalary);
            taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
            System.out.println("Annual Salary: " + annualSalary +
                    "\tTax rate: " + taxRate +
                    "\tTax to pay: " + taxToPay);

            // Get the next annual salary
            annualSalary = getInteger(scnr, PROMPT_SALARY);
        }
    }
} 
