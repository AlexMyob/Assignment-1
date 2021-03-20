import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";

    public static void main(String args[]) {
        BufferedReader br = null;
        try {
            //Reading the csv file
            br = new BufferedReader(new FileReader("portfolio_template.csv"));

            //Create List for holding Company objects
            List<Company> companyList = new ArrayList<Company>();

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) {
                String[] companyDetails = line.split(COMMA_DELIMITER);

                if (companyDetails.length > 0) {
                    //Save the Company details in Company object
                    Company cmp = new Company(companyDetails[0],
                            companyDetails[1], companyDetails[2],
                            companyDetails[3], Double.parseDouble(companyDetails[4]),
                            Double.parseDouble(companyDetails[5]),
                            Double.parseDouble(companyDetails[6]),
                            companyDetails[7],
                            Boolean.parseBoolean(companyDetails[8]), companyDetails[9]);
                    companyList.add(cmp);
                }
            }

            //Lets print the Company List
            for (Company c : companyList) {
                System.out.println(c.getDate() + "   " + c.getType() + "   "
                        + c.getShares() + "   " + c.getPrice() + "	" + c.getCosts() +
                        "	" + c.getTotal() + "	" + c.getCurrency() + "	" +
                        c.isCashAffected() + "	" + c.getName());
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ie) {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }
}