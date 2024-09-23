public class CatRunner {
    public static void main(String[] args) {
      Cat cat1 = new Cat("CaseOh", 24, 500.5);
      cat1.introduce();
      cat1.printCatInfo();

      Cat cat2 = new Cat("Joe", 17, 150.5);
      cat2.printCatInfo();
      cat2.introduce();
     

}
}