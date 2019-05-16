package problem_solving;

public class GradingStudents {

  static int[] gradingStudents(int[] grades) {

    int[] result = new int[grades.length];

    for (int i = 0; i < grades.length; i++) {
      if (grades[i] < 38) {
        result[i] = grades[i];
      } else {
        int diff = grades[i] % 5;
        if (diff > 2) {
          result[i] = grades[i] + (5 - diff);
        } else {
          result[i] = grades[i];
        }
      }
    }
    return result;
  }
}
