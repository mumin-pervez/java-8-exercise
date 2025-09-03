package lambdaexpression;

@FunctionalInterface
interface Service {

  String voteCheck(String name, int age, String location);
}

public class VoterEligibilityCheck {

  public static void main(String[] args) {
    Service service = (name, age, location) -> {
      return (age >= 18 && location == "Bangladesh") ? "Eligible for Vote"
          : "Not Eligible for Vote";
    };
    String status1 = service.voteCheck("Nayela", 18, "Bangladesh");
    String status2 = service.voteCheck("Moyna", 14, "Bangladesh");
    System.out.println("Status : " + status1);
    System.out.println("Status : " + status2);
  }

}
