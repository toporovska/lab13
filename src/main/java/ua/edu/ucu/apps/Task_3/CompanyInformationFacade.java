package ua.edu.ucu.apps.Task_3;

public class CompanyInformationFacade {
    public Company retrieveCompanyInformation() {
        String name = PDLReader.readCompanyName();
        String description = PDLReader.readCompanyDescription();
        String logo = PDLReader.readCompanyLogo();
        Company myCompany = new Company(name, description, logo);
        return myCompany;
    }
}
