public class DepartmentPermutation {

  public static void main(String[] args) {

    for (int fireNum = 1; fireNum < 7; fireNum++) {
      for (int policNum = 1; policNum < 7; policNum++) {
        for (int sanityNum = 1; sanityNum < 7; sanityNum++) {
          if (isValid(fireNum, policNum, sanityNum)) {
            System.out.println("FIRE:" + fireNum + ",POLICE:" + policNum + ",SANITY:" + sanityNum);
          }
        }
      }
    }
  }

  public static boolean isValid(int fire,int police , int sanity) {
    return fire != police && police != sanity && sanity != fire
           && police%2 == 0 && fire+police+sanity == 12;
  }
}
