package ua.edu.ucu.apps.Task_3;

public class Main {
    public static void main(String[] args) {
        CompanyInformationFacade facade = new CompanyInformationFacade();
        Company company = facade.retrieveCompanyInformation();

        System.out.println(company);
    }
}