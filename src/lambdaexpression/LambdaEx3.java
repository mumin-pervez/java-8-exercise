package lambdaexpression;

@FunctionalInterface
interface LoginService {

  String login(String userName, String password);
}

public class LambdaEx3 {

  String userName, password;

  public static void main(String[] args) {
    LoginService loginService = (userName, password) -> {
      return (userName == "mumin" && password == "Admin123") ? "Login Success" : "Login Failed";
    };
    String loginInfo = loginService.login("mumin", "Admin123");
    System.out.println(loginInfo);
  }

}
