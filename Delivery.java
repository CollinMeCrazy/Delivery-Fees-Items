
/**
 * Class Delivery conducts math based on Class Project2's input. Also contains getter methods used by Class Project2
 *
 * @author Collins Ramsey
 * @dateStarted 9/19/2022 at 5:27pm
 */
public class Delivery
{
    //private instance variables, most set to avoid null
    private String receiver = "";
    private String origin = "";
    private String item = "";
    private boolean hazardous;
    private double fee = 0.0;
    
    /**
     * Standard Constructor for class Delivery
     */
    public Delivery() {
        
    }
    /**
     * Constructor two for class Delivery. Uses parameters input from Project2, 
     * conducts math
     */
    public Delivery(String receiver, String origin, String item, int numberOfItems,
     int weightPerItemInOz, String hazard) {
        this.receiver = receiver;
        this.origin = origin;
        this.item = item;
        this.fee = fee;
        
        //checks for the String hazard if it is "yes" or "no" and sets hazardous to either true or false
        if (hazard == "yes") 
            hazardous = true;
        else
            hazardous = false;
        
        //total weight of items in oz
        int totalWeight = weightPerItemInOz * numberOfItems;
        
        //checks the weight in oz and adds rates depending on location
        if (receiver.equals("Post Office") || receiver.equals("Patrician's Office")) {
            fee = 0.0;
        }
        //looks at weight between 1-100lbs
        else if (totalWeight <= 1600) {
            if (origin.equals("Ankh-Morpork")) {
                fee = fee + 87.00;
            }
            else if (origin.equals("Pseudopolis")) {
                fee = fee + 165.00;
            }
            else if (origin.equals("Ueberwald")) {
                fee = fee + 997.00;
            }
        }
        //looks at weight between 101-200lbs
        else if (totalWeight <= 3200) {
            if (origin.equals("Ankh-Morpork")) {
                fee = fee + (87.00 * 2);
            }
            else if (origin.equals("Pseudopolis")) {
                fee = fee + (165.00 * 2);
            }
            else if (origin.equals("Ueberwald")) {
                fee = fee + (997.00 * 2);
            }
        }
        //looks at weight 201lbs and above
        else if (totalWeight >= 3201) {
            if (origin.equals("Ankh-Morpork")) {
                fee = fee + (87.00 * 3);
            }
            else if (origin.equals("Pseudopolis")) {
                fee = fee + (165.00 * 3);
            }
            else if (origin.equals("Ueberwald")) {
                fee = fee + (997.00 * 3);
            }
        }
        //if an item is hazardous it adds this 65% fee
        if (hazardous == true) {
            fee = fee + (fee * .65);
        }
    }
    /**
     * Method getReceiver returns the variable receiver as String
     *
     * @param  none
     * @return String
     */
    public String getReceiver() {
       return receiver; 
    }
    /**
     * Method getOrigin returns the variable origin as String
     * 
     * @param none
     * @return String
     */
    public String getOrigin() {
        return origin;
    }
    /**
     * Method getItem returns the variable item as String
     * 
     * @param none
     * @return String
     */
    public String getItem() {
        return item;
    }
    /**
     * Method getHazardous returns variable hazardous as boolean
     * 
     * @param none
     * @return boolean
     */
    public boolean getHazardous() {
        return hazardous;
    }
    /**
     * Method getFee returns varibale fee as double
     * 
     * @param none
     * @return double
     */
    public double getFee() {
        return fee;
    }
}