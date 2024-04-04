package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.FloralType;

public class FloralService extends Service {
  // fields
  private String floralTypeName;
  private FloralType floralType;

  // Constructor for the FloralService class
  public FloralService(
      String serviceName,
      int cost,
      String floralTypeName,
      FloralType floralType,
      String bookingReference) {
    super(serviceName, cost);
    this.floralType = floralType;
    this.floralTypeName = floralTypeName;
    String addServiceSuccessfulMessage =
        MessageCli.ADD_SERVICE_SUCCESSFUL.getMessage(
            serviceName + " (" + floralTypeName + ")", bookingReference);
    System.out.println(addServiceSuccessfulMessage);
  }

  // Getter method for the floral type name
  public String getFloralTypeName() {
    return floralTypeName;
  }

  // Getter method for the floral type
  public FloralType getFloralType() {
    return floralType;
  }

  // method to multiply the cost of the catering service by the number of attendees
  public int calculateCost(int attendeeCount) {
    return this.getCost();
  }
}
