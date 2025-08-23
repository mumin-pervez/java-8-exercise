package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

class Student {

  int stdId;
  String stdName;

  Student(int stdId, String stdName) {
    this.stdId = stdId;
    this.stdName = stdName;
  }

  @Override
  public String toString() {
    return stdId + " " + stdName;
  }
}

public class CompareToMethod {

  public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<>();
    al.add(new Student(17, "Golam Mawla"));
    al.add(new Student(8, "Pollob Ahmed"));
    al.add(new Student(23, "Ali Rosul"));
    System.out.println(al); // [17 Golam Mawla, 8 Pollob Ahmed, 23 Ali Rosul]

    // Sort based on alphabetical order of stdName
    System.out.println("Sort based on alphabetical order of stdName");
    Collections.sort(al, (s1, s2) -> s1.stdName.compareTo(s2.stdName));
    System.out.println(al);
  }

}
